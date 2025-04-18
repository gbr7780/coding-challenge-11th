# 코딩테스트 챌린지 11기_새싹반 Day12

## 📌 문제
백준 2231 - [분해합](https://www.acmicpc.net/problem/2231)

## 📌 문제 탐색하기
어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다. 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
---

문제를 탐색했을때, 고민해야할 부분은 m을 자리수별로 분해하여 합하는것
1. 반복문을 n보다 작을때까지 반복
2. 분해합은 입력이 3자리라고 했을때 i + (백의자리 + 십의자리 + 일의자리)

## 📌 코드 설계하기
1. 자연수 n을 입력받음
2. 브루트포스 알고리즘 : n의 가장 작은 생성자를 찾기 위해 1부터 찾기
3. 분해합 조건 ex) 216을 입력하면 198 + (1+9+8) 즉, i에 대한 각 자리수를 추출하고 i와 더해야 함
4. 맨 마지막 자리 숫자를 추출하여 i와 더하기
5. i에 마지막 자리 제거.. 다음 자리로 넘어가기
6. 분해합 조건이 n과 같으면 결과값 담기
7. 결과값 출력

## 📌 시도 회차 수정 사항 (Optional)
없음

## 📌 풀이 코드
```java
package org.example.day12;

import java.io.*;

/**
 * description    : 백준 2231 - 분해합
 * packageName    : org.example.day12
 * fileName        : Day12_BaekJoon_Q2231
 * author         : kimjongha
 * date           : 25. 4. 18.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 18.        kimjongha       최초 생성
 */
public class Day12_BaekJoon_Q2231 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 자연수 n을 입력받음
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        // 2. 브루트포스 알고리즘 : n의 가장 작은 생성자를 찾기 위해 1부터 찾기
        for (int i = 1; i < n; i++) {

            int sum = i;
            int temp = i;

            // 3. 분해합 조건 ex) 216을 입력하면 198 + (1 + 9 + 8)
            // i에 대한 각 자리수를 추출하고 i와 더해야함
            while (temp > 0) {
                // 4. 맨 마지막 자리 숫자를 추출하여 i와 더하기
                sum += temp % 10;
                // 5. i에 마지막 자리 제거.. 다음 자리로 넘어가기
                temp /= 10;
            }

            // 6. 분해합 조건이 맞으면 결과값 담기
            if(sum == n){
                result = i;
                break;
            }
        }
        // 7. 결과값 출력
        bw.write(result + "\n");
        bw.flush();
        bw.close();



    }

}






