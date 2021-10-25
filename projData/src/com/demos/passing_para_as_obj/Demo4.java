package com.demos.passing_para_as_obj;



class G
{
	int a;
	G(int a)
	{
		this.a=a;
	}
	}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          G g=new G(10);
          //System.out.println(g);
          System.out.println(g.a);
          m(g);
          System.out.println(g.a);
	}	
	static void m(G g1)
	{
		g1.a=50;
	}

}
