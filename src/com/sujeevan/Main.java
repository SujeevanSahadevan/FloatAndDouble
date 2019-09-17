package com.sujeevan;

public class Main {

    public static void main(String[] args)
    {
     //int has width of 32(4 bytes)
	int myintvalue = 5 / 3;

	//float has width of 32(4 bytes)
	float myfloatvalue = 5f / 3f;

	//double has width of 64(8 bytes)
	double mydoublevalue = 5d / 3d;

        System.out.println("My int value =" + myintvalue);
        System.out.println("My float value =" + myfloatvalue);
        System.out.println("My double value =" + mydoublevalue);

        //Challenge
        System.out.println(" Challenge");

        double pounds = 10d;


        // 1 pound = 0.45359237
        double converted = pounds * 0.453_592_37d;

        System.out.println(pounds +"pounds =" + converted + "kg");

    }
}
