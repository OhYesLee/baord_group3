#게시판 만들기

## 사용된 기술

- Spring Boot
- Spring MVC
- Spring JDBC
- MySQL - SQL
- thymeleaf 템플릿 엔진

## 아키택쳐

```

                   Spring Core
                    /       \
                   /         \
                    Spring MVC                          Spring JDBC         MySQL
브라우저 ----요청---> Controller -------> Service -------> DAO(Repository) ------> DB
   |                                                                             |
   |                                                                             |
   ㄴ<------응답--- 템플릿 <--------- Service <--------- DAO(Repository) <----------  
                       
                <----------Layer간에 데이터 전송은 DTO라고 한다.----->     
```

### 아키택쳐에 대한 설명
- 브라우저가 요청을 보내면 Controller가 요청을 받는다.
- Controller는 서비스 로직을 Service한테 넘기고 
- Service 는 DAO(Repository)한테 넘기고
- DAO(Repository) 는 DB를 읽어들인다.
- 다시 DAO는 DB에서 읽어들인 정보를 Service한테 넘긴다.
- Service에서 만들어진 값은 다시 Controller한테 전달된다.
- 이때 Controller는 템플릿을 통해서 받아들인 값을 화면에 출력할 내용을 만들어서 Browser한테 응답을 하게 된다.


## 게시판 만드는 순서

1. Controller 와 템플릿 
2. Service는 비지니스 로직을 처리(하나의 트랜잭션 단위)
3. Service는 비지니스 로직을 처리하기 위해 데이터를 읽어오거나 Cread Read Update Delete(CRUD) 하기위해서 DAO를 사용

