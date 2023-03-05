package com.study.board.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass // 테이블로 생성되지 않음
@EntityListeners(value = {AuditingEntityListener.class }) // JPA 내부에서 엔티티 객체의 생성과 변경을 감지
@Getter
public class BaseEntity {

    @CreatedDate
    @Column(name = "regdate", updatable = false) // 객체를 DB에 반영할 때 칼럼값 변경 X
    private LocalDateTime regDate; // 생성 날짜

    @LastModifiedDate
    @Column(name = "moddate")
    private LocalDateTime modDate; // 수정 날짜

}
