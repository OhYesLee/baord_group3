package com.example.board_group3.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Comment {
    private int commentId;
    private int boardId;
    private int userId;
    private String content;
    private LocalDateTime regdate;
}