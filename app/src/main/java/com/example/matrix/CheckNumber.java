package com.example.matrix;
import java.lang.*;
public class CheckNumber {
    public int disarium (int num)
    {
        int  sum = 0, rem = 0, n;
        int len = calculateLength(num);

        //Makes a copy of the original number num
        n = num;

        //Calculates the sum of digits powered with their respective position
        while(num > 0){
            rem = num%10;
            sum = sum + (int)Math.pow(rem,len);
            num = num/10;
            len--;
        }

        //Checks whether the sum is equal to the number itself
        if(sum == n)
            return 0;
        else
            return 1;

    }

    public int fibonacci(int inputNumber)
    {


        int firstTerm = 0;

        int secondTerm = 1;

        int thirdTerm = 0;

        while (thirdTerm < inputNumber)
        {
            thirdTerm = firstTerm + secondTerm;

            firstTerm = secondTerm;

            secondTerm = thirdTerm;
        }

        if(thirdTerm == inputNumber)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    public int happy (int num)
    {
        if (num==0)
            return 1;

        int result = num;

        while(result != 1 && result != 4){
            result = isHappyNumber(result);
        }

        //Happy number always ends with 1
        if(result == 1)
            return 0;
            //Unhappy number ends in a cycle of repeating numbers which contains 4
        else if(result == 4)
            return 1;

        return -1;
    }

    public int harshad (int num)
    {
        if (num==0)
            return 1;

        int rem = 0, sum = 0, n;

        //Make a copy of num and store it in variable n
        n = num;

        //Calculates sum of digits
        while(num > 0){
            rem = num%10;
            sum = sum + rem;
            num = num/10;
        }

        //Checks whether number is divisible by sum of digits
        if(n%sum == 0)
           return 0;
        else
            return 1;

    }
    public int deficient (int n)
    {
        if (isDef(n))
            return 0;
        else
            return 1;

    }
    public int abundant (int n)
    {
        if(checkAbundant(n))
        return 0;
        else
        return 1;

    }
    public int twistedPrime (int n)
    {
        int reverse,sum=0 , flag;

        while(n!=0)
        {
            reverse = n%10;
            sum = sum*10 + reverse;
            n= n/10;
        }

        flag = 0;
        for (int j = 2; j <= sum / 2; j++)
        {
            if ((sum % j) == 0)
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            return 0;
        else
            return 1;

    }
    public int evenOrOdd (int n)
    {
        if ( n % 2 == 0 )
            return 0;
        else
            return 1;

    }
    public int prime (int n)
    {
        int i,m=0,flag=0;

        m=n/2;
        if(n==0||n==1){
            return 1;
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    flag=1;
                    return 1;

                }
            }
            if(flag==0)
                return 0;
            else
                return -1;
        }

    }
    public int armstrong (int n)
    {
        int c=0,a,temp;
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            return 0;
        else
            return 1;

    }
    public int pallindrom (int n)
    {
        int r,sum=0,temp;
        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            return 0;
        else
            return 1;

    }
    public int perfect (int Number)
    {

        int i, Sum = 0 ;

        for(i = 1 ; i < Number ; i++) {
            if(Number % i == 0)  {
                Sum = Sum + i;
            }
        }
        if (Sum == Number)
            return 0;
        else
            return 1;
    }


    public static int calculateLength(int n){
        int length = 0;
        while(n != 0){
            length = length + 1;
            n = n/10;
        }
        return length;
    }


    public static int isHappyNumber(int num){
        int rem = 0, sum = 0;

        //Calculates the sum of squares of digits
        while(num > 0){
            rem = num%10;
            sum = sum + (rem*rem);
            num = num/10;
        }
        return sum;
    }

    static int divsum(int n)
    {
        int sum = 0;
        for (int i = 1; i <= (Math.sqrt(n)); i++) {
            if (n % i == 0) {

                if (n / i == i) {
                    sum = sum + i;
                }
                else
                {
                    sum = sum + i;
                    sum = sum + (n / i);
                }
            }
        }

        return sum;
    }


    static boolean isDef(int n)
    {
        return (divsum(n) < (2 * n));
    }

    public int getSum(int n)
    {
        int sum = 0;
        for (int i=1; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                if (n/i == i)
                    sum = sum + i;
                else
                {
                    sum = sum + i;
                    sum = sum + (n / i);
                }
            }
        }
        sum = sum - n;
        return sum;
    }
    public  boolean checkAbundant(int n)
    {
        return (getSum(n) > n);
    }
}
