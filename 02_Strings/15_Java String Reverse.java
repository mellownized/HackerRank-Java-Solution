/*
** Author: TONMOY M.
** URI   : https://qinetique.github.io/
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder rev = new StringBuilder();
        rev.append(A);
        rev.reverse();
        System.out.println(A.contentEquals(rev)?"Yes" : "No");
        
    }
}



