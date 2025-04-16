package org.example.day10;

import java.io.*;
import java.util.Arrays;

/**
 * description    : 백준 2587 - 대표값2
 * packageName    : org.example.day10
 * fileName        : Day10_BaekJoon_Q2587
 * author         : kimjongha
 * date           : 25. 4. 16.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 16.        kimjongha       최초 생성
 */
public class Day10_BaekJoon_Q2587 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 0. 초기화
        int[] intArr = new int[5];
        int sum = 0;

        // 1. 다섯개의 자연수 입력 받음
        for (int i = 0; i < 5; i++) {
            intArr[i] = Integer.parseInt(br.readLine());
            sum += intArr[i];
        }

        // 2. 정수형 배열 크기순으로 정렬
        Arrays.sort(intArr);

        // 3. 문제에서 요구하는 평균값, 중앙값 생성
        int avg = sum/5;
        int center = intArr[2];

        // 4. 결과값 출력
        bw.write(avg + "\n");
        bw.write(center + "\n");

        bw.flush();
        bw.close();


    }

}
