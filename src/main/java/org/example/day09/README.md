# 코딩테스트 챌린지 11기_새싹반 Day9

## 📌 문제
백준 2750 - [수 정렬하기](https://www.acmicpc.net/problem/2750)

## 📌 문제 탐색하기
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

문제를 탐색했을때 중요한점은 입력받은 수를 오름차순으로 정렬하는것인데 자바에서 정수형 배열을 오름차순으로 정렬해주는 Arrays.sort() 함수가 있고, 아니면 정렬 알고리즘을 구현하여 해결할 수 있을것 같다.

## 📌 코드 설계하기
1. n을 입력 받음
2. n개수만큼 수를 입력 받고 정수형 배열에 담기
3. 정수형 배열을 오름차순으로 정렬
4. 출력

## 📌 시도 회차 수정 사항 (Optional)
없음

## 📌 풀이 코드
```java
package org.example.day09;

import java.io.*;
import java.util.Arrays;

/**
 * description    : 백준 2750 - 수 정렬하기
 * packageName    : org.example.day09
 * fileName        : Day09_BaekJoon_Q2750
 * author         : kimjongha
 * date           : 25. 4. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 15.        kimjongha       최초 생성
 */
public class Day09_BaekJoon_Q2750 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. n을 입력받음
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];

        // 2. n개수만큼 수를 입력 받고 정수형 배열에 담기
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        // 3. 정수형 배열을 오름차순으로 정렬
        Arrays.sort(numbers);

        // 4. 출력
        for (int i = 0; i < numbers.length; i++) {
            bw.write(numbers[i] + "\n");
        }

        bw.flush();
        bw.close();


    }

}




