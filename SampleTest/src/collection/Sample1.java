package collection;

import java.util.ArrayList;
import java.util.List;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList obj=new ArrayList();  //non-generic array list
    obj.add(10);
    obj.add("hello");
    System.out.println(obj);
    ArrayList<Integer>obj1=new ArrayList();   //generic array list
    obj1.add(20);
    obj1.add(30);
    System.out.println(obj1);
    List<String>obj2=new ArrayList();
    obj2.add("hii");
    obj2.add("Welcome");
    System.out.println(obj2);
	}

}
