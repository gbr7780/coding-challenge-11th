# 코딩테스트 챌린지 11기_새싹반 Day15

## 📌 문제
백준 10815 - [숫자 카드](https://www.acmicpc.net/problem/10815)

## 📌 문제 탐색하기
숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.

첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다. 두 숫자 카드에 같은 수가 적혀있는 경우는 없다.
셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 넷째 줄에는 상근이가 가지고 있는 숫자 카드인지 아닌지를 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다
---
문제를 탐색했을때, 고민해야할 부분은 카드가 중복을 허용하지 않고 단순 입출력에 대한 비교이므로 속도가 중요

멘토 가이드 - Map 자료구조를 사용하여 해결하기

Map 특징

1. Key(키)와 Value(값)이 쌍으로 이루어진 자료구조

2. Key의 중복을 허용하지 않아야 함

## 📌 코드 설계하기
1. n(상근이가 가지고 있는 숫자 카드의 개수) 입력 받음
2. 숫자 카드 입력 받기 및 변수 선언
3. 입력 받은 숫자 카드 파싱하여 map에 저장
4. m(비교할 숫자 카드의 개수) 입력 받음
5. 비교할 카드 입력 받기
6. 가지고 있는 숫자 카드와 비교할 카드 중복 여부 확인
7. 결과문 출력

## 📌 시도 회차 수정 사항 (Optional)
없음

## 📌 풀이 코드
```java
package org.example.day17;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * description    : 백준 10815- 숫자 카드
 * packageName    : org.example.day17
 * fileName        : Day17_BaekJoon_Q10815
 * author         : kimjongha
 * date           : 25. 4. 23.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 23.        kimjongha       최초 생성
 */
public class Day17_BaekJoon_Q10815 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. n(상근이가 가지고 있는 숫자 카드의 개수) 입력 받음
        int n = Integer.parseInt(br.readLine());
        // 2. 숫자 카드 입력 받기 및 변수 선언
        Map<Integer, Boolean> map = new HashMap<>();
        StringTokenizer cardTokens = new StringTokenizer(br.readLine());

        // 3. 입력 받은 숫자 카드 파싱하여 map에 저장
        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(cardTokens.nextToken());
            map.put(card,true);
        }

        // 4. m(비교할 숫자 카드의 개수) 입력 받음
        int m = Integer.parseInt(br.readLine());
        // 5. 비교할 카드 입력 받기
        StringTokenizer numberTokens = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {

            int number = Integer.parseInt(numberTokens.nextToken());
            // 6. 가지고 있는 숫자 카드와 비교할 카드 중복 여부 확인
            if(map.containsKey(number)){
                bw.write("1 ");
            }
            else {
                bw.write("0 ");
            }

        }

        bw.flush();
        bw.close();


    }

}




