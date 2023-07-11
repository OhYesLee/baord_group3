package com.example.board_group3.service;

import com.example.board_group3.dao.SubcommentDao;
import com.example.board_group3.dto.Subcomment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubcommentService {
    private final SubcommentDao subcommentDao;

    @Transactional
    public void addSubcomment(int commentId, int userId, String content) {
        subcommentDao.addSubcomment(commentId, userId, content);
    }

    @Transactional
    public void deleteSubcomment(int subcommentId) {
        subcommentDao.deleteSubcomment(subcommentId);
    }

    @Transactional(readOnly = true)
    public List<Subcomment> getSubcommentsByComment(int commentId) {
        return subcommentDao.getSubcommentsByComment(commentId);
    }
}

