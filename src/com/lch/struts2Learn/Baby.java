package com.lch.struts2Learn;

public class Baby implements babyCry{
	
	babyCry Daili;
	public void Cry(){
		
	}
	@Override
	public void babyIsCry() {
		// TODO Auto-generated method stub
		System.out.println("����,֪ͨ�������չ���");
		Daili.babyIsCry();
	}
	public void setDaili(Baby Daili)
	{
		this.Daili = Daili;
	}

}
