package org.example.day11;

import java.io.*;
import java.util.StringTokenizer;

/**
 * description    : 백준 2798 - 블랙잭
 * packageName    : org.example.day11
 * fileName        : Day11_BaekJoon_Q2798
 * author         : kimjongha
 * date           : 25. 4. 17.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 17.        kimjongha       최초 생성
 */
public class Day11_BaekJoon_Q2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 카드의 개수 n과 목표값 m 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 2. n개의 카드 숫자 입력 받기
        String[] inputNumbers = br.readLine().split(" ");
        int[] numbers = new int[n];

        // 3. 문자열 배열을 정수형 배열로 변환
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        // 4. 완전탐색(브루트포스) 적용: 3장의 카드 조합 모두 확인
        int result = 0;
        // 첫번째 카드
        for (int i = 0; i < n-2; i++) {
            // 두번째 카드
            for (int j = i + 1; j < n-1; j++) {
                // 세번째 카드
                for (int k = j + 1; k < n; k++) {
                    int total = numbers[i] + numbers[j] + numbers[k];
                    // 5. 3장의 카드 합이 m 이하인 최대값 찾기
                    if(result < total && total <= m){
                        result = total;
                    }
                }
            }
        }

        // 6. 결과값 출력
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

}
