package com.study.board.controller;

import com.study.board.entity.Post;
import com.study.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write") //localhost:8080/board/write
    public String boardWriteForm(){

        return "boardwrite";
    }

    @PostMapping("/board/writepro")
    public String boardWritePro(Post post, Model model){

        boardService.write(post);

        model.addAttribute("message", "글 작성이 완료되었습니다.");
        model.addAttribute("searchUrl", "/board/list");

        return "message";
    }

    @GetMapping("/board/list")
    public List<Post> boardList(Model model){

        List<Post> list = boardService.boardList();

        model.addAttribute("list", list);

        return list;
    }

    @GetMapping("/board/view") //localhost:8080/board/view?id=1
    public String boardView(Model model, Integer id){

        model.addAttribute("board", boardService.boardView(id));
        return "boardview";
    }

    @GetMapping("/board/delete")
    public String boardDelete(Integer id){

        boardService.boardDelete(id);
        return "redirect:/board/list";
    }

    @GetMapping("/board/modify/{id}")
    public String boardModify(@PathVariable("id") Integer id, Model model){

        model.addAttribute("board", boardService.boardView(id));
        return "boardmodify";
    }

    @PostMapping("/board/update/{id}")
    public String boardUpdate(@PathVariable("id") Integer id, Post board, Model model){

        Post postTemp = boardService.boardView(id);
        postTemp.setTitle(board.getTitle());
        postTemp.setContent(board.getContent());
        boardService.write(postTemp);

        model.addAttribute("message", "글 수정이 완료되었습니다.");
        model.addAttribute("searchUrl", "/board/list");

        return "message";
    }

}
