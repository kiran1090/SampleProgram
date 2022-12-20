public class OddEvenSum {
    public static void main(String[] args)
    {
        final int LOWERBOUND=1;
        final int UPPERBOUND=1000;
        int SumOdd=0;
        int SumEven=0;
        int absDiff;
        int number=LOWERBOUND;
        while(number<=UPPERBOUND)
        {
            if(number%2==0)
            {
                SumEven+=number;
            }
            else {
                SumOdd+=number;

            }
            ++number;
            if(SumOdd>SumEven)
            {
                absDiff=SumOdd-SumEven;
            }
            else {
                absDiff=SumEven-SumOdd;
            }
        }
System.out.println("the sum of odd numbers from"+ LOWERBOUND+ "TO" +UPPERBOUND+ "is"+SumOdd);
    }
}
