package jjfactory.mybatis.repository;

import jjfactory.mybatis.model.Board;
import jjfactory.mybatis.model.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository {
    void save(Board board);
    List<Board> getAllBoard();
    Board findById(int id);
    void deleteById(int id);
    void update(Board board);
}
