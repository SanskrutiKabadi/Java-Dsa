import java.util.*;
class ProductOfDigit{
        int prod=1;
        int productDigit(int n){
                if(n==0)
                        return prod;


               return prod=(n%10)*productDigit(n/10);

        }
        public static void main(String[] args){
                 Scanner sc=new Scanner(System.in);
                 ProductOfDigit obj=new  ProductOfDigit();
                 System.out.println("Enter the number : ");
                 int n=sc.nextInt();
                 System.out.println(obj.productDigit(n));
        }
}
