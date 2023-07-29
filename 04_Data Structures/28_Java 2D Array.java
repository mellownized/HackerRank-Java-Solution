import java.util.Scanner;

/*
 * AUTHOR: TONMOY M
 * URL: https://github.com/qinetique
 * */

public class Solution {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int array[][] = new int[6][6];

        for (int i = 0; i <6; i++){
            for (int j = 0; j < 6; j++){
                array[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < 4 ; i++){
            for (int j = 0; j < 4; j++){
                int add = array[i+0][j+0]+ array[i+0][j+1]+array[i+0][j+2]+array[i+1][j+1]+array[i+2][j+0]+array[i+2][j+1]+array[i+2][j+2];
                max = Math.max(max,add);
            }
        }
        System.out.println(max);
    }
}