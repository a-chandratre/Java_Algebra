/**
 * Write a description of class Rational here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rational
{
    public static int p;
    public static int q;
    boolean defined;

    /**
     * Constructor for objects of class Rational
     */
    public Rational()
    {
        p = 1;
        q = 1;
    }
    public Rational(double d)
    {
        double temp = 0;
        int countd = 0;
        
        while(true)
        {
            temp = d * Math.pow(10, countd+1); 
            if (temp%10 == 0)
            {
                temp /= 10;
                break;
            }
            countd++;       
        }

        p = (int)d*(int)Math.pow(10, countd)+(int)(temp%Math.pow(10, countd));
        q = (int)Math.pow(10, countd);
    }
    public Rational(int n, int d)
    {
        p = n;
        q = d;
    }
    public static int GCF(int a, int b) 
    { 
        int c;
        if(a<b)
        {
            c = a;
            a = b;
            b = c;
        }
        
        if (b == 0) 
           return a; 
        else 
           return (GCF(b, a % b)); 
    }
    public static void reduce() 
    { 
        int n = p/GCF(p, q); 
        int d = q/GCF(p, q); 
        System.out.print(n + "/" + d);
    }
}
