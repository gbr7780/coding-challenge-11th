# 코딩테스트 챌린지 11기_새싹반 Day20

## 📌 문제
백준 1920 - [수 찾기](https://www.acmicpc.net/problem/1920)

## 📌 문제 탐색하기
문제를 탐색했을때, 고민해야할 부분은 순차적 탐색으로 탐색을 하면 시간이 오래 걸려 이분(이진) 탐색 사용하기

이분 탐색이란? 순차적 탐색보다 빠른 탐색을 위해 나온 탐색 방법으로 실제로 이분 탐색의 시간 복잡도가 순차적 탐색보다 낮음
- 정렬된 배열 안에서 특정 원소를 찾을때 인덱스 i부터 j의 중간값과 비교
- 중간값이 찾는 원소가 아니라면 인덱스 i와 j 다시 정해줌
- 인덱스 i와 j의 정할때마다 탐색 범위를 반으로 줄어듦

이분 탐색을 적용시 반복문 또는 재귀를 통해 구현하는데 해당 문제에서는 반복문을 통해 구현하겠다.

## 📌 코드 설계하기
1. n의 개수와 n정수 입력 / m의 개수와 m정수 입력
2. n배열을 오름차순으로 정렬(이분 탐색시 정렬은 필수)
3. 이분 탐색 메소드 정의하고 탐색
4. 결과값 출력

## 📌 시도 회차 수정 사항 (Optional)
없음

## 📌 풀이 코드
```java
package org.example.day20;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * description    : 백준 1920 - 수 찾기
 * packageName    : org.example.day20
 * fileName        : Day20_BaekJoon_Q1920
 * author         : kimjongha
 * date           : 25. 4. 26.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * —————————————————————————————
 * 25. 4. 26.        kimjongha       최초 생성
 */
public class Day20_BaekJoon_Q1920 {

    // 이진 탐색
    public static boolean binary_search(int[] nArr, int m) {
        // left : 탐색 범위에 왼쪽 끝 인덱스
        int left = 0;
        // right : 탐색 범위에 오른쪽 끝 인덱스
        int right = nArr.length - 1;
        // 탐색 범위에 가운데 인덱스
        int mid;

        // 반복문을 통해 탐색
        while (left <= right) {

            mid = (left + right) / 2;

            // 찾는 숫자가 mid값과 같으면 탐색 완료
            if (m == nArr[mid]) {
                return true;
            }
            // 찾는 숫자가 mid보다 작으면 right의 범위를 mid-1로 변경함
            else if (m < nArr[mid]) {
                right = mid -1;
            }
            // 찾는 숫자가 mid보다 크면 left의 범위를 mid+1로 변경함
            else if (m > nArr[mid]) {
                left = mid +1;
            }
        }
        // left가 right보다 크면 배열안에 탐색하고싶은 숫자가 없음
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // n개의 정수 입력
        int n = Integer.parseInt(br.readLine());
        int[] nArr = new int[n];

        StringTokenizer nToken = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nArr[i] = Integer.parseInt(nToken.nextToken());
        }

        // n배열 정렬.. 이진 탐색시 정렬은 필수
        Arrays.sort(nArr);

        // m개의 정수 입력
        int m = Integer.parseInt(br.readLine());
        int[] mArr = new int[m];

        StringTokenizer mToken = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            mArr[i] = Integer.parseInt(mToken.nextToken());
        }

        // 탐색
        for (int i = 0; i < m; i++) {

            // 결과값
            boolean check = binary_search(nArr, mArr[i]);

            // 찾는 숫자가 존재할때
            if (check) {
                bw.write("1\n");
            }
            // 찾는 숫자가 없을때
            else {
                bw.write("0\n");
            }

        }

        bw.flush();
        bw.close();

    }

}







