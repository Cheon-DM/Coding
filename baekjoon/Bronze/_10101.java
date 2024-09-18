package baekjoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : baekjoon
 * @date : 2024.09.18
 * @title : 삼각형 외우기
 * @comment :
 */

public class _10101 {
    public static void main(String[] args) throws IOException{

        // input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());


        // output
        if (a == 60 && b == 60 && c == 60){
            System.out.println("Equilateral");
        } else if (a+b+c == 180 && (a == b || b == c || c == a)){
            System.out.println("Isosceles");
        } else if (a+b+c == 180 && (a != b || b != c || c != a)){
            System.out.println("Scalene");
        } else if (a+b+c != 180){
            System.out.println("Error");
        }
    }
}
