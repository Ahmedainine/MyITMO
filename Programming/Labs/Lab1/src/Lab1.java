import java.util.Random;


public class Lab1{


    public static long[] Arrayn(int lower , int upper)
    {
        int length = (upper-lower)/2 + 1;
        long [] n = new long[length];
        for(int i=0 ; i< n.length ; i++)
        {
            n[i] = upper - 2 * i;
        }
        return n;
    }
    public static double[] Arrayx(int length ,  double From , double To)
    {
        double[] x = new double[length];
        Random rnd = new Random();
        for(int i=0 ; i<x.length;i++)
        {
            x[i] = rnd.nextDouble()*(To-From)+From;
        }
        return x;
    }
    public static double TheHardThings(long l , double x)
    {
        if(l==6)
        {
            return Math.sin(Math.atan(Math.pow((x-2)/8, 2)));
        }
        if(l==10 || l==12 || l==14 || l==16 || l==18)
        {
            return Math.log(Math.exp(Math.tan(Math.atan((x-2)/8))));
        }
        else{
            return Math.pow(Math.sin(Math.tan((Math.pow((1.0/4)/x, x)))), Math.log(Math.abs(Math.asin(Math.exp(-1*Math.abs(x))))));
        }
    }
    public static double[][] Arrays(int rows , int cols , long[] n , double[]x)
    {
        double [][] s = new double[rows][cols];
        for(int i=0 ; i<rows ;i++)
        {
            for(int j=0 ; j<cols ; j++)
            {
                s[i][j] = TheHardThings(n[i], x[j]);
            }
        }
        return s;
    }
    public static void PrintArray(long [] n)
    {
        for(long element : n)
        {
            System.out.print(element + "\t");
        }
        System.out.println();
        System.out.println();

    }
    public static void PrintArray(double [] x)
    {
        for(double element : x)
        {
            System.out.printf("%.3f\t" , element);
        }
        System.out.println();
        System.out.println();
    }
    public static void PrintArray(double [][] s)
    {
        for(double[] rows : s)
        {
            for(double row : rows)
            {
                System.out.printf("%9.3f" , row);
            }
            System.out.println();
        }
            System.out.println();
    }
    public static void main(String args[])
    {
        long[] n = Arrayn(2,22);
        double [] x = Arrayx(14,-6.0,2.0);
        double [][] s = Arrays(11,14,n , x);

        
        PrintArray(n);
        PrintArray(x);
        PrintArray(s);

    }
}
