# 코딩테스트 챌린지 11기_새싹반 Day2

## 📌 문제
백준 15552 - [빠른 A+B](https://www.acmicpc.net/problem/15552)

## 📌 문제 탐색하기
- 입출력 방식이 느리면 시간초과 문제가 발생
- Java에서 입출력 방식인 Scanner와 System.out.println을 BufferedReader와 BufferedWriter로 변경하여 문제 해결해보기
- BufferedReader와 BufferedWriter는 메모리 버퍼를 사용하기에 효율성이 높음
- T : 테스트케이스의 개수
- A : T줄 입력받는 정수
- B : T줄 입력받는 정수

## 📌 코드 설계하기
1. 테스트 케이스(T) 개수를 입력 받기
2. T 개수만큼 반복문을 돌리고 숫자를 입력 받아 A와 B를 구분하기
3. A,B 더한값 출력

## 📌 시도 회차 수정 사항 (Optional)
- 백준 런타임 에러 - 파일명 수정 및 패키지 경로 제거

## 📌 풀이 코드
```java
public class Day02_BaekJoon_Q15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /**
         * 문제에서 제시하는 변수
         * T : 테스트 케이스 개수
         * A : 첫번째 입력 받는 수
         * B : 두번째 입력 받는 수
         */
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] splitStr = br.readLine().split(" ");
            int A = Integer.parseInt(splitStr[0]);
            int B = Integer.parseInt(splitStr[1]);
            // 버퍼에 담기
            bw.write(A + B + "\n");
        }
        // 버퍼 출력
        bw.flush();
        bw.close();
    }
}