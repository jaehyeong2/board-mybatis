package jjfactory.mybatis.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostDetailResDto {
    private int id;
    private String title;
    private String content;
    private String username;
}
