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
