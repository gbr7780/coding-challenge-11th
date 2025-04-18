package org.example.day12;

import java.io.*;

/**
 * description    : 백준 2231 - 분해합
 * packageName    : org.example.day12
 * fileName        : Day12_BaekJoon_Q2231
 * author         : kimjongha
 * date           : 25. 4. 18.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 18.        kimjongha       최초 생성
 */
public class Day12_BaekJoon_Q2231 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 자연수 n을 입력받음
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        // 2. 브루트포스 알고리즘 : n의 가장 작은 생성자를 찾기 위해 1부터 찾기
        for (int i = 1; i < n; i++) {

            int sum = i;
            int temp = i;

            // 3. 분해합 조건 ex) 216을 입력하면 198 + (1 + 9 + 8)
            // i에 대한 각 자리수를 추출하고 i와 더해야함
            while (temp > 0) {
                // 4. 맨 마지막 자리 숫자를 추출하여 i와 더하기
                sum += temp % 10;
                // 5. i에 마지막 자리 제거.. 다음 자리로 넘어가기
                temp /= 10;
            }

            // 6. 분해합 조건이 맞으면 결과값 담기
            if(sum == n){
                result = i;
                break;
            }
        }
        // 7. 결과값 출력
        bw.write(result + "\n");
        bw.flush();
        bw.close();



    }

}
