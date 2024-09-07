package com.corejava;

import java.util.Scanner;

public class First_Java {
    public static void main(String[] args) {

        AlterAm(1,1000);
    }
    //Q1
    static void OddorEven(int n)
    {
        if(n%2==0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n+" is Odd");
        }
    }
    //Q2
    static void Greet(String name)
    {
        System.out.println("Welcome Mr "+name);
    }
    //Q3
    static void Si()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle amount:");
        double p = sc.nextDouble();
        System.out.println("Enter the Rate of Interest :");
        double r = sc.nextDouble();
        System.out.println("Enter the time period in years:");
        int t = sc.nextInt();

        double si = p*r*t/100;
        System.out.println("the simple interest amount is "+si);
    }
    //Q4

    static void Q4(int n1,int n2)
    {
        System.out.println("Please select the operator ie '+' '-' '*' '/' ");
        Scanner sc  = new Scanner(System.in);

        char c = sc.next().charAt(0);

        if(c=='+')
        {
            int sum = n1+n2;
            System.out.println(sum);
        }
        //similar for all other Operater
    }
    //Q5
    static int Largest(int n1,int n2)
    {
        if(n1>n2)
        {
            return n1;
        }
        return n2;
    }
    //Q6

    static void RtoD(int Rupees)
    {
        System.out.println("Enter the amount in rupees:");
        int Dollar = Rupees/84;
        System.out.println(Dollar+"$");
    }
    //Q7
    static void Fibo(int n)
    {
        int n1 = 0, n2 = 1, n3=0;

        System.out.print(n1 +" "+n2);
        while(n3<=n)
        {
            n3 = n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2 = n3;
        }
//        System.out.println(n3);
    }

    //Q8
    static void PaliorNot(String name)
    {
        char c ;
        String org = "";
        for (int i = 0; i <name.length() ; i++) {

            c = name.charAt(i);
            org = name.charAt(i)+org;

        }
        System.out.println(org);
        if(org .equals(name))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not an Palindrome");
        }
    }
    //Q9
    static void Amstrong(int n1, int n2)
    {
        //Amstrong number between two numbers



        while(n1<=n2)
        {
            int org = n1;
            int sum = 0;
            int i = n1;
            while (i>0) {
                int rem = i%10;
                sum+=rem*rem*rem;
                i = i/10;
//                if(i==0)
//                {
//                    break;
//                }

            }
            if (org==sum)
            {
                System.out.println(sum);
            }
            n1++;
        }
//        System.out.println("No match found");


    }
    //Q10 Alter method of Amstrong number
    static void AlterAm(int a, int b)
    {
        for (int i = a; i <=b ; i++) {

            int org = i;
            int sum = 0;

            while (org>0)
            {
                int rem = org%10;
                sum+=rem*rem*rem;
                org/=10;
            }
            if(sum == i)
            {
                System.out.println(sum);
            }


        }
    }

}
