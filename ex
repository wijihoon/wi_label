1.	서비스 설명
o	실시간 순위 정보를 고객에서 제공하는 서비스를 만들려고 합니다.
o	“많이 본”, “많이 오른”, “많이 내린”, “거래량 많은” 각 주제로 메인화면과 상세화면으로 구성됩니다.
o	서비스의 상세한 설명은 카카오페이앱 주식 서비스의 발견 탭 의 [실시간 순위] 서비스를 참고해주세요.
     



2.	요구사항
o	서비스 제공에 필요한 RESTful API 를 구현합니다.
o	실시간 데이터의 변동을 위해 데이터가 랜덤으로 변경되는 API를 추가로 개발해 주시기 바랍니다. (실시간 통신 Spring websocket (postman 웹소캣 테스트 가능), SSE)
> https://velog.io/@max9106/Spring-SSE-Server-Sent-Events%EB%A5%BC-%EC%9D%B4%EC%9A%A9%ED%95%9C-%EC%8B%A4%EC%8B%9C%EA%B0%84-%EC%95%8C%EB%A6%BC
o	Application이 로딩될 때 기본 데이터가 DB에 적재하도록 합니다.  (인-메모리 데이터베이스 : H2, HSQL, Derby)
    > CommandLineRunner
	주식 종목에 대한 정보는 첨부된 데이터를 참고하시면 됩니다.
o	데이터 테이블 구조는 효율적인 방식으로 스스로 설계해 주시면 됩니다.
o	각 기능 및 제약사항에 대한 단위테스트를 작성합니다.


3.	API 설명
o	모든 주제의 상위 5건 조회 API
	주제별 상위 5건 데이터를 한번에 가져옵니다.
o	주제별 조회 API
	주제는 4가지로 분류됩니다.
1.	“많이 본”
2.	“많이 오른”
3.	“많이 내린”
4.	“거래량 많은”
	요청은 페이징(기본 20건) 처리하여 조회합니다.
	최대 100개까지만 데이터를 제공합니다.
> https://comart.io/blog/realtime-ranking-with-redis-sorted-set
> https://cantcoding.tistory.com/82
> https://sup2is.github.io/2020/07/17/ranking-list-with-redis.html (spring data redis)
> https://alwayspr.tistory.com/42 (spring cache)
> https://github.com/tamirncode/redis-stockplatform
> https://github.com/dydtjr1128/ChattingStudy
o	순위를 랜덤하게 변경할 수 있는 API 
	주제 전체의 순위가 랜덤하게 변경될 수 있도록 합니다.


4.	기술 제약사항
o	설계 내용과 이유, 핵심 문제해결 전략 및 분석한 내용을 작성하여 “readme.md” 파일에 첨부 해주세요.
o	개발은 SpringBoot 와 JAVA를 사용해서 구현하시기 바랍니다.
o	API의 HTTP Method들은 자유롭게 선택하시면 됩니다. (GET, POST, DELETE, PUT, PATCH)
o	에러응답, 에러코드는 자유롭게 정의해주세요.
o	단위 테스트를 작성하세요.


5.	평가항목
o	프로젝트 구성방법 및 관련된 시스템 아키텍쳐 설계방법이 적절한가?
o	요구사항을 잘 이해하고 구현하였는가?
o	작성한 어플리케이션 코드의 가독성이 좋고 의도가 명확한가?
o	작성한 테스트코드는 적절한 범위의 테스트를 수행하고 있는가?
o	어플리케이션은 다량의 트래픽에도 무리가 없도록 효율적으로 작성되었는가?



Sample Data 제공 : 첨부 파일 확인 : 순서 / 종목 코드 / 종목명 / 현재가

프로세스
1. 최초 로딩 시 주식종목 및 원천데이터 호출 및 @Cacheabled 처리하여 중복 호출 방지
2. 최초 실시간 순위 조회 시 정해진 sorted set 순위는 재조회 하지않으면 변경되지않는다. 딘, score (오른%, 내린% 등)는 계속 변동이 일어난다.
3. 순위 조회 이후 spring websocket을 통해 주식 상태(가격, 등) 정보를 수시로 클라이언트단에 전송

developer flow
1. 서비 기동 시 주식정보 csv파일에서 읽어 redis set sorted 인-메모리 저장
2. "많이 본", "많이 오른", "많이 내린", "거래량 많은", "조건별 상위 5선" API 구현 (내림차순 페이징 처리 = zrevrangebyscore key startindex endindex)
> https://cantcoding.tistory.com/82 (redis 구현)
3. 순위를 랜덤하게 변경할 수 있는 API (redis zadd하여 이존 score 정보 수정)
4. 3번 사항 시행시마다 클라이언트 정보 전달 (Spring WebSocket 적용)


redis 
- 자료구조 : opsForZSet (특징 : 중복값 제거 오름차순 정렬저장)
