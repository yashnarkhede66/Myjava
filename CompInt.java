
public class CompInt{
   public static void main(String args[]){
      double princ =20000   , interest = 6, time = 7;
      double comp_int = princ *(Math.pow((1 + interest / 100), time));
      System.out.println("The compound interest for the given principle amount, rate and time is "+ comp_int);
   }
}