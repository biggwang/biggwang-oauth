## OAuth 2.0 Authorization Server
 
### 1 client 등록   
com/biggwang/auth/repository/OauthClientRepositoryTest.java:19
### 2 user 등록  
com/biggwang/auth/repository/UserJpaRepositoryTest.java:25
### 3 accessToken 발급
http://localhost:8081/oauth/authorize?client_id=testClientId&redirect_uri=http://localhost:8081/oauth2/callback&response_type=code&scope=read
### 토큰타입을 bearer에서 jwt 방식으로 변경  
- 발급받은 access_token을 가지고 Resource Server로 API 요청 하게 되면
- Resource Server는 다시 Authorization Server에 토큰이 유효한지 인증한 회원이 누구인지 다시 한번 조회 해야 함
- 그런 불필요한 홉을 줄이기 위해 jwt로 토큰안에 회원정보를 가지고 있으면 홉을 줄일수 있어 사용함
