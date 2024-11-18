# SPRING PLUS
- JPA 성능 최적화, QueryDSL을 활용한 동적 쿼리 작성, 스프링 시큐리티등 실무에서 자주 사용되는 패턴과 기술을 학습하며, AWS의 다양한 서비스를 학습

## 3️⃣ 필수 기능
## Level. 1
- [x] **1. 코드 개선 퀴즈 - @Transactional의 이해**

    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/34d42dcb-7d2a-4f20-96d2-5487ae2a2928/image.png)
  - 할 일 저장 기능을 구현한 API(`/todos`)를 호출할 때, 아래와 같은 에러가 발생하고 있어요.

   ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/e70cf554-ee20-4fce-8910-2d8440253199/image.png)
  - 에러가 발생하지 않고 정상적으로 할 일을 저장 할 수 있도록 코드를 수정해주세요.


- [x] **2. 코드 추가 퀴즈 - JWT의 이해**
  - User의 정보에 nickname이 필요해졌어요.
    - User 테이블에 nickname 컬럼을 추가해주세요.
    - nickname은 중복 가능합니다.
  - 프론트엔드 개발자가 JWT에서 유저의 닉네임을 꺼내 화면에 보여주길 원하고 있어요.


- [x] **3. 코드 개선 퀴즈 - AOP의 이해**

    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/228d9688-ea86-4dec-876b-9752689ab44f/image.png)

  - `UserAdminController` 클래스의 `changeUserRole()` 메소드가 실행 전 동작해야해요.
  - `AdminAccessLoggingAspect` 클래스에 있는 AOP가 개발 의도에 맞도록 코드를 수정해주세요.


- [x] **4. 테스트 코드 퀴즈 - 컨트롤러 테스트의 이해**

    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/e03201f2-47b3-4afc-beb7-6c2fbab8bc2b/image.png)

  - 테스트 패키지 `org.example.expert.domain.todo.controller`의
    `todo_단건_조회_시_todo가_존재하지_않아_예외가_발생한다()` 테스트가 실패하고 있어요.

    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/e7342cca-35d7-45ec-95bf-a7702a35bc4f/image.png)

  - 테스트가 정상적으로 수행되어 통과할 수 있도록 테스트 코드를 수정해주세요.


- [x] **5. 코드 개선 퀴즈 -  JPA의 이해**

    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/21a01448-eb2a-4e85-8ca0-cbe285a76376/image.png)

  - 할 일 검색 시 `weather` 조건으로도 검색할 수 있어야해요.
      - `weather` 조건은 있을 수도 있고, 없을 수도 있어요!
  - 할 일 검색 시 수정일 기준으로 기간 검색이 가능해야해요.
      - 기간의 시작과 끝 조건은 있을 수도 있고, 없을 수도 있어요!
  - JPQL을 사용하고, 쿼리 메소드명은 자유롭게 지정하되 너무 길지 않게 해주세요.


## Level. 2

- [x] **6. JPA Cascade**

    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/2ae0fb49-2098-4425-92f8-f2c9d610b70e/image.png)

  - 할 일을 새로 저장할 시, 할 일을 생성한 유저는 담당자로 자동 등록되어야 합니다.
  - JPA의 `cascade` 기능을 활용해 할 일을 생성한 유저가 담당자로 등록될 수 있게 해주세요.

    
- [x] **7. N+1**

    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/2315b8db-7f83-4984-8599-8c1079151444/image.png)

  - `CommentController` 클래스의 `getComments()` API를 호출할 때 N+1 문제가 발생하고 있어요. N+1 문제란, 데이터베이스 쿼리 성능 저하를 일으키는 대표적인 문제 중 하나로, 특히 연관된 엔티티를 조회할 때 발생해요.
  - 해당 문제가 발생하지 않도록 코드를 수정해주세요.
  - N+1 로그

    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/ddbe17ea-386d-4426-9eef-b18e6dd3acfd/image.png)


- [x] **8. QueryDSL**

    ![TodoService.getTodo 메소드](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/21df06d6-a203-4ca0-ab92-88d1e79aad11/image.png)

  - JPQL로 작성된 `findByIdWithUser` 를 QueryDSL로 변경합니다.
  - 7번과 마찬가지로 N+1 문제가 발생하지 않도록 유의해 주세요!


- [x] **9. Spring Security**

  - 기존 `Filter`와 `Argument Resolver`를 사용하던 코드들을 Spring Security로 변경해주세요.
      - 접근 권한 및 유저 권한 기능은 그대로 유지해주세요.
      - 권한은 Spring Security의 기능을 사용해주세요.
  - 토큰 기반 인증 방식은 유지할 거예요. JWT는 그대로 사용해주세요.

## 4️⃣ 도전 기능

## Level 3

- [x] **10. QueryDSL 을 사용하여 검색 기능 만들기**


  - 새로운 API로 만들어주세요.
  - 검색 조건은 다음과 같아요.
      - 검색 키워드로 일정의 제목을 검색할 수 있어요.
          - 제목은 부분적으로 일치해도 검색이 가능해요.
      - 일정의 생성일 범위로 검색할 수 있어요.
          - 일정을 생성일 최신순으로 정렬해주세요.
      - 담당자의 닉네임으로도 검색이 가능해요.
          - 닉네임은 부분적으로 일치해도 검색이 가능해요.
  - 다음의 내용을 포함해서 검색 결과를 반환해주세요.
      - 일정에 대한 모든 정보가 아닌, 제목만 넣어주세요.
      - 해당 일정의 담당자 수를 넣어주세요.
      - 해당 일정의 총 댓글 개수를 넣어주세요.
  - 검색 결과는 페이징 처리되어 반환되도록 합니다.


- [x] **11. Transaction 심화**


  - 매니저 등록 요청을 기록하는 로그 테이블을 만들어주세요.
      - DB 테이블명: `log`
  - 매니저 등록과는 별개로 로그 테이블에는 항상 요청 로그가 남아야 해요.
      - 매니저 등록은 실패할 수 있지만, 로그는 반드시 저장되어야 합니다.
      - 로그 생성 시간은 반드시 필요합니다.
      - 그 외 로그에 들어가는 내용은 원하는 정보를 자유롭게 넣어주세요.


- [ ] **12. AWS 활용 마스터**

    **공통사항**

  - 각 AWS 서비스의 콘솔에서 내가 만든 서비스들의 설정 화면을 캡쳐하여 `README.md`에 첨부하세요.

  **12-1. EC2**

  - EC2 인스턴스에서 어플리케이션을 실행하세요.
  - 탄력적 IP를 설정해서 외부에서도 접속할 수 있도록 해주세요.
  - 서버 접속 및 Live 상태를 확인할 수 있는 health check API를 만들고 `README.md` 에 기재하세요.
      - health check API는 누구나 접속 가능해야 해요.
      - API path는 편하게 정해도 괜찮습니다.

  **12-2. RDS**

  - RDS에 데이터베이스를 구축하고, EC2에서 실행되는 어플리케이션에 연결하세요.

  **12-3. S3**

  - S3 버킷을 생성하여 유저의 프로필 이미지 업로드 및 관리 API를 구현하세요.


- [ ] **13. 대용량 데이터 처리**

  - 대용량 데이터 처리 실습을 위해, 테스트 코드로 유저 데이터를 100만 건 생성해주세요.
      - 데이터 생성 시 닉네임은 랜덤으로 지정해주세요.
      - 가급적 동일한 닉네임이 들어가지 않도록 방법을 생각해보세요.
  - 닉네임을 조건으로 유저 목록을 검색하는 API를 만들어주세요.
      - 닉네임은 정확히 일치해야 검색이 가능해요.
  - 여러가지 아이디어로 유저 검색 속도를 줄여주세요.
      - 조회 속도를 개선할 수 있는 여러 방법을 고민하고, 각각의 방법들을 실행해보세요.
      - `README.md` 에 각 방법별 실행 결과를 비교할 수 있도록 최초 조회 속도와 개선 과정 별 조회 속도를 확인할 수 있는 표 혹은 이미지를 첨부해주세요.


- [ ] Level 4 Kotlin 적용하기 (파일 혹은 특정 클래스)

    ### 들어가기 전에, Kotlin 전환 간 주의사항

  - [ ]  **Kotlin nullable <-> Java Optional**
      - [ ]  Java와 Kotlin을 혼용하여 사용하는 구간에 문제가 발생될 수 있습니다.
      - [ ]  기존 Java에서 Optional로 선언되어 있던 타입을 Kotlin의 Nullable 타입으로 수정 시
          - [ ]  Java에서 이를 사용 할 때, `Optional.ofNullable()`로 감싸야하는 필요성
  - [ ]  **Kotlin은 일단 final**
      - [ ]  Kotlin 코드는 기본적으로 `final`임에 주의!
      - [ ]  테스트를 진행할 때 Java 라이브러리로는 Kotlin 코드의 Mocking이 불가능
          - [ ]  이를 가능하게 해주는 `springmockk` 혹은 `mockito-kotlin` 라이브러리를 사용하는 것을 추천

  - Nullable 및 Non-Nullable 필드를 정확히 정의하고 데이터 클래스 사용할 것
  - 기본 생성자 및 데이터 클래스에서의 `copy()` 메서드 활용할 것
  - 기본 `CrudRepository` 또는 `JpaRepository`를 사용할 것
  - QueryDSL을 활용할 것
  - Lombok을 사용했다면, Kotlin의 기본 기능으로 대체할 것
      - ex) 단순 getter, setter 메서드 생성