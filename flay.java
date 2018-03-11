import java.io.*;
class  A
{
static int a;
public static void main(String arg[])throws IOException
{
int n,i,j;

BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the n");
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
{

a=a+1;
System.out.print(a+"\t");

}
System.out.println();
}
}
}