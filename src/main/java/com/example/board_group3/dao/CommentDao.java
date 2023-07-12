//package com.example.board_group3.dao;
//
//import com.example.board_group3.dto.Comment;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.sql.DataSource;
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.Map;
//
//@Repository
//public class CommentDao {
//    private final NamedParameterJdbcTemplate jdbcTemplate;
//
//    public CommentDao(DataSource dataSource) {
//        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
//    }
//
//    @Transactional
//    public void addComment(int boardId, int userId, String content) {
//        String sql = "INSERT INTO comment (board_id, user_id, content, regdate) " +
//                "VALUES (:boardId, :userId, :content, :regdate)";
//        LocalDateTime regdate = LocalDateTime.now();
//        Map<String, Object> params = Map.of(
//                "boardId", boardId,
//                "userId", userId,
//                "content", content,
//                "regdate", regdate
//        );
//        jdbcTemplate.update(sql, params);
//    }
//
//    @Transactional(readOnly = true)
//    public List<Comment> getCommentsByBoardId(int boardId) {
//        String sql = "SELECT * FROM comment WHERE board_id = :boardId";
//        RowMapper<Comment> rowMapper = BeanPropertyRowMapper.newInstance(Comment.class);
//        return jdbcTemplate.query(sql, Map.of("boardId", boardId), rowMapper);
//    }
//
//    @Transactional
//    public void deleteComment(int commentId) {
//        String sql = "DELETE FROM comment WHERE comment_id = :commentId";
//        jdbcTemplate.update(sql, Map.of("commentId", commentId));
//    }
//
//    @Transactional(readOnly = true)
//    public Comment getComment(int commentId) {
//        String sql = "SELECT * FROM comment WHERE comment_id = :commentId";
//        RowMapper<Comment> rowMapper = BeanPropertyRowMapper.newInstance(Comment.class);
//        return jdbcTemplate.queryForObject(sql, Map.of("commentId", commentId), rowMapper);
//    }
//
//    @Transactional(readOnly = true)
//    public List<Comment> getCommentsByBoard(int boardId) {
//        String sql = "SELECT * FROM comment WHERE board_id = :boardId";
//        RowMapper<Comment> rowMapper = BeanPropertyRowMapper.newInstance(Comment.class);
//        return jdbcTemplate.query(sql, Map.of("boardId", boardId), rowMapper);
//    }
//}
