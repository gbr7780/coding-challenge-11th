package org.example.day03;

import java.io.*;

/**
 * description    : [백준] 25304 - 영수증
 * packageName    : org.example.day03
 * fileName        : Day03_BaekJoon_Q25304
 * author         : kimjongha
 * date           : 25. 4. 9.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 9.        kimjongha       최초 생성
 */
public class Day03_BaekJoon_Q25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /**
         * X : 영수증에 적힌 총 금액
         * N : 영수증에 적힌 구매한 물건의 종류의 수
         * a : 물건의 가격
         * b : 물건의 개수
         * sumPrice : 물건의 가격과 물건의 개수를 합한 가격
         */
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sumPrice = 0;
        // N의 수만큼 반복문 실행
        for (int i = 0; i < N; i++) {
            String[] splitPrice = br.readLine().split(" ");
            int a = Integer.parseInt(splitPrice[0]);
            int b = Integer.parseInt(splitPrice[1]);
            sumPrice += a * b;
        }
        bw.write(X == sumPrice ? "Yes" : "No");
        bw.flush();
        bw.close();

    }

}
