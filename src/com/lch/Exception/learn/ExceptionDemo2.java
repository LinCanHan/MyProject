package com.lch.Exception.learn;

public class ExceptionDemo2 {

	/**
	 * @param args
	 * @throws FuShuIndexDemo 
	 */
	//如果函数内发生异常,必须在异常函数中进行声明.如果你调用了发生异常的函数,那么你必须要进行处理.处理方法之一就是抛出
	public static void main(String[] args) throws FuShuIndexDemo {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		Demo d = new Demo();
		d.method2(arr,-3);
		
		if(true)
		{
			try
			{
				int num = d.method2(arr, 30);
				System.out.println("num="+num);
			}
			catch(FuShuIndexDemo e){
				System.out.println(e.getMessage());
				
				//追踪异常的所有信息.这个也就是虚拟机的默认处理机制.
				e.printStackTrace();
				System.out.println("负数角标异常");
			}

		}
		
	}


}
