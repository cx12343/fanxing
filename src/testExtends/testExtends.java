package testExtends;

public class testExtends<T1,T2> {
	T1 age;
	public void test (T2 name) {
		
	}
}
//保留
//全部保留
class test01<T1,T2,A,B>  extends testExtends<T1,T2>{
	A sex;
	@Override
	public void test(T2 name) {
		//this.age;--->T1
	}
	
}
//部分保留
class test02<T2,A,B>  extends testExtends<String,T2>{

	@Override
	public void test(T2 name) {
		//this.age;-->String
	}
	
}
//不保留 具体类型
class test03<A,B> extends testExtends<Integer,String>{
	@Override
	public void test(String name) {}
}
//不写 擦除 object 相当于object
class test04 extends testExtends{
	@Override
	public void test(Object name) {}
}