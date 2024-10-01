package baekjoon.Silver;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author : baekjoon
 * @date : 2024.10.01
 * @title : 쉬운 최단거리
 * @comment :
 */

public class _14940 {

    public static class Pair {
        int x, y;
        int dis;
        Pair(int x, int y, int dis){
            this.x = x;
            this.y = y;
            this.dis = dis;
        }
    }

    public static void main(String[] args) throws IOException{
        System.setIn(new FileInputStream("C:\\Users\\SEC\\Desktop\\baekjoon\\baekjoon\\Bronze\\input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int [][] grp = new int[n][m];
        int [][] ans = new int[n][m];
        int a = 0, b = 0; // START
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++){
                grp[i][j] = Integer.parseInt(st.nextToken());
                if (grp[i][j] == 2) {
                    a = i; b = j;
                }
                if (grp[i][j] != 0){
                    ans[i][j] = -1;
                }
            }
        }

        //BFS
        boolean [][] visited = new boolean[n][m];        
        int[] dx = {1, 0, 0, -1};
        int[] dy = {0, 1, -1, 0};
        Queue<Pair> q = new LinkedList<>();

        // (a,b)에서 시작
        q.offer(new Pair(a, b, 0));
        visited[a][b] = true;

        while(!q.isEmpty()){
            Pair tmp = q.poll();
            ans[tmp.x][tmp.y] = tmp.dis;

            for (int k = 0; k < 4; k++){
                int nx = tmp.x + dx[k];
                int ny = tmp.y + dy[k];
                int ndis = tmp.dis + 1;

                // 경계값 체크
                if (nx < 0 || nx > n-1 || ny < 0 || ny > m-1) continue;
                // 이동불가 체크
                if (grp[nx][ny] == 0) continue;
                // 방문 체크
                if (visited[nx][ny]) continue;

                q.offer(new Pair(nx, ny, ndis));
                visited[nx][ny] = true;
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        

    }
}
