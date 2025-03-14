### 🌟 **[심화 문제: Java 예외 처리 및 사용자 정의 예외 종합 문제]** 🌟

---

## 📝 **문제 설명**
다음 요구사항을 충족하는 **Java 예외 처리(Exception Handling)** 프로그램을 작성하세요.  
**기본 예외 처리**, **사용자 정의 예외**, **try-with-resources**, **예외 위임과 다형성**, **예외 전환(Exception Chaining)** 등의 고급 개념을 포함하여 문제를 해결하세요.  
**예외 발생 원리 이해**, **안정적인 프로그램 흐름 유지**, **자원 해제 처리**와 같은 **실전 프로그래밍 능력**을 평가합니다.

---

## 🎯 **문제 요구사항**

### ✅ **1단계: 기본적인 예외 처리 구현**
1. **0으로 나누기 예외 처리**
    - `int result = 100 / 0;` 연산을 수행하여 **ArithmeticException** 예외를 발생시키고, `try-catch`로 처리하세요.
    - 예외 발생 시 `"예외 발생: 0으로 나눌 수 없습니다."`를 출력하세요.

2. **입력값 유효성 검사**
    - 사용자로부터 문자열을 입력받아 정수로 변환하세요.
    - **NumberFormatException**이 발생할 경우 `"입력 오류: 숫자가 아닙니다."`를 출력하세요.

---

### ✅ **2단계: 배열과 컬렉션 예외 처리**
1. **배열 인덱스 예외 처리**
    - 크기가 3인 배열을 생성하고, 5번째 인덱스에 접근하여 **ArrayIndexOutOfBoundsException**을 발생시키세요.
    - 예외 발생 시 `"예외 발생: 잘못된 인덱스 접근"`을 출력하세요.

2. **List의 잘못된 요소 접근 예외 처리**
    - **ArrayList**를 생성하고 요소를 추가한 후, 존재하지 않는 인덱스에 접근하여 예외를 처리하세요.

---

### ✅ **3단계: 사용자 정의 예외 (Custom Exception)**
1. **음수 입력 예외 처리**
    - `NegativeNumberException` 사용자 정의 예외 클래스를 작성하세요.
    - 사용자가 음수를 입력하면 예외를 발생시키고 `"예외 발생: 음수 입력은 허용되지 않습니다."`를 출력하세요.

2. **사용자 정의 나눗셈 예외 처리**
    - `CustomDivideByZeroException` 클래스를 정의하세요.
    - 나눗셈 연산에서 0으로 나눌 때 예외를 발생시키고 `"예외 발생: 0으로 나눌 수 없습니다."`를 출력하세요.

---

### ✅ **4단계: try-with-resources 및 파일 처리**
1. **파일 읽기 프로그램 구현**
    - **try-with-resources** 구문을 사용하여 **BufferedReader**를 통해 파일을 읽는 프로그램을 작성하세요.
    - 파일 내용이 정상적으로 출력되도록 하며, 자원이 자동으로 해제되는지 확인하세요.

2. **파일이 존재하지 않을 때 예외 처리**
    - **FileNotFoundException**이 발생할 경우 `"예외 발생: 파일을 찾을 수 없습니다."`를 출력하세요.

---

### ✅ **5단계: 예외 위임 및 오버라이딩 심화**
1. **예외 위임 (`throws`) 기능 구현**
    - **Operation** 부모 클래스를 작성하고 `calculate()` 메소드에서 **Exception**을 `throws`로 선언하세요.
    - **AdvancedOperation** 자식 클래스를 작성하고, `calculate()` 메소드를 오버라이딩하여 예외를 재정의하세요.
    - 부모 참조 변수를 사용하여 자식 객체를 호출하는 **다형성(polymorphism)**을 테스트하세요.

2. **다중 catch 블록 처리**
    - 다양한 예외를 하나의 try 문에서 발생시킨 후, **다중 catch 블록**을 통해 개별적으로 처리하세요.
    - 각 예외에 따라 다른 메시지를 출력하세요.

---

### ✅ **6단계: 예외 전환 (Exception Chaining)**
1. **예외 전환 구현**
    - 특정 메소드에서 발생한 **IOException**을 **RuntimeException**으로 전환하는 코드를 작성하세요.
    - 예외 발생 시 `"예외 전환 발생: 원인 - [원래 예외 메시지]"`를 출력하세요.

---

### 💡 **추가 심화 과제 (선택 과제)**
- 🔄 **finally 블록**을 추가하여 예외 발생 여부와 관계없이 자원 해제를 수행하세요.
- 🏃 **checked 예외**와 **unchecked 예외**의 차이를 실습하는 예제 추가
- ⚡ **StackTrace**를 사용하여 예외 발생 시 호출 스택 정보를 출력하세요.
- 🔒 **다중 예외 처리**에서 `multi-catch` 구문 (`catch (ExceptionA | ExceptionB e)`)을 사용하세요.

---

## 🖨 **💎 출력 예시**
```
[기본 예외 처리]
예외 발생: 0으로 나눌 수 없습니다.

[입력값 유효성 검사]
입력: abc
입력 오류: 숫자가 아닙니다.

[배열 인덱스 예외 처리]
예외 발생: 잘못된 인덱스 접근

[음수 입력 예외 처리]
입력: -5
예외 발생: 음수 입력은 허용되지 않습니다.

[사용자 정의 예외 - 나눗셈]
입력: 10 / 0
예외 발생: 0으로 나눌 수 없습니다.

[파일 읽기 - try-with-resources]
파일 내용:
Hello, World!

[파일 존재 여부 확인]
예외 발생: 파일을 찾을 수 없습니다.

[예외 위임 및 다형성 테스트]
부모 클래스 예외 발생
자식 클래스 예외 발생

[예외 전환(Exception Chaining)]
예외 전환 발생: 원인 - Stream closed
```

---

## 🚨 **💬 문제 해결 시 스스로 점검할 사항**
- [ ] ✅ **try-catch-finally 블록을 적절히 사용했나요?**
- [ ] ✅ **사용자 정의 예외 클래스를 구현하고 적절히 처리했나요?**
- [ ] ✅ **예외 위임(throws)과 오버라이딩을 활용했나요?**
- [ ] ✅ **다형성을 활용하여 부모 참조 변수가 자식 객체를 호출했나요?**
- [ ] ✅ **예외 전환(Exception Chaining)을 사용하여 예외의 원인을 출력했나요?**
- [ ] ✅ **try-with-resources를 사용하여 자원을 안전하게 해제했나요?**

---

## 🎉 **💬 최종 목표**
이 문제는 **Java 예외 처리**에 대한 이해와 **실전 프로그래밍 능력**을 높이기 위해 설계되었습니다.  
**안정적인 프로그램 흐름 유지**, **자원 관리**, **예외 위임과 전환**을 실습하여 **예외 처리 능력**을 강화하세요.

---

💡 **문제를 해결하면서 궁금한 점이나 추가 힌트가 필요하면 언제든지 말씀해 주세요!** 😊🚀✨  
**✨ 힘내세요! 완벽하게 해낼 수 있습니다! 💪🔥**
