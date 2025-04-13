package org.example.day07;

import java.io.*;

/**
 * description    : 백준 10988 - 팰린드롬인지 확인하기
 * packageName    : org.example.day07
 * fileName        : Day07_BaekJoon_Q10988
 * author         : kimjongha
 * date           : 25. 4. 13.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 13.        kimjongha       최초 생성
 */
public class Day07_BaekJoon_Q10988 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 단어를 입력 받음
        String input = br.readLine();
        // 2. StringBuilder reverse함수를 통해 위 단어에 거꾸로 된 문자열을 저장
        String reverse = new StringBuilder(input).reverse().toString();
        // 3. 비교하고 출력하기
        bw.write(input.equals(reverse) ? "1" : "0");
        bw.flush();
        bw.close();


    }

}
