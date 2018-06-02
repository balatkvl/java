import java.io.*;
class fibo
{
public static void main(String arg[])throws IOException
{
int a=-1,b=1,c=0,num=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the n");
num=Integer.parseInt(br.readLine());
for(int i=0;i<num;i++)
{
c=a+b;
a=b;
b=c;
System.out.println(c);
}
}
}

