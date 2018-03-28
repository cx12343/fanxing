package fanxing;

public class MyApp {
public static void main(String[] args) {
	MyStudent <Integer> stu =new MyStudent <Integer>();
	stu.setName(1);
	//stu.setName("fdsf");类型自动检查
	Integer a=stu.getName();
	
}
}
