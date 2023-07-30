import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

/*
* Author: Tonmoy M
* URL: https://github.com/qinetique
* */

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> hashSet = new HashSet<>();

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            int number = scanner.nextInt();
            deque.add(number);
            hashSet.add(number);

            if (deque.size() == m){
                if (hashSet.size() > maximum){
                    maximum = hashSet.size();
                }
                int first = (int) deque.remove();
                if (!deque.contains(first)){
                    hashSet.remove(first);
                }
            }
        }
        System.out.println(maximum);
    }
}