package com.hackerrankday2operators.app;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        //Variables declarations
        double mealCost = 0;
        int tipPercent = 0;
        int taxPercent = 0;

        //Object declaration
        Scanner in = new Scanner(System.in);

        //Input
        mealCost = in.nextDouble();
        tipPercent = in.nextInt();
        taxPercent = in.nextInt();

        Solve(mealCost, tipPercent,taxPercent);
    }

    static void Solve(double meal_cost, double tip_percent, double tax_percent)
    {
        //Variable declaration
        long total = 0;
        //Operations
        tip_percent =  meal_cost * (tip_percent / 100);
        tax_percent =  meal_cost * (tax_percent /100);

        //Round total
        total = Math.round(tip_percent + tax_percent + meal_cost);
        //Output results
        System.out.println(total);
    }
}


