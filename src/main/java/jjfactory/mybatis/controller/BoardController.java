package jjfactory.mybatis.controller;

import jjfactory.mybatis.model.Board;
import jjfactory.mybatis.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class BoardController {
    private final BoardService boardService;

    @PostMapping("board")
    public ResponseEntity<?> write(Board board){
        boardService.write(board);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("board/{id}")
    public ResponseEntity<?> update(@RequestBody Board board){
        boardService.update(board);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("board/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        boardService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
