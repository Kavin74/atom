import java.util.Scanner;

public class RomInt {
String roman;
int val;
void assign(String k)
{
  roman=k;
}

private class Literal
{
    public char literal;
    public int value;

    public Literal(char literal, int value)
    {
        this.literal = literal;
        this.value = value;
    }
}

private final Literal[] ROMAN_LITERALS = new Literal[]
        {
                new Literal('I', 1),
                new Literal('V', 5),
                new Literal('X', 10),
                new Literal('L', 50),
                new Literal('C', 100),
                new Literal('D', 500),
                new Literal('M', 1000)
        };

public int getVal(String s) {

   int holdValue=0;

        for (int j = 0; j < ROMAN_LITERALS.length; j++)
        {
            if (s.charAt(0)==ROMAN_LITERALS[j].literal)
            {
                       holdValue=ROMAN_LITERALS[j].value;
                           break;
            }  //if()
        }//for()

  return holdValue;
}  //getVal()
public int count()
{
   int count=0;
   int countA=0;
   int countB=0;
   int lastPosition = 0;
    for(int i = 0 ; i < roman.length(); i++)
    {
      String s1 = roman.substring(i,i+1);
        int a=getVal(s1);
        countA+=a;
    }
    for(int j=1;j<roman.length();j++)
    {
        String s2=  roman.substring(j,j+1);
        String s3=  roman.substring(j-1,j);
        int b=getVal(s2);
        int c=getVal(s3);
        if(b>c)
        {
            countB+=c;
        }
    }
    count=countA-(2*countB);
    return count;
    }


void disp()
{

     int result=count();
    System.out.println("Integer equivalent of "+roman+" = " +result);
}


  public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);
System.out.print("Please enter Roman Symbol:");
String s = keyboard.nextLine();
RomInt();

}

}  