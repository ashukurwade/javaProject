// calculator in java
// input n1,n2.......>(select operation) Result

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Calculator
{
    public static void main(String[]args) {
        int n1, n2, ch,cal;
        System.out.print("Enter two number");
        Scanner r=new Scanner(System.in);
        n1=r.nextInt();
        n2=r.nextInt();
        System.out.print("Select Operation");
        ch=r.nextInt();

        if(ch==1)
        {
            cal=n1+n2;
            System.out.print("ADDITION"+cal);
        }
        else if(ch==2)
        {
            cal=n1-n2;
            System.out.print("SUBTRACTION"+cal);
        }
        else if(ch==3)
        {
            cal=n1*n2;
            System.out.print("MULTIPLICATION"+cal);
        }
        else if(ch==4)
        {
            cal=n1/n2;
            System.out.print("DIVISION"+cal);
        }
        else 
        {
            cal=n1%n2;
            System.out.print("REMAINDER"+cal);
            
        }
         
    
    }
}