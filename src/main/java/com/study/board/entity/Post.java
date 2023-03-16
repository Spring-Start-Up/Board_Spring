package com.study.board.entity;

import lombok.*;

import javax.persistence.*;

/** 게시글 */
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pno;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "board")
    private Board board;

    private String title;

    private String content;

}
