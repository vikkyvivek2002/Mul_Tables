import java.util.Scanner;
class Mul_Tables
{ 
public static void main(String[] args)
{
      Scanner s = new Scanner(System.in);
       int n = s.nextInt();
        s.close();
        for(int i=1;i<=25;i++)
        {
            System.out.printf("%d x %2d = %3d\n",n,i,(i*n));
        }
}
}
