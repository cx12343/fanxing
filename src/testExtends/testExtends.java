package testExtends;

public class testExtends<T1,T2> {
	T1 age;
	public void test (T2 name) {
		
	}
}
//����
//ȫ������
class test01<T1,T2,A,B>  extends testExtends<T1,T2>{
	A sex;
	@Override
	public void test(T2 name) {
		//this.age;--->T1
	}
	
}
//���ֱ���
class test02<T2,A,B>  extends testExtends<String,T2>{

	@Override
	public void test(T2 name) {
		//this.age;-->String
	}
	
}
//������ ��������
class test03<A,B> extends testExtends<Integer,String>{
	@Override
	public void test(String name) {}
}
//��д ���� object �൱��object
class test04 extends testExtends{
	@Override
	public void test(Object name) {}
}