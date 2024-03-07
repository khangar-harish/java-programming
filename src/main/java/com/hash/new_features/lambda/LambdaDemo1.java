package com.hash.new_features.lambda;

@FunctionalInterface
interface Interf{
	
	public int square(int n);
}

interface Interf1{
	
	public int square(int n);
	public int add(int a, int b);
}

public class LambdaDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interf i = n -> n*n;
		System.out.println(i.square(6));
		
//		Interf i1 = n -> System.out.println("Square of "+n+" is = "+ n*n);
//		i1.square(5);
		
		Interf1 i2 = new Interf1() {
			
			@Override
			public int square(int n) {
				// TODO Auto-generated method stub
				return n*n;
			}
			
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		
		System.out.println(i2.square(10));
		System.out.println(i2.add(10,20));

	}

}
