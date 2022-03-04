package jjfactory.mybatis.config.interceptor;

import jjfactory.mybatis.handler.MyRoleException;
import jjfactory.mybatis.handler.MySessionException;
import jjfactory.mybatis.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Slf4j
public class RoleInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        User principal = (User) session.getAttribute("principal");

        if(principal == null){
            log.info("인증 안된 유저입니다");
            throw new MySessionException();
        }else{
            if(!principal.getRole().equals("ADMIN")){
                log.info("권합 없음");
                throw new MyRoleException();
            }
        }
        return true;
    }
}
