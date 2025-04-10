package org.example.day04;

import java.io.*;

/**
 * description    : 백준 8393 - 합
 * packageName    : org.example.day04
 * fileName        : Day04_BaekJoon_Q8393
 * author         : kimjongha
 * date           : 25. 4. 10.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 10.        kimjongha       최초 생성
 */
public class Day04_BaekJoon_Q8393 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // n을 입력받음
        int n = Integer.parseInt(br.readLine());
        // n까지 합계를 담을 변수 sum
        int sum = 0;

        // n의 수까지 반복문 실행
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        // 결과값 출력
        bw.write(sum+"\n");
        bw.flush();
        bw.close();


    }
}
