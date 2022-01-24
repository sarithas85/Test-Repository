package encapsulation1;

public class EncapsulationTest1 
{
private String name;
private int age;

public void setter(String name, int age)
{
	this.name=name;
	this.age=age;
}

public void getter()
{
	age=age*10;
	System.out.println("Name is: " +name);
	System.out.println("Age is: " +age);
}
}
