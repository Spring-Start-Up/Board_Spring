package com.study.board.dto;

public class BoardForm {
    private String title;
    private String content;

    private String user;

    public BoardForm(String title, String content, String user) {
        this.title = title;
        this.content = content;
        this.user = user;
    }

    //데이터 잘받았는지 테스트하기 위해서 toString 메소드도 만들었어 (2023.03.16 언제 만든거지? 나중에 건들자)

    @Override
    public String toString() {
        return "BoardForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
