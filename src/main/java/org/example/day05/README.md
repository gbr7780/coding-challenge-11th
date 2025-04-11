# 코딩테스트 챌린지 11기_새싹반 Day5

## 📌 문제
백준 10818 - [최소, 최대](https://www.acmicpc.net/problem/10818)

## 📌 문제 탐색하기
- N개의 정수가 주어졌을때 최솟값과 최댓값을 출력하기
- 필요한 변수
- - n : 정수를 입력 받음
- - strArr : n개의 정수를 배열에 저장
- - intArr : 문자열 배열을 정수형으로 변환
- - min : 최솟값
- - max : 최댓값
- 문자열 배열을 정수형으로 전환하고 반복문을 통해 min과 max를 추출

## 📌 코드 설계하기
1. n을 입력 받음
2. strArr의 n의 개수에 대한 정수를 입력 받음
3. 문자열 배열을 정수열 배열로 전환하기(strArr -> intArr)
4. min과 max변수의 intArr[0] 초기화
5. 반복문을 통해 최솟값과 최댓값을 비교하여 추출
6. min, max 출력

## 📌 시도 회차 수정 사항 (Optional)
없음

## 📌 풀이 코드
```java
package org.example.day05;

import java.io.*;

/**
 * description    : 백준 10818 - 최소, 최대
 * packageName    : org.example.day05
 * fileName        : Day05_BaekJoon_Q10818
 * author         : kimjongha
 * date           : 25. 4. 11.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 11.        kimjongha       최초 생성
 */
public class Day05_BaekJoon_Q10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. n을 입력받음
        int n = Integer.parseInt(br.readLine());

        // 2. strArr의 n의 개수에 대한 정수를 입력 받음
        String[] strArr = br.readLine().split(" ");
        // 정수형 배열 초기화
        int[] intArr = new int[n];

        // 3. 문자열 배열을 정수열 배열로 전환하기(strArr -> intArr)
        for (int i = 0; i < n; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        // 4. min과 max변수의 intArr[0] 초기화
        int min = intArr[0];
        int max = intArr[0];

        // 5. 반복문을 통해 최솟값과 최댓값을 비교하여 추출
        for (int i = 0; i < n; i++) {
            if(intArr[i] < min) {
                min = intArr[i];
            }
            if(intArr[i] > max) {
                max = intArr[i];
            }
        }

        // 6. min, max 출력
        bw.write(min + " " + max + "\n");
        bw.flush();
        bw.close();
    }
}
