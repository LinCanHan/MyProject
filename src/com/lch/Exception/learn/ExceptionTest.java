package com.lch.Exception.learn;

public class ExceptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher("x老实；");
		//在这里就可以处理学习进度无法完成的异常.
		try {
			t.prelect();
		} catch (NoPlanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
