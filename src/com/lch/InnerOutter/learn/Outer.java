package com.lch.InnerOutter.learn;

public class Outer {
	//内部类是可以访问外部类的私有成员的.不管他是静态的还是非静态的.
	private  int num = 3;
	//内部类.
	class Inner
	{
		void show()
		{
			System.out.println("show run..."+num);
		}
	}
	public void method()
	{
		Inner in = new Inner();
		in.show();
	}
	//静态内部类想要访问外部的成员变量,外部的成员变量必须是静态的.
	static class InnerStatic
	{
		static void showStatic()
		{
			System.out.println("show run ...");
		}
	}
	
	//匿名内部类的实现方法.
	public void method2()
	{
		new Inter()
		{

			@Override
			public void show1() {
				// TODO Auto-generated method stub
				System.out.println("show run Show1"+num);
			}

			@Override
			public void show2() {
				// TODO Auto-generated method stub
				System.out.println("show run Show2"+num);
			}
			
		}.show1();
	}
	
}
