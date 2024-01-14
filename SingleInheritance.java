package com.single.inheritance;

// Single inheritance --> one class acqureing the property of another class 
// is know as single inheritance.


class Sample
{

	final int v1 =100;
	String str="java";

	public void test()
	{
		System.out.println( "test() of sample class ");
	}
	public void count()
	{
		System.out.println("count() of smple class");
	}
	@Override
	public String toString() {
		return "Sample [v1=" + v1 + ", str=" + str + "]";
	}
	

}
public class SingleInheritance extends Sample
{
	
	double z1=190;
	
	public void display()
	{
		System.out.println("display() of SingleInheritance ");
	}
	
	@Override
	public String toString() {
		return "SingleInheritance [z1=" + z1 + "]";
	}

	public static void main(String[] args) 
	{
		SingleInheritance inher=new SingleInheritance();
		System.out.println(inher.str);
		System.out.println(inher.v1);
		System.out.println("");
		inher.display();
		inher.count();
		inher.count();
		
		
	}


}

