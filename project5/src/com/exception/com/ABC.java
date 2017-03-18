package com.exception.com;

public class ABC {
	String name;
	static int xyz;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("onside main method");
		ABC abc=new ABC();
		try{
			abc.method1(null,"admin123",10);
		}catch(Exception e){
		}
		method2();
		abc.method3();
		System.out.println("main method excution completed");
		}
	private void method1(String username,String password,int i){
		boolean returnvalue= false;
		System.out.println("inside method1 method");
		try{
			throw new Exception();
		}catch(Exception e){
			e.printStackTrace();}
		}
			private static int method2(){
				System.out.println("inside method2 method");
				System.out.println("method2 execution completed");
				return 0;
			}
			private void method3(){
				System.out.println("inside method3 method");
				System.out.println("method3 execution completed");
			}
			
			
			




}
