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
