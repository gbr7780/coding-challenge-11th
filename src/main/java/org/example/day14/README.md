# 코딩테스트 챌린지 11기_새싹반 Day14

## 📌 문제
백준 18258 - [큐2](https://www.acmicpc.net/problem/18258)

## 📌 문제 탐색하기
정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 여섯 가지이다.

push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

---
- 문제를 탐색했을때, 고민해야할 부분은 큐는 선입선출(FIFO) 구조이므로 먼저 들어온게 먼저 나가는 방식

- 큐를 구현하기 위해서는 rear과 front를 통해 관리함

- - rear : 다음에 삽입될 인덱스(삽입 위치)

- - front : 큐의 첫번째 요소 인덱스(삭제 대상)

## 📌 코드 설계하기
1. 명령어의 수 입력 받음
2. 큐를 구현하기 위한 변수 선언 (queue, rear, front 등)
3. 명령어의 수까지 반복문 선언
4. 명령어를 공백을 기준으로 파싱
5. push 명령어 구현
6. pop 명령어 구현
7. size 명령어 구현
8. empty 명령어 구현
9. front 명령어 구현
10. back 명령어 구현

## 📌 시도 회차 수정 사항 (Optional)
없음

## 📌 풀이 코드
```java
package org.example.day14;

import java.io.*;

/**
 * description    : 백준 18258 - 큐2
 * packageName    : org.example.day14
 * fileName        : Day14_BaekJoon_Q18258
 * author         : kimjongha
 * date           : 25. 4. 20.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 20.        kimjongha       최초 생성
 */
public class Day14_BaekJoon_Q18258 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 명령어의 수 입력 받음
        int n = Integer.parseInt(br.readLine());

        // 2. 큐를 구현하기 위한 변수 선언 (queue, rear, front)
        int[] queue = new int[n];
        // rear - 다음에 삽입될 인덱스(삽입 위치)
        int rear = 0;
        // front - 큐의 첫번째 요소 인덱스(삭제 대상)
        int front = 0;

        // 3. 명령어의 수까지 반복문 선언
        for (int i = 0; i < n; i++) {

            // 4. 명령어를 공백을 기준으로 파싱
            String[] cmd = br.readLine().split(" ");


            if (cmd[0].equals("push")){
                // 5. push 명령어 구현
                queue[rear] = Integer.parseInt(cmd[1]);
                rear++;
            } else if (cmd[0].equals("pop")) {
                // 6. pop 명령어 구현
                if (front == rear) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue[front] + "\n");
                    front++;
                }
            } else if (cmd[0].equals("size")) {
                // 7. size 명령어 구현
                // size : 정수의 개수는 rear에서 front를 뺀 값
                bw.write(rear-front + "\n");
            } else if (cmd[0].equals("empty")) {
                // 8. empty 명령어 구현
                if (front == rear) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (cmd[0].equals("front")) {
                // 9. front 명령어 구현
                if (front == rear) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue[front] + "\n");
                }
            } else if (cmd[0].equals("back")) {
                // 10. back 명령어 구현
                if (front == rear) {
                    bw.write("-1\n");
                } else {
                    // back - 가장 뒤에 있는 정수는 rear인덱스에서 1를 빼야함.. push할때 +1을 하기 때문임
                    bw.write(queue[rear-1] + "\n");
                }
            }
        }

        bw.flush();
        bw.close();

    }

}

