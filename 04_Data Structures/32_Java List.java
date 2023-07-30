import java.util.LinkedList;
import java.util.Scanner;
/*
* Author: TONMOY M.
* URI: https://github.com/qinetique
* */

public class Solution  {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < a; i++){
            int v = scanner.nextInt();
            linkedList.add(v);
        }
        int q = scanner.nextInt();
        for(int i = 0; i < q; i++){
            String b = scanner.next();
            if( b.equals("Insert")){
                int v = scanner.nextInt();
                int w = scanner.nextInt();
                linkedList.add(v,w);
            }
            if (b.equals("Delete")){
                int v = scanner.nextInt();
                linkedList.remove(v);
            }
        }
        for (Integer number : linkedList){
            System.out.print(number + " ");
        }
    }
}