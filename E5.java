
package homework4;
import  java.util.Scanner;

public class E5 {

  
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("please enter the number1:   ");//سنضع رقم 20
        int num1=in.nextInt();
        System.out.println("please enter the number2:   ");//سنضع رقم 25
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.printf("sum:%11d\n" ,sum);
        int  difference=num1-num2;
        System.out.printf("difference:%4d\n",difference);
        int product=num1*num2;
        System.out.printf("product:%7d\n",product);
        double average=(num1+num2)/2.0;
        System.out.printf("average:%10.2f\n",average);
        System.out.printf("Distaance:%5d\n",Math.abs(difference));
        System.out.printf("Maximum :%6d\n" ,Math.max(num1, num2));
        System.out.printf("Minimum :%6d\n",Math.min(num1, num2));
        
       
    }
    
}
