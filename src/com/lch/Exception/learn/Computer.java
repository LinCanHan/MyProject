package com.lch.Exception.learn;

public class Computer {
	
	//定义一个电脑的状态.如果这个状态为1就认为是蓝屏.
	private int state= 0;
	public void run() throws LanPingException, MaoYanException
	{
		//下面抛出了异常.在编译时被检测异常.内部我们没处理所以必须要声明者两个异常.
		if(state ==1)
			throw new LanPingException("电脑蓝屏了");
		if(state ==2)
			throw new MaoYanException("电脑冒烟了");
		System.out.println("电脑运行");
	}
	public void reset()
	{
		state = 0;
	}

}

