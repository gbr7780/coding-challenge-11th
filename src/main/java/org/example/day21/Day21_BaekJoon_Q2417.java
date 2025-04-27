package org.example.day21;

import java.io.*;

/**
 * description    : 백준 2417 - 정수 제곱근
 * packageName    : org.example.day21
 * fileName        : Day21_BaekJoon_Q2417
 * author         : kimjongha
 * date           : 25. 4. 27.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 27.        kimjongha       최초 생성
 */
public class Day21_BaekJoon_Q2417 {

    // 2. 이진 탐색 구현
    public static long binary_search(long n) {
        long left = 0;
        // 탐색 끝을 n으로 지정
        long right = n;
        long mid;

        while (left <= right) {

            mid = (left + right) / 2;

            // n보다 크거나 같으면 탐색 우측 끝의 범위를 줄임
            if (Math.pow(mid,2) >= n) {
                right = mid -1;
            }
            // n보다 작으면 탐색 좌측 끝의 범위를 줄임
            else if (Math.pow(mid,2) < n) {
                left = mid +1;
            }

        }

        return left;

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. n 입렵받기
        long n = Long.parseLong(br.readLine());

        long result = binary_search(n);

        // 3. 결과값 출력
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }

}
