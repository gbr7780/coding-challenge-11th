# 코딩테스트 챌린지 11기_새싹반 Day3

## 📌 문제
백준 25304 - [영수증](https://www.acmicpc.net/problem/25304)

## 📌 문제 탐색하기
- 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes, 일치하지 않으면 No 출력
- 문제에서 제시하는 변수
- X : 영수증에 적힌 총 금액
- N : 영수증에 적힌 구매한 물건의 종류의 수
- a : 물건의 가격
- b : 물건의 개수

## 📌 코드 설계하기
1. 총 금액 X를 입력 받기
2. 물건의 종류의 수 N를 입력받기
3. N의 수 만큼 반복문을 실행
4. 반복문에서 a(물건의 가격)와 b(물건의 개수) 입력 받고 split함수를 통해 각각 구분함
5. 구분한 변수 a와b를 정수형으로 변환하고 곱하고 결과값을 sumPrice변수에 합함
6. 반복문의 끝날때까지 위의 4번과 5번을 진행함
7. X(영수증 총 금액)와 sumPrice 일치하면 Yes출력, 불일치하면 No출력

## 📌 시도 회차 수정 사항 (Optional)
없음

## 📌 풀이 코드
```java
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /**
         * X : 영수증에 적힌 총 금액
         * N : 영수증에 적힌 구매한 물건의 종류의 수
         * a : 물건의 가격
         * b : 물건의 개수
         * sumPrice : 물건의 가격과 물건의 개수를 합한 가격
         */
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sumPrice = 0;
        // N의 수만큼 반복문 실행
        for (int i = 0; i < N; i++) {
            String[] splitPrice = br.readLine().split(" ");
            int a = Integer.parseInt(splitPrice[0]);
            int b = Integer.parseInt(splitPrice[1]);
            sumPrice += a * b;
        }
        bw.write(X == sumPrice ? "Yes" : "No");
        bw.flush();
        bw.close();

}