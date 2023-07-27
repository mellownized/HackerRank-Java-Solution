/*
** Author: TONMOY M.
** URI   : https://qinetique.github.io/
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        boolean cond = b>0 && h>0;
        
        if(!cond){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else{
            System.out.println(b*h);
        }
    }
}