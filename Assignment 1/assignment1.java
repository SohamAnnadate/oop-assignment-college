//Problem Statement::
/*
Design a class ‘Complex ‘with data members for real and imaginary part. 
Provide default and Parameterized constructors. Write a program to perform 
arithmetic operations of two complex numbers.
*/

import java.util.*;

class Complex_No {
    float real, img;

public Complex_No() {
    real = 0;
    img = 0;
}
public Complex_No(float a, float b) {
    real = a;
    img = b;
}
public void Display(Complex_No c1, Complex_No c2) {
    System.out.println("First Complex Number = ("+c1.real+")+("+c1.img+")i");
    System.out.println("Second Complex Number = ("+c2.real+")+("+c2.img+")i");
}
public void AddNumbers(Complex_No c1, Complex_No c2) {
    float real, img;
    real = (c1.real + c2.real);
    img = (c1.img + c2.img);
    System.err.println("Addition of Complex Numbers : ("+real+")+("+img+")i");
}
public void SubNumbers(Complex_No c1, Complex_No c2) {
    float real, img;
    real = (c1.real - c2.real);
    img = (c1.img - c2.img);
    System.out.println("Subtraction of Complex Numbers : ("+real+")+("+img+")i");
}
public void MultiNumbers(Complex_No C1,Complex_No C2) {
	float real,img;
	real=(C1.real*C2.real-C1.img*C2.img);
	img=(C1.real*C2.img+C1.img*C2.real);
	System.out.println("Multiplication of Complex Numbers =("+real+")+("+img+")i");
}

public void DivNumbers(Complex_No C1,Complex_No C2) {
	float real,img;
	real=(C1.real*C2.real+C1.img*C2.img)/(C2.real*C2.real+C2.img*C2.img);
	img=(C1.img*C2.real-C1.real*C2.img)/(C2.real*C2.real+C2.img*C2.img);
	System.out.println("Division of Complex Numbers =("+real+")+("+img+")i");
}
}

public class assignment1 {
    public static void main(String[] args) {
        float num1, num2;
        Complex_No cal = new Complex_No();
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Complex number in a+bi format : ");
		
		//taking input for First Number
		System.out.print("Enter real part of First Number: a : ");
		num1=Sc.nextFloat();
		System.out.print("Enter img part of First Number: b : ");
		num2=Sc.nextFloat();
		Complex_No Com1=new Complex_No(num1,num2);
		
		System.out.print("Enter real part of Second Number: a : ");
		num1=Sc.nextFloat();
		System.out.print("Enter img part of Second Number: b : ");
		num2=Sc.nextFloat();
		Complex_No Com2=new Complex_No(num1,num2);
		Sc.close();
		
		System.out.print("\n");
		cal.Display(Com1,Com2);
		System.out.print("\n");
		cal.AddNumbers(Com1,Com2);
		cal.SubNumbers(Com1,Com2);
		cal.MultiNumbers(Com1,Com2);
		cal.DivNumbers(Com1, Com2);

    }
}


