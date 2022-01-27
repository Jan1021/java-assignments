public class Simple_compound_Intrest {
   public static void main(String[] args) {
       double SI;//Simple Intrest
       int p =5000;
       double r = 4.5;
       double t = 2.5;

       SI = p*r*t/100; // Simple Intrest Calculation
         
       // Compound Intrest 
       int A = 10000;
       int P = 5000;
       double R = 5.5;
       double T = 1.5;

       A = (int) (P * Math.pow((1+5.5/100),1.5)); // Compound Intrest Calcualation

       System.out.println("Simple Intrest: " + SI);
       System.out.println("Compound Intrest: " + A);
}

}
       

