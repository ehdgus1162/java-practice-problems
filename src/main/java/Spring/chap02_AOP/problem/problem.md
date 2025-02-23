# 🌟 **[심화 문제: Spring IoC 컨테이너와 AOP를 활용한 종합 실습]** 🌟

---

## 📝 **문제 설명**
이 문제는 **Spring IoC 컨테이너**와 **AOP (Aspect Oriented Programming)**의 핵심 개념을 실습하는 데 목적이 있습니다.  
**Bean 등록**, **의존성 주입(DI)**, **AOP 적용**을 통해 **횡단 관심사(cross-cutting concerns)**를 효율적으로 처리하는 방법을 학습하세요.

---

## 🎯 **문제 요구사항**

### ✅ **1단계: Bean 등록과 IoC 컨테이너 설정**
1. **Java Config 기반 Bean 등록**
    - `AppConfig` 클래스를 생성하고 `@Configuration`과 `@Bean`을 사용하여 다음 빈을 등록하세요.
        - `OrderService`, `PaymentService`, `NotificationService`
   #### 🖨 **출력 예시:**
   ```
   OrderService 빈 생성됨
   PaymentService 빈 생성됨
   NotificationService 빈 생성됨
   ```

2. **의존성 주입(DI) 적용**
    - `OrderService`에 `PaymentService`와 `NotificationService`를 생성자 주입 방식으로 적용하세요.
   #### 🖨 **출력 예시:**
   ```
   OrderService: 생성자 주입 완료
   ```

---

### ✅ **2단계: AOP를 통한 횡단 관심사 처리**
1. **AOP 설정 및 적용**
    - `@EnableAspectJAutoProxy`를 사용하여 AOP 설정을 활성화하세요.
    - `LoggingAspect` 클래스를 생성하고, `@Aspect`를 사용하여 **모든 서비스 메서드 실행 전/후** 로그를 출력하세요.
   #### 🖨 **출력 예시:**
   ```
   [LOG] OrderService 메서드 실행 시작
   [LOG] OrderService 메서드 실행 종료
   ```

2. **실행 시간 측정 AOP 구현**
    - `PerformanceAspect`를 생성하고, `@Around` 어노테이션을 사용하여 메서드 실행 시간을 측정하세요.
   #### 🖨 **출력 예시:**
   ```
   [PERFORMANCE] OrderService.placeOrder() 실행 시간: 45ms
   ```

---

### ✅ **3단계: AOP 고급 기능 적용**
1. **특정 어노테이션 기반 AOP 적용**
    - `@TrackTime` 커스텀 어노테이션을 생성하고, 해당 어노테이션이 적용된 메서드의 실행 시간을 측정하세요.
   #### 🖨 **출력 예시:**
   ```
   [TRACKTIME] PaymentService.processPayment() 실행 시간: 30ms
   ```

2. **예외 처리 AOP 적용**
    - `@AfterThrowing`을 사용하여 서비스 메서드에서 예외 발생 시 로그를 출력하세요.
   #### 🖨 **출력 예시:**
   ```
   [ERROR] OrderService.placeOrder() 예외 발생: InsufficientBalanceException
   ```

3. **리턴 값 후처리 AOP 적용**
    - `@AfterReturning`을 사용하여 서비스 메서드 실행 후 리턴 값을 가공하거나 로그를 출력하세요.
   #### 🖨 **출력 예시:**
   ```
   [SUCCESS] OrderService.placeOrder() 반환 값: 주문 완료 (OrderID: 12345)
   ```

---

### ✅ **4단계: Bean 스코프와 AOP 동작 확인**
1. **싱글톤(Singleton)과 프로토타입(Prototype) 스코프 차이 확인**
    - `NotificationService`를 `@Scope("prototype")`으로 설정하고, 각 호출 시 서로 다른 인스턴스가 생성되는지 확인하세요.
   #### 🖨 **출력 예시:**
   ```
   NotificationService 인스턴스1: com.example.NotificationService@1a2b3c4
   NotificationService 인스턴스2: com.example.NotificationService@5d6e7f8
   ```

2. **프로토타입 빈의 AOP 적용 여부 확인**
    - 프로토타입 스코프의 빈에도 AOP가 정상적으로 적용되는지 확인하세요.
   #### 🖨 **출력 예시:**
   ```
   [LOG] NotificationService.sendNotification() 실행 시작
   [LOG] NotificationService.sendNotification() 실행 종료
   ```

---

### ✅ **5단계: 프로파일과 조건부 Bean 등록**
1. **환경별 프로파일 설정**
    - `@Profile`을 사용하여 다음과 같이 데이터 소스를 분리하세요.
        - `DevDataSource`: 개발용 데이터베이스 연결
        - `ProdDataSource`: 운영용 데이터베이스 연결
   #### 🖨 **출력 예시:**
   ```
   현재 활성 프로파일: dev
   Dev 데이터베이스 연결 완료
   ```

2. **조건부 Bean 등록**
    - `@Conditional`을 사용하여 특정 조건이 만족될 때만 빈이 등록되도록 구현하세요.
   #### 🖨 **출력 예시:**
   ```
   조건 만족: PaymentService 빈 등록됨
   ```

---

### 💡 **추가 심화 과제 (선택 과제)**
- 🏃 **AOP Pointcut 표현식을 사용하여 특정 패키지/클래스/메서드에만 적용**
- 🔄 **Transaction 관리 AOP**를 구현하여 트랜잭션 처리 시 롤백 기능 적용
- 💡 **동적 프록시 생성**: `ProxyFactoryBean`을 사용하여 런타임 시 프록시 생성
- 🧪 **@Lazy와 @PostConstruct 조합**을 사용하여 지연 초기화 확인

---

## 🖨 **💎 출력 예시 (최종 종합 실행 결과)**
```
[IoC 컨테이너 초기화 시작]
OrderService 빈 생성됨
PaymentService 빈 생성됨
NotificationService 빈 생성됨

[DI 테스트]
OrderService: 생성자 주입 완료

[AOP 적용 테스트]
[LOG] OrderService 메서드 실행 시작
[PERFORMANCE] OrderService.placeOrder() 실행 시간: 45ms
[SUCCESS] OrderService.placeOrder() 반환 값: 주문 완료 (OrderID: 12345)
[LOG] OrderService 메서드 실행 종료

[예외 처리 AOP 테스트]
[ERROR] OrderService.placeOrder() 예외 발생: InsufficientBalanceException

[스코프 테스트]
NotificationService 인스턴스1: com.example.NotificationService@1a2b3c4
NotificationService 인스턴스2: com.example.NotificationService@5d6e7f8

[프로파일 및 조건부 Bean 테스트]
현재 활성 프로파일: dev
Dev 데이터베이스 연결 완료
조건 만족: PaymentService 빈 등록됨
```

---

## 🚨 **💬 문제 해결 시 스스로 점검할 사항**
- [ ] ✅ **Spring IoC 컨테이너를 통한 Bean 생성 및 주입이 정상적으로 이루어졌나요?**
- [ ] ✅ **AOP 설정(@Aspect, @EnableAspectJAutoProxy)을 통해 횡단 관심사를 처리했나요?**
- [ ] ✅ **@Around, @Before, @AfterReturning, @AfterThrowing 등의 AOP 어노테이션을 올바르게 사용했나요?**
- [ ] ✅ **싱글톤과 프로토타입 스코프 간 차이를 이해하고 적용했나요?**
- [ ] ✅ **환경별 프로파일(@Profile)과 조건부 Bean 등록(@Conditional)이 정상적으로 동작했나요?**
- [ ] ✅ **실행 시간 측정, 예외 처리, 로그 출력 등 AOP의 주요 기능을 구현했나요?**

---

## 🎉 **💬 최종 목표**
이 문제를 통해 **Spring IoC 컨테이너**와 **AOP**의 개념과 실제 적용 방법을 숙달할 수 있습니다.  
**빈의 주기적 생성 및 관리**, **의존성 주입**, **횡단 관심사 분리**를 효율적으로 구현하여 **실전 수준의 스프링 프로젝트**를 설계해 보세요.

---

💡 **문제를 해결하면서 궁금한 점이나 추가 힌트가 필요하면 언제든지 말씀해 주세요!** 😊🚀✨  
**✨ 힘내세요! 완벽하게 해낼 수 있습니다! 💪🔥**
