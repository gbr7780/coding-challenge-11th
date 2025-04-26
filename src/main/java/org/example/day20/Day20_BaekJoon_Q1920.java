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
