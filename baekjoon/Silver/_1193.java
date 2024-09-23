package baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : baekjoon
 * @date : 2024.09.23
 * @title : 분수찾기
 * @comment :
 */

public class _1193 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int i = 0;
        int s = 1;
        int e = 1;
        while (true){
            if (s <= X && X <= e){
                break;
            }
            s = e+1;
            i++;
            e = s + i;
        }

        StringBuilder sb = new StringBuilder();

        if ((i+2) % 2 == 0){
            sb.append(e-X+1);
            sb.append("/");
            sb.append(X-s+1);         
        } else {
            sb.append(X-s+1);
            sb.append("/");
            sb.append(e-X+1);
        }

        System.out.println(sb.toString());
    }
}
