import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
* Author: Tonmoy M
* Url: https://github.com/qinetique
* */

class Solution{
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++){
            String fullName = scanner.nextLine();
            int phoneNumber = scanner.nextInt();
            map.put(fullName,phoneNumber);
            scanner.nextLine();
        }
        while (scanner.hasNext()){
            String string = scanner.nextLine();
            if(map.containsKey(string)){
                System.out.println(string + "=" + map.get(string));
            }
            else {
                System.out.println("Not found");
            }
        }
    }
}