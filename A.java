class A 
{
	int x=1;
	void m1(){
	final int x=2;
	class B{
	int x=3;
	void m2(){
	System.out.println(x);
	int x=4;
	System.out.println(x);
	System.out.println(this.x);
	System.out.println(B.this.x);
	System.out.println(A.this.x);
	}
	}
	B b=new B();
	b.m2();
	System.out.println(x);
	System.out.println(b.x);
	System.out.println(this.x);
	}

	public static void main(String[] args) 
	{
	//	System.out.println("Hello World!");
	A a=new A();
	a.m1();
	}
}
