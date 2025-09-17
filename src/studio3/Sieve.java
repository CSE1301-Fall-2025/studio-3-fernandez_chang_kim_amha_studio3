import java.util.*;

public class Sieve {
 public static void main(String[] args){
    Scanner n1 = new Scanner(System.in);
    System.out.println("What number would you like to test?");
    int input = n1.nextInt();
    int arrayLength = input + 1;
    boolean[] arr = new boolean[arrayLength];
 
    
    for (int num = 2; num < arr.length; num++) { 
        if (arr[num] == false) {
            for (int i = 2; i < arr.length; i++) {
                int num1 = num;
                num1*=i;
                if (num1 <= arr.length - 1) {
                    arr[num1] = true;
                }    
            }
        }
    }
    System.out.println("The prime numbers under " + input + " are:");
    for (int a = 2; a < arr.length; a++) {  
        if (arr[a] == false) {
            System.out.println(a);
        }   
    }
 }
}
