package com.lch.Exception.learn;

public class ExceptionDemo2 {

	/**
	 * @param args
	 * @throws FuShuIndexDemo 
	 */
	//��������ڷ����쳣,�������쳣�����н�������.���������˷����쳣�ĺ���,��ô�����Ҫ���д���.������֮һ�����׳�
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
				
				//׷���쳣��������Ϣ.���Ҳ�����������Ĭ�ϴ������.
				e.printStackTrace();
				System.out.println("�����Ǳ��쳣");
			}

		}
		
	}


}
