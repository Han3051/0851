package ReflectionDemo;
import java.lang.reflect.*;
public class theReflectionModifyDemo01 {
	public class Test{
		String str;
		int x,x1,x2;
		protected Test(int x,String str){
			this.x=x;
			this.str=str;
		}
		public Test(String[] s)throws NumberFormatException{
			if(0<s.length)
				x=Integer.valueOf(s[0]);
			if(1<s.length)
				x1=Integer.valueOf(s[1]);
			if(2<s.length)
				x2=Integer.valueOf(s[2]);
		}
		public void prt(){
			System.out.println("s="+str);
			System.out.println("x="+x);
			System.out.println("x1="+x1);
			System.out.println("x2="+x2);
		}
	}
	public class Main{
		public void m() {
			// TODO Auto-generated method stub
			String[] strings={"10","20","30"};
			Test testExample;
			testExample=new Test(strings);
			Class<? extends Test>testExampleCo=testExample.getClass();
			Constructor<?>[] declareConstructors=testExampleCo.getDeclaredConstructors();
			for (int i = 0; i < declareConstructors.length; i++) {
				Constructor<?> constructor=declareConstructors[i];
				System.out.println("查看是否允许带有可变量的参数："+constructor.isVarArgs());
				System.out.println("该方法的入口参数类型依次是：");
				Class<?>[] paramemeterType=constructor.getParameterTypes();
				for (int j = 0; j < paramemeterType.length; j++) {
					System.out.println(paramemeterType[j]);
				}
				System.out.println("可能产生的异常是: ");
				Class<?>[] exceptionType=constructor.getExceptionTypes();
				for (int j = 0; j < exceptionType.length; j++) {
					System.err.println(" "+exceptionType[j]);
				}
			}
		}
	}
//	public static void main(String[] args){
//		// TODO Auto-generated method stub
//		theReflectionModifyDemo01 trm=new theReflectionModifyDemo01();
//		theReflectionModifyDemo01.Main mmpMain=trm.new Main();
//		mmpMain.m();
//	}
//}
	public static void main(String[] args) {
		theReflectionModifyDemo01 trm=new theReflectionModifyDemo01();
		theReflectionModifyDemo01.Main mmpMain=trm.new Main();
		mmpMain.m();
	}
//		// TODO Auto-generated method stub
//		String[] strings={"10","b","fuck"};
//		Test testExample;
//		testExample=new Test(strings);
//		Class<? extends Test>testExampleCo=testExample.getClass();
//		Constructor<?>[] declareConstructors=testExampleCo.getDeclaredConstructors();
//		for (int i = 0; i < declareConstructors.length; i++) {
//			Constructor<?> constructor=declareConstructors[i];
//			System.out.println(constructor.isVarArgs());
//			Class[] paramemeterType=constructor.getParameterTypes();
//			for (int j = 0; j < paramemeterType.length; j++) {
//				System.out.println(paramemeterType[j]);
//			}
//			System.out.print("The exception may have");
//			Class<?>[] exceptionType=constructor.getExceptionTypes();
//			for (int j = 0; j < exceptionType.length; j++) {
//				System.err.println(" "+exceptionType[j]);
//			}
//		}
//	}
}
//public class Test{
//	String str;
//	int x,x1,x2;
//	protected Test(int x,String str){
//		this.x=x;
//		this.str=str;
//	}
//	public Test(String[] s)throws NumberFormatException{
//		if(0<s.length)
//			x=Integer.valueOf(s[0]);
//		if(1<s.length)
//			x1=Integer.valueOf(s[1]);
//		if(2<s.length)
//			x2=Integer.valueOf(s[2]);
//	}
//	public void prt(){
//		System.out.println("s="+str);
//		System.out.println("x="+x);
//		System.out.println("x1="+x1);
//		System.out.println("x2="+x2);
//	}
//}
