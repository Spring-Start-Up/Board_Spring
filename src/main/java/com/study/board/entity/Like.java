package com.study.board.entity;

import lombok.*;

import javax.persistence.*;

/** 좋아요 */
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lno; // 기본키

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user")
    private User user; // 사용자 외래키 (다대일)

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "post")
    private Post post; // 글 외래키 (다대일)

}