package jjfactory.mybatis.config.interceptor;

import jjfactory.mybatis.model.User;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

public class SessionInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        User principal = (User) session.getAttribute("principal");

        if(principal == null){
            response.setContentType("text/html; charset=utf-8");
            PrintWriter out = response.getWriter();
            out.print("<script>");
            out.print("alert('로그인이 필요합니다.');");
            out.print("location.href='/auth/loginForm';");
            out.print("</script>");
            return false; //더이상 진입 안됨. 바로 response 됨
        }
        return true;
    }
}
