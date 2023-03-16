package com.study.board.repository;

import com.study.board.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Post, Integer> { //어떤 entity를 넣을 것이냐, 주키로 지정한 컬럼의 자료형

}
