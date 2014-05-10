package com.lch.Exception.learn;

public class Demo {
	public void method(int[] arr,int index)
	{
		//当此处发生数组越界时,虚拟机会在此处new一个数组越界的对象然后抛出来.
		//throw new ArrayIndexOutOfBoundsException(index).这个抛出.就抛给了主函数.谁调用,就抛给谁.
		System.out.println(arr[index]);
	}
	
	//这里为什么有个throws呢？因为我们要告诉调用者调用这个方法的时候有可能发生这个自定义异常.系统自带的异常默认就标示了.
	public  int method2(int[] arr,int index) throws FuShuIndexDemo
	{
		if(index>=arr.length)
		{
			//我们自己new一个异常对象信息.并且通过另外的构造函数来创建这个对象.我们不要自带的index.我们指定信息.
			//手动抛出一个对象.这个就是throw的用处.
			throw new ArrayIndexOutOfBoundsException("数组的角标越界啦");
		}
		//通过不同的数据我们来抛出不同的自定义异常对象.
		if(arr == null)
			throw new NullPointerException();
		if(index<0)
		{
			throw new FuShuIndexDemo("角标变成负数啦");
		}
		return arr[index];
	}

}
