package com.lch.InnerOutter.learn;

public class InnerClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���Ƕ�Outer������е��ڲ������ֱ�ӷ���.
		Outer.Inner outIn = new Outer().new Inner();
		outIn.show();
		Outer.InnerStatic.showStatic();
		
		Outer out = new Outer();
		out.method2();
	}

}
