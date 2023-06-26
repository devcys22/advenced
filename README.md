# advenced
김영한 스프링 고급편

<h2>로그추적기V1</h2>
모든 PUBLIC 메서드의 호출과 응답 정보를 로그로 출력<br/>
애플리케이션의 흐름을 변경하면 안됨<br/>
메서드 호출에 걸린 시간<br/>
정상 흐름과 예외 흐름 구분<br/><br/>
<img src ="https://github.com/devcys22/advenced/assets/78769412/d889616f-4d17-4f72-ac7a-d13c5e814608">

실행 로그를 보면 같은 '트랜잭션ID'를 유지하고 'level'을 통해 메서드 호출의 깊이를 표현하는 것을 확인<br/>
begin_end_level2
<img src ="https://github.com/devcys22/advenced/assets/78769412/41de91f9-69cb-4b52-adb4-7b85b5479725">
begin_exception_level2
<img src ="https://github.com/devcys22/advenced/assets/78769412/5aa00274-a3e8-4fb3-bb96-ccdbc28490fb">
