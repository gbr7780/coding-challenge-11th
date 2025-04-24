package org.example.day18;

import java.io.*;

/**
 * description    : 백준 2747 - 피보나치 수
 * packageName    : org.example.day18
 * fileName        : Day18_BaekJoon_Q2747
 * author         : kimjongha
 * date           : 25. 4. 24.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 24.        kimjongha       최초 생성
 */
public class Day18_BaekJoon_Q2747 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. n을 입력 받음
        int n = Integer.parseInt(br.readLine());
        // 2. 정수형 배열을 선언
        int[] arr = new int[n+1];

        // 3. 배열안에 피보나치 수를 계산하여 저장
        for (int i = 0; i <= n; i++) {
            // 0,1은 배열 저장
            if (i == 0 || i == 1) {
                arr[i] = i;
                continue;
            }
            // 배열에서 이전에 저장된 피보나치 값을 불러와 계산하여 저장
            arr[i] = arr[i-1] + arr[i-2];
        }
        // 4. 결과값 출력
        bw.write(String.valueOf(arr[n]));
        bw.flush();
        bw.close();
    }

}
