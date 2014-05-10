package com.lch.InnerOutter.learn;

public class Outer {
	//�ڲ����ǿ��Է����ⲿ���˽�г�Ա��.�������Ǿ�̬�Ļ��ǷǾ�̬��.
	private  int num = 3;
	//�ڲ���.
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
	//��̬�ڲ�����Ҫ�����ⲿ�ĳ�Ա����,�ⲿ�ĳ�Ա���������Ǿ�̬��.
	static class InnerStatic
	{
		static void showStatic()
		{
			System.out.println("show run ...");
		}
	}
	
	//�����ڲ����ʵ�ַ���.
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
