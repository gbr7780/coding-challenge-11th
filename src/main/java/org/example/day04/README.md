# 코딩테스트 챌린지 11기_새싹반 Day4

## 📌 문제
백준 8393 - [합](https://www.acmicpc.net/problem/8393)

## 📌 문제 탐색하기
- n이 주어졌을때, 1부터 n까지 합을 구하기
- 반복문을 통해 n까지 더하는 변수 필요

## 📌 코드 설계하기
1. n을 입력 받음
2. sum변수 초기화
3. 반복문을 통해 n의 수까지 반복
4. 반복문의 i를 sum변수에 더하기
5. 결과값 출력

## 📌 시도 회차 수정 사항 (Optional)
없음

## 📌 풀이 코드
```java
 public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // n을 입력받음
        int n = Integer.parseInt(br.readLine());
        // n까지 합계를 담을 변수 sum
        int sum = 0;

        // n의 수까지 반복문 실행
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        // 결과값 출력
        bw.write(sum+"\n");
        bw.flush();
        bw.close();


    }