package com.lch.Exception.learn;

public class Computer {
	
	//����һ�����Ե�״̬.������״̬Ϊ1����Ϊ������.
	private int state= 0;
	public void run() throws LanPingException, MaoYanException
	{
		//�����׳����쳣.�ڱ���ʱ������쳣.�ڲ�����û�������Ա���Ҫ�����������쳣.
		if(state ==1)
			throw new LanPingException("����������");
		if(state ==2)
			throw new MaoYanException("����ð����");
		System.out.println("��������");
	}
	public void reset()
	{
		state = 0;
	}

}

