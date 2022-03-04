package jjfactory.mybatis.service;


import jjfactory.mybatis.model.Board;
import jjfactory.mybatis.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public void write(Board board) {
        boardRepository.save(board);
    }

    public void delete(int id) {
        boardRepository.deleteById(id);
    }

    public void update(Board board) {
        boardRepository.update(board);
    }

    @Transactional(readOnly = true)
    public List<Board> boardList() {
        return boardRepository.getAllBoard();
    }

//    @Transactional(readOnly = true)
//    public PostDetailRespDto boardDetails(int id) {
//        return boardRepository.findById(id);
//    }

}
