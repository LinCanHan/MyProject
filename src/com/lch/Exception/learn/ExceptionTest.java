package com.lch.Exception.learn;

public class ExceptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher("x��ʵ��");
		//������Ϳ��Դ���ѧϰ�����޷���ɵ��쳣.
		try {
			t.prelect();
		} catch (NoPlanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
