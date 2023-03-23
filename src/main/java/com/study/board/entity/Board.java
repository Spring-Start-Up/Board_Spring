package com.study.board.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/** 게시판 */
@Entity //테이블을 의미 //DB가 인식가능
@Data //entity의 데이터를 받을 수 있게 함 (getter, setter)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Board { //테이블 이름명과 동일

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bno;

    private String name; // 게시판 이름

}
