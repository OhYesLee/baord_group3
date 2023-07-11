package com.example.board_group3.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Subcomment {
    private int subcommentId;
    private int commentId;
    private int userId;
    private String content;
    private LocalDateTime regdate;
}