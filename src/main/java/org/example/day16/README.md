# 코딩테스트 챌린지 11기_새싹반 Day15

## 📌 문제
백준 7785 - [회사에 있는 사람](https://www.acmicpc.net/problem/7782)

## 📌 문제 탐색하기
상근이는 세계적인 소프트웨어 회사 기글에서 일한다. 이 회사의 가장 큰 특징은 자유로운 출퇴근 시간이다. 따라서, 직원들은 반드시 9시부터 6시까지 회사에 있지 않아도 된다.
각 직원은 자기가 원할 때 출근할 수 있고, 아무때나 퇴근할 수 있다.
상근이는 모든 사람의 출입카드 시스템의 로그를 가지고 있다. 이 로그는 어떤 사람이 회사에 들어왔는지, 나갔는지가 기록되어져 있다. 로그가 주어졌을 때, 현재 회사에 있는 모든 사람을 구하는 프로그램을 작성하시오.
---

문제를 탐색했을때, 고민해야할 부분은 이름을 중복없이 관리하고, 이름을 역순으로 정렬
- 자료구조중에서 중복을 제외하고 관리하는 Set을 사용하고
- 역순은 자바에 sort를 통해 역순으로 정렬

## 📌 코드 설계하기
1. 출입기록의 수(n) 입력 받기
2. 변수 선언하기(set)
3. 출입기록에 대한 반복문 구현
4. 조건문을 통해 enter와 leave일때 set에 add or remove 구현
5. set을 List로 변환
6. sort통해 역순으로 정렬
7. 결과문 출력

## 📌 시도 회차 수정 사항 (Optional)
없음

## 📌 풀이 코드
```java
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



