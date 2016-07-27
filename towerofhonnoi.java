
public class tower_of_honnoi
{
   public void TOH(int num,char frompeg,char topeg,char auxpeg){
       if(num==1){
          System.out.println("Moving disc 1 from peg "+frompeg "to peg "+topeg);
          return;
    }
      TOH(num-1,frompeg,auxpeg,topeg);
      System.out.println("Moving disc %d from peg %c to peg %c",num,frompeg,topeg);
      TOH(num-1,topeg,frompeg,auxpeg);
}

public static void main(String arfs[])
{
  Scanner in= new SCanner(System.in);
  int num=in.nextInt();
  TOH(num,'A','C','B');    /* TOH --> Tower of Honnoi */
}
	