
public class Least_numbers
{
static int[] separate(String str)
{
int n[]=new int[str.length()];
for(int i=0;i<str.length();i++)
{
n[i]=str.charAt(i)-48;
}
return n;
}
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
String str=in.nextLine();
int n=in.nextInt();
int[] a1=separate(str);
Arrays.sort(a1);
int re=a1.length-n;
int sum=0;
for(int i=0;i<re;i++)
{
	sum=sum*10+a1[i];
}
System.out.println(sum);
}
}