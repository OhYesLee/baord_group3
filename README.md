# MySQL 데이터 베이스와 Spring boot를 이용한 블로그를 만드어 봤습니다.

## MySQL 데이터 베이스에 board, role, role2, user, user_role의 테이블을 만들어 로그인 기능을통해 게시글 작성자만 글 삭제와 수정이 가능하게 하고
## 게시글을 board 테이블에 저장하게 만들어 봤습니다.
### 테이블의 속성은 아래와 같습니다.
board table : 
+----------+--------------+------+-----+-------------------+-------------------+
| Field    | Type         | Null | Key | Default           | Extra             |
+----------+--------------+------+-----+-------------------+-------------------+
| board_id | int          | NO   | PRI | NULL              | auto_increment    |
| title    | varchar(100) | NO   |     | NULL              |                   |
| content  | text         | YES  |     | NULL              |                   |
| user_id  | int          | NO   | MUL | NULL              |                   |
| regdate  | timestamp    | YES  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
| view_cnt | int          | YES  |     | 0                 |                   |
+----------+--------------+------+-----+-------------------+-------------------+

mysql> desc role;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| role_id | int         | NO   | PRI | NULL    |       |
| name    | varchar(20) | YES  |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+

mysql> desc role2;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| role_id | int         | NO   | PRI | NULL    |       |
| name    | varchar(20) | YES  |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+

mysql> desc user;
+----------+--------------+------+-----+-------------------+-------------------+
| Field    | Type         | Null | Key | Default           | Extra             |
+----------+--------------+------+-----+-------------------+-------------------+
| user_id  | int          | NO   | PRI | NULL              | auto_increment    |
| email    | varchar(255) | NO   |     | NULL              |                   |
| name     | varchar(50)  | NO   |     | NULL              |                   |
| password | varchar(500) | NO   |     | NULL              |                   |
| regdate  | timestamp    | YES  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
+----------+--------------+------+-----+-------------------+-------------------+

mysql> desc user_role;
+---------+------+------+-----+---------+-------+
| Field   | Type | Null | Key | Default | Extra |
+---------+------+------+-----+---------+-------+
| user_id | int  | NO   | PRI | NULL    |       |
| role_id | int  | NO   | PRI | NULL    |       |
+---------+------+------+-----+---------+-------+

### css 부분은 아직 미완성입니다.
