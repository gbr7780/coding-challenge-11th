# 코딩테스트 챌린지 11기_새싹반 Day13

## 📌 문제
백준 10828 - [스택](https://www.acmicpc.net/problem/10828)

## 📌 문제 탐색하기
정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
---

- 문제를 탐색했을때, 고민해야할 부분은 스택은 선입선출(먼저 들어온게 먼저 나감) 구조이고 top(스택의 현재 위치)을 구현하고 관리하는게  핵심
- top을 통해 push이든 pop이든 나머지든 메소드들을 컨트롤 하기 때문

## 📌 코드 설계하기
1. 명령어의 수 입력 받음
2. 핵심 변수 초기화(stack, top 등)
3. 명령어의 수까지 반복문 실행
4. 명령어 입력
5. 명령어에 따라 조건문 분기 처리
6. 결과 출력

## 📌 시도 회차 수정 사항 (Optional)
없음

## 📌 풀이 코드
```java
package org.example.day13;

import java.io.*;

/**
 * description    : 백준 10828 - 스택
 * packageName    : org.example.day13
 * fileName        : Day13_BaekJoon_Q10828
 * author         : kimjongha
 * date           : 25. 4. 19.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 19.        kimjongha       최초 생성
 */
public class Day13_BaekJoon_Q10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 명령어의 수 입력 받음
        int inputLine = Integer.parseInt(br.readLine());
        // 2. 핵심 변수 초기화(stack, top 등)
        int[] stack = new int[inputLine];
        int top = 0;

        // 3. 명령어의 수까지 반복문 실행
        for (int i = 0; i < inputLine; i++) {
            // 4. 명령어 입력
            String[] cmd = br.readLine().split(" ");

            // 5. 명령어에 따라 조건문 분기 처리
            if(cmd[0].equals("push")){
                /**
                 * Push : 정수를 스택에 넣기
                 * 현재 top 위치에 정수를 넣고 top값을 +1하면서 다음 요소 위치로 넘김
                 */
                stack[top] = Integer.parseInt(cmd[1]);
                top++;
            } else if(cmd[0].equals("pop")){
                /**
                 * pop : 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력 없는 경우 -1 출력
                 * top이 0일경우는 요소를 뺄 수 없기에 -1출력하고, 요소가 있을때는 현재 위치를 -1하고 맨 위에 정수 출력
                 */
                if (top == 0) {
                    bw.write("-1\n");
                } else {
                    --top;
                    bw.write(stack[top] + "\n");
                }
            } else if (cmd[0].equals("size")) {
                /**
                 * size : 스택에 들어있는 정수의 개수 출력
                 */
                bw.write(top + "\n");
            } else if (cmd[0].equals("empty")) {
                /**
                 * empty : 스택이 비어있으면 1, 아니면 0을 출력
                 */
                if (top == 0) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (cmd[0].equals("top")) {
                /**
                 * 스택의 가장 위에 있는 정수를 출력, 스택에 들어있는 정수가 없으면 -1 출력
                 */
                if (top == 0){
                    bw.write("-1\n");
                } else {
                    bw.write(stack[top-1] + "\n");
                }
            }
        }

        // 6. 결과 출력
        bw.flush();
        bw.close();


    }

}
