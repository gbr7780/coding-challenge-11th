package org.example.day08;

import java.io.*;

/**
 * description    : 백준 1152 - 단어의 개수
 * packageName    : org.example.day08
 * fileName        : Day08_BaekJoon_Q1152
 * author         : kimjongha
 * date           : 25. 4. 14.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 14.        kimjongha       최초 생성
 */
public class Day08_BaekJoon_Q1152 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 문자열 입력받기
        // 2. 입력받은 문자열을 strip() 함수를 사용하여 맨 앞과 맨뒤에 공백 제거
        String inputLine = br.readLine().strip();
        // 3. split()함수를 사용하여 공백을 기준으로 단어를 분리하기
        String[] splitLine = inputLine.split(" ");
        int count = 0;

        // 4. 문자열에 단어가 존재할때 count변수에 단어 개수 담기
        if(!inputLine.isEmpty()) {
            count = splitLine.length;
        }

        // 5. 결과값 출력
        bw.write(count + "\n");
        bw.flush();
        bw.close();

    }

}
