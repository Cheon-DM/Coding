package baekjoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author : baekjoon
 * @date : 2024.09.22
 * @title : 분산처리
 * @comment :
 */

public class _1009 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T;
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a, b;
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            int result = 1;

            for (int j = 0; j < b; j++){
                result = result * a % 10;
            }

            result = result == 0 ? 10 : result;

            System.out.println(result);
        }
    }
}