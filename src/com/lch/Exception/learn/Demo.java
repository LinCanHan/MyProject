package com.lch.Exception.learn;

public class Demo {
	public void method(int[] arr,int index)
	{
		//���˴���������Խ��ʱ,��������ڴ˴�newһ������Խ��Ķ���Ȼ���׳���.
		//throw new ArrayIndexOutOfBoundsException(index).����׳�.���׸���������.˭����,���׸�˭.
		System.out.println(arr[index]);
	}
	
	//����Ϊʲô�и�throws�أ���Ϊ����Ҫ���ߵ����ߵ������������ʱ���п��ܷ�������Զ����쳣.ϵͳ�Դ����쳣Ĭ�Ͼͱ�ʾ��.
	public  int method2(int[] arr,int index) throws FuShuIndexDemo
	{
		if(index>=arr.length)
		{
			//�����Լ�newһ���쳣������Ϣ.����ͨ������Ĺ��캯���������������.���ǲ�Ҫ�Դ���index.����ָ����Ϣ.
			//�ֶ��׳�һ������.�������throw���ô�.
			throw new ArrayIndexOutOfBoundsException("����ĽǱ�Խ����");
		}
		//ͨ����ͬ�������������׳���ͬ���Զ����쳣����.
		if(arr == null)
			throw new NullPointerException();
		if(index<0)
		{
			throw new FuShuIndexDemo("�Ǳ��ɸ�����");
		}
		return arr[index];
	}

}
