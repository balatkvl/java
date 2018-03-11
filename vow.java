import java.io.*;
class Vowel
{

public static void  main(String arg[])throws IOException
{
String s="";
int a;
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the string");
s=b.readLine();
a=s.length();
for(int i=0;i<=a-1;i++)
{
if(s.charAt(i)=='a'|s.charAt(i)=='A'|s.charAt(i)=='e'|s.charAt(i)=='E'|s.charAt(i)=='i'|s.charAt(i)=='I'|s.charAt(i)=='o'|s.charAt(i)=='O'|s.charAt(i)=='u'|s.charAt(i)=='U')
{
System.out.print(s.charAt(i));
}
}
} 
}