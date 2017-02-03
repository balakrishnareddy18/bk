class  Assin1
{     int a = 100;
      int b = 200;
	  static void m1(){
		  Assin1 s = new Assin1();
		  System.out.println(s.a);
		  System.out.println(s.b);
	  }
	  static void m2(){
          Assin1 s = new Assin1();
		  System.out.println(s.a);
		  System.out.println(s.b);
	  }
	public static void main(String[] args) 
	{
		Assin1.m1();
		Assin1.m2();
	}
}
