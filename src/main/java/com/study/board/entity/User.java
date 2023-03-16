package com.study.board.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String pw;

    private String name;

    @Lob
    private Blob image;
}
