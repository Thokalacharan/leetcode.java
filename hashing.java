import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the arr");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
  System.out.println("enter the size of the arr elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

     
        int[] hash = new int[13];  
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

              System.out.println("enter the size of q");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("enter the number");
            int number = sc.nextInt();
            System.out.println(hash[number]);
        }

        sc.close();
    }
}
