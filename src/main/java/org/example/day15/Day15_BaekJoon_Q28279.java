package org.example.day15;

import java.io.*;

/**
 * description    : 백준 28279 - 덱2
 * packageName    : org.example.day15
 * fileName        : Day15_BaekJoon_Q28279
 * author         : kimjongha
 * date           : 25. 4. 21.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 21.        kimjongha       최초 생성
 */
public class Day15_BaekJoon_Q28279 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 명령어의 수 입력 받음
        int n = Integer.parseInt(br.readLine());
        // 2. 덱을 구현하기 위한 변수 선언 (deck, rear, front).. 배열에 중간부터 넣기 위해 크기를 2배로 곱함
        int[] deck = new int[2 * n];
        // 덱 앞 포인터는 배열 중간에서 시작
        int front = n;
        // 덱 뒤 포인터는 배열 중간에서 시작
        int rear = n;

        for (int i = 0; i < n; i++) {
            // 3. 입력 받은 명령어 파싱
            String[] cmd = br.readLine().split(" ");
            
            if (cmd[0].equals("1")) {
                /**
                 * 1 : 덱에 앞에 push
                 * 배열 인덱스 중간에서 front--하여 앞으로 이동하고 정수 저장
                 */
                front--;
                deck[front] = Integer.parseInt(cmd[1]);
            } else if (cmd[0].equals("2")) {
                /**
                 * 2 : 덱에 뒤에 push
                 * 배열 인덱스 중간에서 정수를 저장하고 rear++하여 뒤로 이동
                 */
                deck[rear] = Integer.parseInt(cmd[1]);
                rear++;
            } else if (cmd[0].equals("3")) {
                /**
                 * 3 : 덱에 앞에서 pop
                 * front == rear는 정수가 없을때
                 * 덱에 앞에서 정수를 빼고 front+1해서 뒤로 이동
                 */
                if(front == rear) {
                    bw.write("-1\n");
                } else {
                    bw.write(deck[front] + "\n");
                    ++front;
                }
            } else if (cmd[0].equals("4")) {
                /**
                 * 4 : 덱에 뒤에서 pop
                 * front == rear는 정수가 없을때
                 * rear 앞으로 이동하고 덱에 정수 빼기
                 */
                if (rear == front) {
                    bw.write("-1\n");
                } else {
                    rear--;
                    bw.write(deck[rear] + "\n");
                }
            } else if (cmd[0].equals("5")) {
                /**
                 * 5 : 정수의 크기
                 * rear에서 front를 뺀 값
                 */
                bw.write((rear - front) + "\n");
            } else if (cmd[0].equals("6")) {
                if (rear == front) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (cmd[0].equals("7")) {
                /**
                 * 7 : 덱에 앞에 있는 정수를 출력
                 */
                if(front == rear) {
                    bw.write("-1\n");
                } else {
                    bw.write(deck[front] + "\n");
                }
            } else if (cmd[0].equals("8")) {
                /**
                 * 8 : 덱에 뒤에 있는 정수를 출력
                 */
                if (rear == front) {
                    bw.write("-1\n");
                } else {
                    bw.write(deck[rear-1] + "\n");
                }
            }
        }

        bw.flush();
        bw.close();

    }

}
