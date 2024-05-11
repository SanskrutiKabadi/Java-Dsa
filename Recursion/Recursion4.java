import java.util.*;
class Recursion4{
        void print1toNNto1(int n){
                if(n==0)
                        return;

                
		System.out.println(n);
		print1toNNto1(n-1);
                System.out.println(n);

        }
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                 Recursion4 obj=new  Recursion4();
                 System.out.println("Enter the number : ");
                int n=sc.nextInt();
                obj.print1toNNto1(n);


        }






}
