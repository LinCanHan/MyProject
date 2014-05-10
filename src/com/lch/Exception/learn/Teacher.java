package com.lch.Exception.learn;

public class Teacher {
	private String name;
	private Computer comp;
	
	Teacher(String name)
	{
		this.name = name;
	}
	public void prelect() throws NoPlanException
	{
		//在调用电脑运行方法的时候我们使用try catch.
		try {
			comp.run();
		} catch (LanPingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			comp.reset();
		} catch (MaoYanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//冒烟的这个异常我们处理不了.但是我们又不能把电脑冒烟抛给调用者.所以,我们在这里进行异常转换
			//也就是说我们把电脑的冒烟异常转换成了学习进度无法完成的异常然后抛给了学校.
			throw new NoPlanException("课时进度无法完成,原因"+e.getMessage());
		}
		System.out.println("讲课");
	}


}
