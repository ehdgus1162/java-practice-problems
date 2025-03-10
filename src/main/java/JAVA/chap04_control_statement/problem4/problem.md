# 📘 문제 4: switch 구문 심화 (월별 계절 출력)

---

## 📝 **문제 설명**
- 사용자로부터 **월(1~12)**을 입력받아 해당 월의 **계절**을 출력하는 프로그램을 작성하세요.
- 월별 계절은 다음과 같이 구분합니다:
    - 🌸 **봄**: 3월 ~ 5월
    - ☀️ **여름**: 6월 ~ 8월
    - 🍂 **가을**: 9월 ~ 11월
    - ❄️ **겨울**: 12월 ~ 2월
- **잘못된 월**을 입력한 경우 `"잘못된 입력입니다."`를 출력하세요.

---

## 🎯 **요구사항**
1. 사용자로부터 **1~12 사이의 정수**를 입력받습니다.
2. **switch** 구문을 사용하여 입력된 월에 따른 **계절**을 출력합니다.
3. **1~12** 이외의 숫자를 입력하면 **"잘못된 입력입니다."**를 출력합니다.

---

## ⚙️ **세부 조건**
- `Scanner` 클래스를 사용하여 입력을 처리합니다.
- `switch` 구문에서 **복수의 case**를 활용하여 계절을 판별합니다.
- Java 12 이상을 사용할 경우 **향상된 switch 문법(`->`)**을 활용할 수 있습니다.

---

## 💡 **입력 형식**
- 월을 나타내는 **정수형 숫자**를 한 개 입력합니다.
```plaintext
<월>
📤 출력 형식
입력된 월에 따른 계절 출력:

봄입니다.   // 3~5월
여름입니다. // 6~8월
가을입니다. // 9~11월
겨울입니다. // 12~2월
잘못된 입력 처리:

잘못된 입력입니다.
💻 입력 예시

11
📊 출력 예시

가을입니다.