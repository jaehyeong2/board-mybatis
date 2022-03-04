package jjfactory.mybatis.model;

import lombok.*;

import java.sql.Timestamp;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Comment {
    private int id;
    private String content;

    private int user_id;
    private int board_id;
    private Timestamp createDate;
}
