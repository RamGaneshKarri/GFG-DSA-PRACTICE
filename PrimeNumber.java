public class PrimeNumber {
    public static void main(String[] args) {
        int n=7;
        boolean b=true;
        if(n<=1)
          b=false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                b=false;
            }
        }
        System.out.println(b);

    }
}
