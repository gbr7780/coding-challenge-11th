# 코딩테스트 챌린지 11기_새싹반 Day21

## 📌 문제
백준 2417 - [정수 제곱근](https://www.acmicpc.net/problem/2417)

## 📌 문제 탐색하기
문제를 탐색했을때, 고민해야할 부분은 지난 문제와 마찬가지로 이분 탐색을 이용하여 문제를 접근하면 된다.
단, 숫자가 크기 때문에 오버플로우 발생할 수 있으므로 long타입으로 선언하거나 캐스팅 주의

이분 탐색 구현시
1. 중간값(mid)의 제곱이 n보다 크거나 같으면 탐색 범위에서 우측을 줄이고

2. 중간값(mid)의 제곱이 n보다 작으면 탐색 범위에서 좌측을 늘린다

## 📌 코드 설계하기
1. n 입력받기
2. 이분 탐색 메소드 정의하고 탐색
3. 결과값 출력

## 📌 시도 회차 수정 사항 (Optional)
없음

## 📌 풀이 코드
```java
package org.example.day21;

import java.io.*;

/**
 * description    : 백준 2417 - 정수 제곱근
 * packageName    : org.example.day21
 * fileName        : Day21_BaekJoon_Q2417
 * author         : kimjongha
 * date           : 25. 4. 27.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 27.        kimjongha       최초 생성
 */
public class Day21_BaekJoon_Q2417 {

    // 2. 이진 탐색 구현
    public static long binary_search(long n) {
        long left = 0;
        // 탐색 끝을 n으로 지정
        long right = n;
        long mid;

        while (left <= right) {

            mid = (left + right) / 2;

            // n보다 크거나 같으면 탐색 우측 끝의 범위를 줄임
            if (Math.pow(mid,2) >= n) {
                right = mid -1;
            }
            // n보다 작으면 탐색 좌측 끝의 범위를 줄임
            else if (Math.pow(mid,2) < n) {
                left = mid +1;
            }

        }

        return left;

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. n 입렵받기
        long n = Long.parseLong(br.readLine());

        long result = binary_search(n);

        // 3. 결과값 출력
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }

}








