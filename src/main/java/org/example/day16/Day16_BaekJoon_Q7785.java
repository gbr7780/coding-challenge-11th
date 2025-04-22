package org.example.day16;

import java.io.*;
import java.util.*;

/**
 * description    : 백준 7785 - 회사에 있는 사람
 * packageName    : org.example.day16
 * fileName        : Day16_BaekJoon_Q7785
 * author         : kimjongha
 * date           : 25. 4. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 22.        kimjongha       최초 생성
 */
public class Day16_BaekJoon_Q7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 출입기록의 수(n) 입력 받기
        int n = Integer.parseInt(br.readLine());
        // 2. 변수 선언하기(set)
        Set<String> names = new HashSet<>();

        // 3. 출입기록에 대한 반복문 구현
        for (int i = 0; i < n; i++) {
            String[] splitArr = br.readLine().split(" ");
            // 4. 조건문을 통해 enter와 leave일때 set에 add or remove 구현
            if(splitArr[1].equals("enter")) {
                names.add(splitArr[0]);
            }
            else {
                names.remove(splitArr[0]);
            }
        }

        // 5. set을 List로 변환
        List<String> list = new ArrayList<>(names);
        // 6. sort통해 역순으로 정렬
        Collections.sort(list,Collections.reverseOrder());

        // 7. 결과문 출력
        for (String name : list) {
            bw.write(name + "\n");
        }

        bw.flush();
        bw.close();
    }

}
