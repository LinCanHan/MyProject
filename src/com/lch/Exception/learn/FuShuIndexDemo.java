package com.lch.Exception.learn;


//我们想要抛出一个自定义的异常.由于系统自己的角标越界异常跟我们这个异常并不是太匹配.所以我们使用自定义异常信息.
//要让一个类成为异常类.必须继承Exception
//注意在异常中java会先检查基本的语法错误,接下来才会检查基本的逻辑错误.
public class FuShuIndexDemo extends Exception {
	FuShuIndexDemo(){};
	FuShuIndexDemo(String msg){
		super(msg);
	};
	
}
