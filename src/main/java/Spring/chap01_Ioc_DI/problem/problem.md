# 🌟 **[심화 문제: Spring IoC 컨테이너와 의존성 주입 (DI) 종합 실습]** 🌟

---

## 📝 **문제 설명**
다음 요구사항을 충족하는 **Spring IoC 컨테이너** 기반의 프로그램을 작성하세요.  
**의존성 주입(DI)**, **빈 등록 방식**, **라이프사이클 관리**, **ApplicationContext 활용** 등 **Spring 핵심 개념**을 실습할 수 있도록 문제를 설계했습니다.

---

## 🎯 **문제 요구사항**

### ✅ **1단계: IoC 컨테이너와 Bean 등록 방식 이해**
1. **Java Config를 이용한 빈 등록**
    - `AppConfig` 클래스를 생성하여 `@Configuration`과 `@Bean`을 사용하여 `UserService`와 `UserRepository` 빈을 등록하세요.
   #### 🖨 **출력 예시:**
   ```
   UserService 빈 생성됨
   UserRepository 빈 생성됨
   ```

2. **XML 기반 빈 등록**
    - `applicationContext.xml`을 작성하여 동일한 `UserService`와 `UserRepository` 빈을 XML 방식으로 등록하세요.
    - `ClassPathXmlApplicationContext`를 사용하여 빈을 로드하고 동작을 확인하세요.
   #### 🖨 **출력 예시:**
   ```
   XML 기반 UserService 동작 확인: 사용자 등록 완료
   ```

---

### ✅ **2단계: 의존성 주입(DI) 심화**
1. **생성자 주입**
    - `OrderService` 클래스에 `@Autowired`를 사용하여 생성자 주입 방식을 구현하세요.
    - 동작 시 `"OrderService: 생성자 주입 완료"`를 출력하세요.
   #### 🖨 **출력 예시:**
   ```
   OrderService: 생성자 주입 완료
   ```

2. **필드 주입**
    - `PaymentService` 클래스에 필드 주입을 적용하고, 결제 기능을 구현하세요.
   #### 🖨 **출력 예시:**
   ```
   PaymentService: 필드 주입 완료
   결제 완료: 5000원
   ```

3. **세터 주입**
    - `NotificationService` 클래스에 세터 메서드를 통해 의존성을 주입하세요.
   #### 🖨 **출력 예시:**
   ```
   NotificationService: 세터 주입 완료
   이메일 전송 완료
   ```

---

### ✅ **3단계: IoC 컨테이너의 라이프사이클 관리**
1. **초기화 메서드(@PostConstruct)**
    - 모든 서비스 클래스에 `@PostConstruct` 메서드를 추가하여 초기화 시 메시지를 출력하세요.
   #### 🖨 **출력 예시:**
   ```
   UserService 초기화 완료
   OrderService 초기화 완료
   ```

2. **소멸 메서드(@PreDestroy)**
    - `@PreDestroy`를 사용하여 빈 소멸 시 실행되는 메서드를 구현하세요.
   #### 🖨 **출력 예시:**
   ```
   UserService 소멸 중...
   OrderService 소멸 중...
   ```

---

### ✅ **4단계: ApplicationContext의 활용**
1. **AnnotationConfigApplicationContext 사용**
    - `AnnotationConfigApplicationContext`를 사용하여 빈을 로딩하고 각 서비스의 기능을 실행하세요.
   #### 🖨 **출력 예시:**
   ```
   사용자 등록 완료: 홍길동
   주문 처리 완료: 상품 A
   ```

2. **빈 스코프 변경 및 확인**
    - `UserService` 빈의 스코프를 `@Scope("prototype")`으로 변경하고, 각각의 인스턴스가 다름을 확인하세요.
   #### 🖨 **출력 예시:**
   ```
   UserService 인스턴스1: com.example.UserService@1a2b3c4
   UserService 인스턴스2: com.example.UserService@5d6e7f8
   ```

---

### ✅ **5단계: 고급 IoC 기능 활용**
1. **@Qualifier를 사용한 의존성 주입**
    - `PaymentService`에 서로 다른 결제 방식(`CreditCardPayment`, `PaypalPayment`)을 구현하고, `@Qualifier`로 특정 빈을 주입하세요.
   #### 🖨 **출력 예시:**
   ```
   선택된 결제 방식: Paypal 결제 완료
   ```

2. **@Primary를 사용한 기본 빈 설정**
    - 두 개의 구현체 중 하나에 `@Primary`를 지정하여 기본 빈으로 선택하세요.
   #### 🖨 **출력 예시:**
   ```
   기본 결제 방식: CreditCard 결제 완료
   ```

3. **프로파일 기반 빈 설정 (@Profile)**
    - `DevDataSource`, `ProdDataSource` 클래스를 작성하고 `@Profile`을 사용하여 실행 환경에 따라 적절한 빈을 로딩하세요.
   #### 🖨 **출력 예시:**
   ```
   현재 활성 프로파일: dev
   Dev 데이터베이스 연결 완료
   ```

---

### 💡 **추가 심화 과제 (선택 과제)**
- 🏃 **@Lazy**를 사용하여 지연 로딩 기능을 테스트하세요.
- 🔄 **FactoryBean**을 구현하여 복잡한 객체 생성 과정을 IoC 컨테이너에 위임하세요.
- 💡 **ApplicationListener**와 **ContextRefreshedEvent**를 활용하여 컨테이너 초기화 이벤트를 처리하세요.
- 🧪 **AOP (Aspect Oriented Programming)** 기능을 추가하여 메서드 실행 시간을 측정하세요.

---

## 🖨 **💎 출력 예시 (최종 종합 실행 결과)**
```
[IoC 컨테이너 테스트 시작]
UserService 빈 생성됨
OrderService: 생성자 주입 완료
PaymentService: 필드 주입 완료
NotificationService: 세터 주입 완료

[라이프사이클 테스트]
UserService 초기화 완료
OrderService 초기화 완료

[서비스 기능 실행]
사용자 등록 완료: 홍길동
주문 처리 완료: 상품 A
결제 완료: 5000원
이메일 전송 완료

[스코프 테스트]
UserService 인스턴스1: com.example.UserService@1a2b3c4
UserService 인스턴스2: com.example.UserService@5d6e7f8

[프로파일 테스트]
현재 활성 프로파일: dev
Dev 데이터베이스 연결 완료

[라이프사이클 종료]
UserService 소멸 중...
OrderService 소멸 중...
```

---

## 🚨 **💬 문제 해결 시 스스로 점검할 사항**
- [ ] ✅ **IoC 컨테이너의 역할과 작동 원리를 이해했나요?**
- [ ] ✅ **빈 등록 방식(Java Config, XML, 어노테이션)을 모두 적용했나요?**
- [ ] ✅ **의존성 주입(DI)의 다양한 방식(생성자, 필드, 세터)을 실습했나요?**
- [ ] ✅ **빈의 라이프사이클 관리(@PostConstruct, @PreDestroy)를 구현했나요?**
- [ ] ✅ **ApplicationContext를 사용하여 컨테이너를 효율적으로 다뤘나요?**
- [ ] ✅ **빈 스코프 변경, @Qualifier, @Primary, @Profile을 통해 고급 기능을 사용했나요?**

---

## 🎉 **💬 최종 목표**
이 문제는 **Spring IoC 컨테이너**의 핵심 개념과 **DI(의존성 주입)** 기능을 실습하기 위해 설계되었습니다.  
**서비스와 리포지토리 간의 의존성 관리**, **빈의 스코프와 라이프사이클**, **환경별 프로파일 관리**를 통해 **실전형 스프링 애플리케이션** 개발 능력을 강화하세요.

---

💡 **문제를 해결하면서 궁금한 점이나 추가 힌트가 필요하면 언제든지 말씀해 주세요!** 😊🚀✨  
**✨ 힘내세요! 완벽하게 해낼 수 있습니다! 💪🔥**
