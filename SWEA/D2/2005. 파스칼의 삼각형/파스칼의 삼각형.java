import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++) {

            int N = sc.nextInt();

            int[][] triangle = new int[N][N];

            
            for(int row=0; row<N; row++) {
                triangle[row][0] = 1;
                triangle[row][row] = 1;

                for(int col=1; col<row; col++) {
                    triangle[row][col] 
                    =triangle[row-1][col-1]
                    +triangle[row-1][col];

                }
            }
            System.out.println("#" + tc);

            for(int row=0; row<N; row++) {
                for(int col=0; col<=row; col++) {
                    System.out.print(triangle[row][col]+" ");
                }
                System.out.println( );
            }
        }
    }
}
