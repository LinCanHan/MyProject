package com.lch.InnerOutter.learn;

public class InnerClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//我们对Outer这个类中得内部类进行直接访问.
		Outer.Inner outIn = new Outer().new Inner();
		outIn.show();
		Outer.InnerStatic.showStatic();
		
		Outer out = new Outer();
		out.method2();
	}

}
