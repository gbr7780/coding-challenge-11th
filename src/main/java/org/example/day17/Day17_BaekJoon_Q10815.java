package org.example.day17;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * description    : 백준 10815- 숫자 카드
 * packageName    : org.example.day17
 * fileName        : Day17_BaekJoon_Q10815
 * author         : kimjongha
 * date           : 25. 4. 23.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 23.        kimjongha       최초 생성
 */
public class Day17_BaekJoon_Q10815 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. n(상근이가 가지고 있는 숫자 카드의 개수) 입력 받음
        int n = Integer.parseInt(br.readLine());
        // 2. 숫자 카드 입력 받기 및 변수 선언
        Map<Integer, Boolean> map = new HashMap<>();
        StringTokenizer cardTokens = new StringTokenizer(br.readLine());

        // 3. 입력 받은 숫자 카드 파싱하여 map에 저장
        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(cardTokens.nextToken());
            map.put(card,true);
        }

        // 4. m(비교할 숫자 카드의 개수) 입력 받음
        int m = Integer.parseInt(br.readLine());
        // 5. 비교할 카드 입력 받기
        StringTokenizer numberTokens = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {

            int number = Integer.parseInt(numberTokens.nextToken());
            // 6. 가지고 있는 숫자 카드와 비교할 카드 중복 여부 확인
            if(map.containsKey(number)){
                bw.write("1 ");
            }
            else {
                bw.write("0 ");
            }

        }

        bw.flush();
        bw.close();


    }

}
