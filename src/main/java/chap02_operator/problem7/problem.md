## 🧩 **문제 7: 논리 연산자의 진리표 및 활용**

### 📝 **문제 설명**
1. **논리 연산자 (AND, OR, NOT)**에 대한 **진리표**를 출력하세요.
2. **비밀번호 검증 프로그램**을 작성하세요.
    - **조건**:
        - 길이가 8자 이상
        - 숫자를 포함할 것

### 📥 **입력 예시**
비밀번호 입력: Password123

### 📤 **출력 예시**
진리표: A B A && B A || B !A true true true true false true false false true false false true false true true false false false false true

비밀번호 조건 충족: true


### 💡 **힌트**
- **`length()`** 메서드로 비밀번호 길이를 확인하세요.
- **정규 표현식(`matches`)**을 사용하여 숫자 포함 여부를 검사할 수 있습니다.
