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
		//�ڵ��õ������з�����ʱ������ʹ��try catch.
		try {
			comp.run();
		} catch (LanPingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			comp.reset();
		} catch (MaoYanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//ð�̵�����쳣���Ǵ�����.���������ֲ��ܰѵ���ð���׸�������.����,��������������쳣ת��
			//Ҳ����˵���ǰѵ��Ե�ð���쳣ת������ѧϰ�����޷���ɵ��쳣Ȼ���׸���ѧУ.
			throw new NoPlanException("��ʱ�����޷����,ԭ��"+e.getMessage());
		}
		System.out.println("����");
	}


}
