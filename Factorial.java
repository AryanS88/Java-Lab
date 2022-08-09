import java.util.*;
public class Factorial{

    public static void main(String[] args){
        int n=5;
        int i;
        int f=1;//f=factorial
        System.out.print("The factorial of 5 is ");
        for(i=1;i<=5;i++){
        f=f*i;
        }
        System.out.print(f);
    }
}
