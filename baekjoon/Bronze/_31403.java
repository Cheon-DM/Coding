package baekjoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : baekjoon
 * @date : 2024.09.27
 * @title : A+B-C
 * @comment :
 */

public class _31403 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A, B, C;
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append(A).append(B);

        System.out.println(A+B-C);
        System.out.println(Integer.parseInt(sb.toString())-C);
    }
    
}
