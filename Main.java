package diyizhou;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}

class Fraction{
	int a;	//分子
	int b;	//分母
	
	Fraction()
	{

	}
	
	Fraction(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	double toDouble()
	{
		return a*1.0/b;
	}
	
	Fraction plus(Fraction r)
	{
		Fraction result = new Fraction();
		result.b = this.b * r.b;
		result.a = this.a * r.b + this.b * r.a;
		return result;
	}
	
	Fraction multiply(Fraction r)
	{
		Fraction result = new Fraction();
		result.b = this.b * r.b;
		result.a = this.a * r.a;
		return result;
	}
	
	void print()
	{
		//输出前化简
		int temp;
		temp = gcd(this.a, this.b);
		this.a = this.a / temp;
		this.b = this.b / temp;
		if ( this.a == this.b )
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(this.a+"/"+this.b);
		}
	}
	
	int gcd(int x, int y)
	{
		if  ( y == 0 )	return x;
		else return gcd(y, x%y);
	}
}