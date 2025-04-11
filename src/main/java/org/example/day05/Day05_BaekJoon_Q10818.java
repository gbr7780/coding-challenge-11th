package org.example.day05;

import java.io.*;

/**
 * description    : 백준 10818 - 최소, 최대
 * packageName    : org.example.day05
 * fileName        : Day05_BaekJoon_Q10818
 * author         : kimjongha
 * date           : 25. 4. 11.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 11.        kimjongha       최초 생성
 */
public class Day05_BaekJoon_Q10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. n을 입력받음
        int n = Integer.parseInt(br.readLine());

        // 2. strArr의 n의 개수에 대한 정수를 입력 받음
        String[] strArr = br.readLine().split(" ");
        // 정수형 배열 초기화
        int[] intArr = new int[n];

        // 3. 문자열 배열을 정수열 배열로 전환하기(strArr -> intArr)
        for (int i = 0; i < n; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        // 4. min과 max변수의 intArr[0] 초기화
        int min = intArr[0];
        int max = intArr[0];

        // 5. 반복문을 통해 최솟값과 최댓값을 비교하여 추출
        for (int i = 0; i < n; i++) {
            if(intArr[i] < min) {
                min = intArr[i];
            }
            if(intArr[i] > max) {
                max = intArr[i];
            }
        }

        // 6. min, max 출력
        bw.write(min + " " + max + "\n");
        bw.flush();
        bw.close();
    }
}
