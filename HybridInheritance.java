package com.hybrid.inheritance;

class Filpkart
{
	public void Order()
	{
		System.out.println("Order is Placed");
	}
}

class Fashion extends Filpkart
{
	public void Men()
	{
		System.out.println("Men () Fanshion selected ");
	}

	public void Women()
	{
		System.out.println(" WoMen () Fanshion selected ");
	}
}

class Electronics extends  Filpkart
{
	public void Mobile()
	{
		System.out.println("Moile () selected");
	}

	public void Laptop()
	{
		System.out.println("Laptop () selected");
	}
}

class Groccerry extends Filpkart
{
	public void Sanks()
	{
		System.out.println("Sanks() are selected");
	}
	public void Meat()
	{
		System.out.println("Meat() are selected");
	}
}

class BrandFashion extends Fashion
{
	public void puma()
	{
		System.out.println("Puma() brand selected");
	}
	public void Nike()
	{
		System.out.println("Nike() brand selected");
	}
}

class BrandElectronics extends Electronics
{
	public void Samsang()
	{
		System.out.println("Samsang() are selected");
	}
	public void Nokia()
	{
		System.out.println("Nokia() are selected");
	}
}

class BrandGroccery extends Groccerry
{
	public void chips()
	{
		System.out.println("chips() are selected");
	}
	public void chicken()
	{
		System.out.println("chicken() are selected");

	}
public class HybridInheritance 
	{
		public static void main(String[] args) 
		{

			BrandFashion fashion=new BrandFashion();
			fashion.Order();
			fashion.Nike();
			fashion.puma();
			fashion.Men();
			fashion.Women();

			BrandElectronics electronics=new BrandElectronics();
			electronics.Order();
			electronics.Mobile();
			electronics.Laptop();
			electronics.Samsang();
			electronics.Nokia();

			BrandGroccery groccery=new BrandGroccery();
			groccery.Order();
			groccery.Meat();
			groccery.chips();
			groccery.chicken();
			groccery.Sanks();


		}

	}

}
