import java.io.*;
import java.util.Scanner.*;
class SET1(5)_NumToChar{
	public static void main(String args[])
	{
  		Scanner in = new Scanner();
  	  	System.out.print("Input the number ");
  	  	String num=in.readLine();
  	  	int N;
  	  	for(int i=0;i<num.length;i++){
  	  	N=Integer.parseInt(CharAt(i));
  	   	char c= (char)N;
  	  	String s= Character.toString(c);
  	  	System.out.print(s);
  	   }
  	 }
}
