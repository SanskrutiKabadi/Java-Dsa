import java.util.*;
class Recursion3{
        void print0tolesThanNum(int n){
                if(n==0)
                        return;

                print0tolesThanNum(--n);
		System.out.println(n);
        }
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                 Recursion3 obj=new  Recursion3();
                 System.out.println("Enter the number : ");
                int n=sc.nextInt();
                obj.print0tolesThanNum(n);


        }






}
