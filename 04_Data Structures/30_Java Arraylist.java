import java.util.ArrayList;
import java.util.Scanner;

/*
 * AUTHOR: TONMOY M
 * URL: https://github.com/qinetique
 * */

public class Solution {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int d = scanner.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j=0;j<d;j++){
                arrayList.add(scanner.nextInt());
            }
            arrayLists.add(arrayList);
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            ArrayList<Integer> arrayList = arrayLists.get(x-1);
            if (y<=arrayList.size()){
                System.out.println(arrayList.get(y-1));
            }
            else {
                System.out.println("ERROR!");
            }
        }
    }
}