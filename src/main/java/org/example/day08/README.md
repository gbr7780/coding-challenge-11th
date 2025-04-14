# 코딩테스트 챌린지 11기_새싹반 Day8

## 📌 문제
백준 1152 - [단어의 개수](https://www.acmicpc.net/problem/1152)

## 📌 문제 탐색하기
영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

문제에서 필요한 변수
- inputLine : 문제에서 입력받는 문자열
- splitLine : 입력 받은 문자열을 공백 기준으로 나눈 문자열 배열
- count : 문자열에 존재하는 단어의 개수

위의 문제에서 입력은 처음과 마지막이 공백으로 시작할 수 있다고 제시했기에 inputLine에서 trim() 또는 strip()를 사용하여 맨 앞이랑 맨 뒤에 공백을 제거하는게 중요함

## 📌 코드 설계하기
1. 문자열 입력받기
2. 입력받은 문자열을 strip() 함수를 사용하여 맨 앞과 맨뒤에 공백 제거
3. split()함수를 사용하여 공백을 기준으로 단어를 분리하기
4. 문자열에 단어가 존재할때 count변수에 단어 개수 담기
5. 결과값 출력

## 📌 시도 회차 수정 사항 (Optional)
없음

## 📌 풀이 코드
```java
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



