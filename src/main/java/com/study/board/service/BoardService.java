package com.study.board.service;

import com.study.board.entity.Post;
import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired //이 어노테이션으로 알아서 주입해줌. Dependency Injection (생성자 주입)
    private BoardRepository boardRepository; //인터페이스라 객체 생성 불가, new로 객체를 생성하지만 *9줄

    //글 작성 처리
    public void write(Post post){

        boardRepository.save(post);
    }

    //게시글 리스트 처리
    public List<Post> boardList(){

        return boardRepository.findAll();
    }

    //특정 게시글 불러오기
    public Post boardView(Integer id){

        return boardRepository.findById(id).get(); //그냥 findById로 받으면 Optional로 받아서 오류. get함수 사용.
    }

    //특정 게시글 삭제
    public void boardDelete(Integer id){

        boardRepository.deleteById(id);
    }

}
