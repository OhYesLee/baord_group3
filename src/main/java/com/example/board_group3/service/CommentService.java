//package com.example.board_group3.service;
//
//import com.example.board_group3.dao.CommentDao;
//import com.example.board_group3.dto.Comment;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class CommentService {
//    private final CommentDao commentDao;
//
//    @Transactional
//    public void addComment(int boardId, int userId, String content) {
//        commentDao.addComment(boardId, userId, content);
//    }
//
//    @Transactional
//    public void deleteComment(int commentId) {
//        commentDao.deleteComment(commentId);
//    }
//
//    @Transactional(readOnly = true)
//    public List<Comment> getCommentsByBoard(int boardId) {
//        return commentDao.getCommentsByBoard(boardId);
//    }
//}
//
