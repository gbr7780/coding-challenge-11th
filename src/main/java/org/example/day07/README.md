# 코딩테스트 챌린지 11기_새싹반 Day7

## 📌 문제
백준 10988 - [팰린드롬인지 확인하기](https://www.acmicpc.net/problem/10988)

## 📌 문제 탐색하기
알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.

위에 문제에서 필요한 변수
- input - 입력 받는 문자열
- reverse - input에 거꾸로 된 문자열
즉, 문제를 해결할려면 reverse를 어떻게 해야하는가 중요한데 자바에서는 두가지 방법이 있다
1. 반복문을 통해 기존 문자열에 끝에서 charAt함수로 한개씩 append하기
2. reverse함수를 이용하여 기존 문자열을 거꾸로 변경하기

 문제에서는 입력 문자열을 100자 이내로 제한을 했기 때문에 성능에서는 1번이나 2번이나 크게 차이가 없다 간결한 2번을 사용하여 풀기로 결정 
- 문자열 라이브러리 제한이 있으면 chatAt()으로 해야함!
- 문자열 길이가 길면 reverse()로 하는게 유리함!

## 📌 코드 설계하기
1. 단어를 입력 받음
2. StringBuilder reverse()함수를 통해 위 단어에 거꾸로 된 문자열을 저장
3. 비교하고 출력하기

## 📌 시도 회차 수정 사항 (Optional)
없음

## 📌 풀이 코드
```java
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


