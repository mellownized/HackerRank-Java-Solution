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
        String string;
        int i = 1;
        
        while(scanner.hasNext()){
            string = scanner.nextLine();
            System.out.println(i + " " + string);
            i++;
        }
    }
}