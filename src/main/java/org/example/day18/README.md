# 코딩테스트 챌린지 11기_새싹반 Day15

## 📌 문제
백준 2747 - [피보나치 수](https://www.acmicpc.net/problem/2747)

## 📌 문제 탐색하기
문제를 탐색했을때, 고민해야할 부분은 DP(Dynamic Programming)으로 풀었을때 재귀보다 얼마나 빠른지가 중요하다.

DP(Dynamic Programming) : 복잡한 문제를 작은 문제로 나눠서 푸는 방법 그리고 이미 푼 작은 문제의 결과를 저장해서 같은 계산을 반복하지 않도록 최적화하는 기법

재귀로 피보나치를 구현한다고 하면 비효율적인 부분이 발생.. 같은 계산이 중복됨

## 📌 코드 설계하기
1. n을 입력 받음
2. 정수형 배열을 선언
3. 반복문을 통해 배열 안에 피보나치 수를 저장
4. 결과값 출력

## 📌 시도 회차 수정 사항 (Optional)
1. bw.write()에서 문자열 변환을 안해서 아스키코드값을 출력함.

## 📌 풀이 코드
```java
package org.example.day18;

import java.io.*;

/**
 * description    : 백준 2747 - 피보나치 수
 * packageName    : org.example.day18
 * fileName        : Day18_BaekJoon_Q2747
 * author         : kimjongha
 * date           : 25. 4. 24.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 24.        kimjongha       최초 생성
 */
public class Day18_BaekJoon_Q2747 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. n을 입력 받음
        int n = Integer.parseInt(br.readLine());
        // 2. 정수형 배열을 선언
        int[] arr = new int[n+1];

        // 3. 배열안에 피보나치 수를 계산하여 저장
        for (int i = 0; i <= n; i++) {
            // 0,1은 배열 저장
            if (i == 0 || i == 1) {
                arr[i] = i;
                continue;
            }
            // 배열에서 이전에 저장된 피보나치 값을 불러와 계산하여 저장
            arr[i] = arr[i-1] + arr[i-2];
        }
        // 4. 결과값 출력
        bw.write(String.valueOf(arr[n]));
        bw.flush();
        bw.close();
    }

}





