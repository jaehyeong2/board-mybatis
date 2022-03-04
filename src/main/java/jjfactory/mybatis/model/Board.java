package jjfactory.mybatis.model;

import lombok.*;

import java.sql.Timestamp;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Board {
    private int id;
    private String title;
    private String content;
    private int user_id;
    private Timestamp createDate;
}
