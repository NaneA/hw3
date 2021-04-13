package mytest;
import java.util.*;
public class MyTest {
    public static void main(String[] args){
        System.out.println("My  maven project");

    }
    public static boolean isNatural(int num) {
        if (num <= 0 || num%1!=0) {
            return false;
        }
        return true;
    }
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
   public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
       for (int i = 2; i <= n/2; i++) {

           if(n%i == 0){
               return false;
           }
       }
       return(true);
   }
}
