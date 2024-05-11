import java.util.*;
class Recursion2{
        void printNumto1(int n){
                if(n==0)
                        return;

               
                System.out.println(n);
		printNumto1(--n);
        }
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                 Recursion2 obj=new  Recursion2();
                 System.out.println("Enter the number : ");
                int n=sc.nextInt();
                obj.printNumto1(n);


        }






}
