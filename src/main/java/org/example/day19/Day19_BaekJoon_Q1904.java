package org.example.day19;

import java.io.*;

/**
 * description    : 백준 1904 - 01타일
 * packageName    : org.example.day19
 * fileName        : Day19_BaekJoon_Q1904
 * author         : kimjongha
 * date           : 25. 4. 25.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 25.        kimjongha       최초 생성
 */
public class Day19_BaekJoon_Q1904 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 자연수 n을 입력 받음
        int n = Integer.parseInt(br.readLine());

        // 2. 2진 수열의 개수를 담을 배열 선언.. +2는 n이 1일때 안전
        int[] arr = new int[n+2];

        // 초기값 초기화
        arr[0] = 1;
        arr[1] = 1;

        // 3. 반복문을 통해 DP점화식 적용
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 15746;
        }

        // 4. 결과문 출력
        bw.write(String.valueOf(arr[n]));
        bw.flush();
        bw.close();

    }

}
