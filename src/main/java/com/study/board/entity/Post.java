package com.study.board.entity;

import javax.persistence.Entity;

@Entity
public class Post extends BaseEntity{

    private Integer pno;

    private User user;

    private Board board;

    private String title;

    private String content;
}
