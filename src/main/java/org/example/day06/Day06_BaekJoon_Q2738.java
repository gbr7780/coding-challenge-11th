package org.example.day06;

import java.io.*;
import java.util.StringTokenizer;

/**
 * description    : 백준 2738 - 행렬 덧셈
 * packageName    : org.example.day06
 * fileName        : Day06_BaekJoon_Q2738
 * author         : kimjongha
 * date           : 25. 4. 12.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 12.        kimjongha       최초 생성
 */
public class Day06_BaekJoon_Q2738 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /**
         * 문제에서 제시하는 변수
         * n : 이차원 배열에 row
         * m : 이차원 배열에 col
         * a : 이차원 배열 A
         * b : 이차원 배열 B
         */


        // 1. N과 M을 입력받음
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 2. 이차원 배열 A와 B를 생성 크기는 N과M으로 선언
        int [][] a = new int[n][m];
        int [][] b = new int[n][m];

        // 3. 이중 반복문을 통해 이차원 배열 인덱스에 입력받은 값을 담기
        for (int i = 0; i < n; i++) {
            String[] inputLineA = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                a[i][j] = Integer.parseInt(inputLineA[j]);
            }
        }
        for (int i = 0; i < n; i++) {
            String[] inputLineB = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                b[i][j] = Integer.parseInt(inputLineB[j]);
            }
        }

        // 4. 출력문에 각 이차원 배열 A와 B를 더한값을 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bw.write(a[i][j] + b[i][j] + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();

    }

}
