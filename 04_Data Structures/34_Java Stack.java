import java.util.Scanner;
/*
Author: Tonmoy M
Url: https://github.com/qinetique
*/

class Solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String in = scanner.next();
            while (in.length() != (in = in.replaceAll("\\(\\)|\\[\\]|\\{\\}","")).length());
            System.out.println(in.isEmpty());
        }
    }
}