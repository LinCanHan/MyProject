package com.lch.struts2Learn;

public class Baby implements babyCry{
	
	babyCry Daili;
	public void Cry(){
		
	}
	@Override
	public void babyIsCry() {
		// TODO Auto-generated method stub
		System.out.println("哭了,通知代理来照顾我");
		Daili.babyIsCry();
	}
	public void setDaili(Baby Daili)
	{
		this.Daili = Daili;
	}

}
