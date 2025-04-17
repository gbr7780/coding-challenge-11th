# 코딩테스트 챌린지 11기_새싹반 Day11

## 📌 문제
백준 2798 - [블랙잭](https://www.acmicpc.net/problem/2798)

## 📌 문제 탐색하기
카지노에서 제일 인기 있는 게임 블랙잭의 규칙은 상당히 쉽다. 카드의 합이 21을 넘지 않는 한도 내에서, 카드의 합을 최대한 크게 만드는 게임이다. 블랙잭은 카지노마다 다양한 규정이 있다.
한국 최고의 블랙잭 고수 김정인은 새로운 블랙잭 규칙을 만들어 상근, 창영이와 게임하려고 한다.
김정인 버전의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다. 그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 그런 후에 딜러는 숫자 M을 크게 외친다.
이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.



문제를 탐색했을때, 고민해야할 부분은
1. 3장의 카드 조합을 모두 확인하기 (중복 없이)
2. 3장의 카드 합이 m 이하인 최대값 구하기(카드 순서는 상관없고 합한 결과만 있으면 됨)



- 시간복잡도는 O(N³)
- 3중 for문이고 n ≤ 100이므로 완전탐색(브루트 포스)해도 시간초과는 발생하지 않음

## 📌 코드 설계하기
1. 카드의 개수 n과 목표값 m 입력 받기
2. n개의 카드 숫자 입력 받기
3. 문자열 배열을 정수형 배열로 변환
4. 완전탐색(브루트포스) 적용 : 3장의 카드 조합 모두 확인
5. 3장의 카드 합이 m이하인 최대값 찾기
6. 결과값 출력

## 📌 시도 회차 수정 사항 (Optional)
없음

## 📌 풀이 코드
```java
package org.example.day11;

import java.io.*;
import java.util.StringTokenizer;

/**
 * description    : 백준 2798 - 블랙잭
 * packageName    : org.example.day11
 * fileName        : Day11_BaekJoon_Q2798
 * author         : kimjongha
 * date           : 25. 4. 17.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 17.        kimjongha       최초 생성
 */
public class Day11_BaekJoon_Q2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 카드의 개수 n과 목표값 m 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 2. n개의 카드 숫자 입력 받기
        String[] inputNumbers = br.readLine().split(" ");
        int[] numbers = new int[n];

        // 3. 문자열 배열을 정수형 배열로 변환
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        // 4. 완전탐색(브루트포스) 적용: 3장의 카드 조합 모두 확인
        int result = 0;
        // 첫번째 카드
        for (int i = 0; i < n-2; i++) {
            // 두번째 카드
            for (int j = i + 1; j < n-1; j++) {
                // 세번째 카드
                for (int k = j + 1; k < n; k++) {
                    int total = numbers[i] + numbers[j] + numbers[k];
                    // 5. 3장의 카드 합이 m 이하인 최대값 찾기
                    if(result < total && total <= m){
                        result = total;
                    }
                }
            }
        }

        // 6. 결과값 출력
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

}






