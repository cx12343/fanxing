package fanxing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class fanxingAndIterator {
public static void main(String[] args) {
	List<String> list =new ArrayList<String> ();
	//list.add(122);只能放字符串类型
	list.add("dsf");
	list.add("bbb");
	for(Iterator iter =list.iterator();iter.hasNext();) {
		String str =(String)iter.next();
		System.out.println(str);
	}
	Iterator iter01 =list.iterator();
	while(iter01.hasNext()) {
		String str =(String) iter01.next();
		System.out.println(str);
		//iter01.remove();全部移除只能用一次
		System.out.println(list.size());
	}
	
	if(list.get(0) instanceof String) {
		System.out.println(list.get(0));
	}///判断是否是这个类型
	
}
}
