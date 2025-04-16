# 코딩테스트 챌린지 11기_새싹반 Day10

## 📌 문제
백준 2587 - [대표값2](https://www.acmicpc.net/problem/2587)

## 📌 문제 탐색하기
어떤 수들이 있을 때, 그 수들을 대표하는 값으로 가장 흔하게 쓰이는 것은 평균이다. 평균은 주어진 모든 수의 합을 수의 개수로 나눈 것이다. 예를 들어 10, 40, 30, 60, 30의 평균은 (10 + 40 + 30 + 60 + 30) / 5 = 170 / 5 = 34가 된다.
평균 이외의 또 다른 대표값으로 중앙값이라는 것이 있다. 중앙값은 주어진 수를 크기 순서대로 늘어 놓았을 때 가장 중앙에 놓인 값이다. 예를 들어 10, 40, 30, 60, 30의 경우, 크기 순서대로 늘어 놓으면
10 30 30 40 60 이 되고 따라서 중앙값은 30이 된다. 
다섯 개의 자연수가 주어질 때 이들의 평균과 중앙값을 구하는 프로그램을 작성하시오.



- 문제를 탐색했을때 다섯개의 수를 입력받는게 정해져있기 때문에  정수형 배열에 대한 크기는 5로 정하고 배열에 값을 넣을때 sum변수에 더해주고 sort()함수를 통해 크기순으로 정렬하고 중앙값을 출력하는식으로 해결하면 될것 같다.

해당 문제에 시간복잡도는 O(N log N) 
- for문에 대한 O(N)과 Arrays.sort()를 진행하므로 O(N log N)

## 📌 코드 설계하기
1. 다섯개의 자연수 입력 받음
2. 정수형 배열 크기순으로 정렬
3. 문제에서 요구하는 평균값, 중앙값 생성
4. 결과값 출력

## 📌 시도 회차 수정 사항 (Optional)
없음

## 📌 풀이 코드
```java
package org.example.day10;

import java.io.*;
import java.util.Arrays;

/**
 * description    :
 * packageName    : org.example.day10
 * fileName        : Day10_BaekJoon_Q2587
 * author         : kimjongha
 * date           : 25. 4. 16.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 16.        kimjongha       최초 생성
 */
public class Day10_BaekJoon_Q2587 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 0. 초기화
        int[] intArr = new int[5];
        int sum = 0;

        // 1. 다섯개의 자연수 입력 받음
        for (int i = 0; i < 5; i++) {
            intArr[i] = Integer.parseInt(br.readLine());
            sum += intArr[i];
        }

        // 2. 정수형 배열 크기순으로 정렬
        Arrays.sort(intArr);

        // 3. 문제에서 요구하는 평균값, 중앙값 생성
        int avg = sum/5;
        int center = intArr[2];

        // 4. 결과값 출력
        bw.write(avg + "\n");
        bw.write(center + "\n");

        bw.flush();
        bw.close();


    }

}





