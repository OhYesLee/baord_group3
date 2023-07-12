//package com.example.board_group3.dao;
//
//import com.example.board_group3.dto.Subcomment;
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
//public class SubcommentDao {
//    private final NamedParameterJdbcTemplate jdbcTemplate;
//
//    public SubcommentDao(DataSource dataSource) {
//        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
//    }
//
//    @Transactional
//    public void addSubcomment(int commentId, int userId, String content) {
//        String sql = "INSERT INTO subcomment (comment_id, user_id, content, regdate) " +
//                "VALUES (:commentId, :userId, :content, :regdate)";
//        LocalDateTime regdate = LocalDateTime.now();
//        Map<String, Object> params = Map.of(
//                "commentId", commentId,
//                "userId", userId,
//                "content", content,
//                "regdate", regdate
//        );
//        jdbcTemplate.update(sql, params);
//    }
//
//    @Transactional(readOnly = true)
//    public List<Subcomment> getSubcommentsByCommentId(int commentId) {
//        String sql = "SELECT * FROM subcomment WHERE comment_id = :commentId";
//        RowMapper<Subcomment> rowMapper = BeanPropertyRowMapper.newInstance(Subcomment.class);
//        return jdbcTemplate.query(sql, Map.of("commentId", commentId), rowMapper);
//    }
//
//    @Transactional
//    public void deleteSubcomment(int subcommentId) {
//        String sql = "DELETE FROM subcomment WHERE subcomment_id = :subcommentId";
//        jdbcTemplate.update(sql, Map.of("subcommentId", subcommentId));
//    }
//
//    @Transactional(readOnly = true)
//    public List<Subcomment> getSubcommentsByComment(int commentId) {
//        String sql = "SELECT * FROM subcomment WHERE comment_id = :commentId";
//        RowMapper<Subcomment> rowMapper = BeanPropertyRowMapper.newInstance(Subcomment.class);
//        return jdbcTemplate.query(sql, Map.of("commentId", commentId), rowMapper);
//    }
//}
