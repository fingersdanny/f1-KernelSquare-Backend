# f1-KernelSquare
---
### 프로젝트 기획 및 목적
- 지속가능한 성장을 위한 개발자 커뮤니티
- Stack Overflow를 벤치마크한 Q & A 서비스
- 예약 시스템 기반 멘토와 멘티 1:1 커피챗 서비스

### 배포 주소(로그인 필요시, 테스트 계정 기입)
- 주소 : https://kernelsquare.live
- ID : test@email.com
- PW : Qwerasdf1234!

### 주요기능
- 로그인, 회원가입
- 질문, 답변남기기, 답변에 투표 (Upvote, Downvote)
- 마이페이지, 프로필 사진, 자기소개, 레벨업 (로그인, 질문 작성, 답변 작성)
- 커피챗 생성 기능, 예약(멘티), 채팅(STOMP Websocket통신)

### 기능 작성시 상세한 기획/정책/규칙 작성

- 회원가입 -> 이메일 -> 이메일 형식이어야함, 한글 사용 불가,  6 ~ 40자로 입력해야 함, 중복 허용 x -> 닉네임  -> 숫자와 특수문자는 사용불가, 중복 허용 x, 2 ~ 8자로 입력해야 함 -> 비밀번호 -> 영문 대소문자, 특수문자, 숫자 각 1자씩 들어가야 함, 8 ~ 16자로 입력해야 함
- 멤버 -> 자기소개는 마크다운 문법 포함 300자까지 가능, 닉네임 변경 불가
- 이미지 -> 파일 크기 1~10 MB으로 제한
- 질문 -> 로그인 해야 질문 작성 가능
- 답변 -> 로그인 해야 답변 작성 가능, 한 질문에 하나의 답변만 가능, 본인 답변에 투표 불가, 본인 질문에 답변 불가
- 커피챗 글 생성 -> 멘토 권한을 가진 멤버만 생성 가능, 현재 날짜로부터 7일 뒤부터 다음달 같은 날짜 전까지 생성 날짜 선택 가능, 선택한 날짜를 포함한 연속된 3일까지만 생성 가능, 멘토링 시간 선택은 30분 단위로 10개까지 선택 가능, 생성된 커피챗 글은 멘티가 예약할 수 있는 기간이 아니면 삭제 가능
- 커피챗 글 멘토링 신청 -> 멘티는 멘토링 시작 날짜의 6일 전부터 2일 전까지만 신청 가능, 해당 커피챗 글에 한번만 멘토링 신청 가능, 신청한 멘토링은 시작 날짜 24시간 전까지 취소  가능
- 채팅방 -> 활성화된 채팅방에 30분마다 채팅방 만료 메시지를 보내게 되면, 채팅방이 닫힘

### 아키텍처
- 멀티모듈로 나누어 개발을 진행하고 있습니다. 아키텍처는 아래 그림과 같고 현재 배포되어있는 서비스는 주로 Member-api 모듈에서 동작하는 코드입니다. 대부분의 CRUD 기능으로 생긴 데이터는 MySQL로 저장이되고 채팅 내용은 MongoDB에 저장이됩니다.

![멀티모듈](https://github.com/Kernel360/KBE_final-project/assets/92242326/a217e0af-a1bd-4f4c-be5e-dd383762b1cc)

### 그 외 정보들
- Spring Rest Docs 도입 검토중
- 서비스 코드 리팩터링에 대한 조언 필요 

잠시만 릴리즈 스크립트 테스트2
