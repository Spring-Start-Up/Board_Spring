package com.study.board.entity;

import lombok.*;

import javax.persistence.*;

/** 스크랩 */
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Scrap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sno; // 기본키

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user")
    private User user; // 사용자 외래키 (다대일)

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "post")
    private Post post; // 글 외래키 (다대일)

}
