public class Reverse_string
{
  public static void main(String args[]){
    String str="";
    BufferedReader in=new BufferedReader(new inputStreamReader(System.in);
    str=in.readLine();
    char c[]=str.toCharArray();
    for(i=c.length-1;i>=0;i++)
    {
        System.out.print(c[i]);
    }
  }
}
