package constructor;

public class Constructor_Overloading {

private String name;
private int id;

//no-args constructor
public Constructor_Overloading()
{
	this.name="default name";
}
//one parameter constructor
public Constructor_Overloading(String n)
{
	this.name = n;	
}
//two parameter constructor
public Constructor_Overloading(String n, int i)
{
	this.name=n;
	this.id=i;
}
@Override
public String toString() {
	return "ID="+id+", Name="+name;
}

public static void main(String args[])
{
	Constructor_Overloading data = new Constructor_Overloading();
	System.out.println(data);
	data = new Constructor_Overloading("overloaded first time");
	System.out.println(data);
	data = new Constructor_Overloading("overloaded second time",3);
	System.out.println(data);
}

}
