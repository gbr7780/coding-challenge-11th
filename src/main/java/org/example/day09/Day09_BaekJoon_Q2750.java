package org.example.day09;

import java.io.*;
import java.util.Arrays;

/**
 * description    : 백준 2750 - 수 정렬하기
 * packageName    : org.example.day09
 * fileName        : Day09_BaekJoon_Q2750
 * author         : kimjongha
 * date           : 25. 4. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 15.        kimjongha       최초 생성
 */
public class Day09_BaekJoon_Q2750 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. n을 입력받음
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];

        // 2. n개수만큼 수를 입력 받고 정수형 배열에 담기
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        // 3. 정수형 배열을 오름차순으로 정렬
        Arrays.sort(numbers);

        // 4. 출력
        for (int i = 0; i < numbers.length; i++) {
            bw.write(numbers[i] + "\n");
        }

        bw.flush();
        bw.close();


    }

}
