/*
 * AUTHOR: TONMOY M
 * URL: https://github.com/qinetique
 * */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < a; i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int toCount = 0;
        for (int i = 0; i < arr.length; i++){
            int add = 0;
            for (int j = i; j < arr.length; j++){
                add += arr[j];
                if(add<0){
                    toCount++;
                }
            }
        }
        System.out.println(toCount);
    }
}