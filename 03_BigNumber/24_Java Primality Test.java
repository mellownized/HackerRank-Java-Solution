/*
 * AUTHOR: TONMOY M
 * URL: https://github.com/qinetique
 * */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //String n = bufferedReader.readLine();
        Scanner scanner = new Scanner(System.in);
        BigInteger bigInt = scanner.nextBigInteger();
        scanner.close();
        System.out.println(bigInt.isProbablePrime(10) ? "prime" : "not prime");

        //bufferedReader.close();
    }
}
