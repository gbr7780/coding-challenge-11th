package org.example.day02;

import java.io.*;

/**
 * description    : [백준] 15552 - 빠른 A+B
 * packageName    : org.example.day02
 * fileName        : Day02_BaekJoon_Q15552
 * author         : kimjongha
 * date           : 25. 4. 8.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 8.        kimjongha       최초 생성
 */
public class Day02_BaekJoon_Q15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /**
         * 문제에서 제시하는 변수
         * T : 테스트 케이스 개수
         * A : 첫번째 입력 받는 수
         * B : 두번째 입력 받는 수
         */
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] splitStr = br.readLine().split(" ");
            int A = Integer.parseInt(splitStr[0]);
            int B = Integer.parseInt(splitStr[1]);
            // 버퍼에 담기
            bw.write(A + B + "\n");
        }
        // 버퍼 출력
        bw.flush();
        bw.close();
    }
}
