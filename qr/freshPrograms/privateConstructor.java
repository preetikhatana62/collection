package freshPrograms;

public class privateConstructor {
	String name;
	int rollno;
	private privateConstructor(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}


public static void main(String[] args)
{
	privateConstructor p=new privateConstructor("preeti",98);
	System.out.println(p);
	System.out.println(p.name);
	System.out.println(p.rollno);
}
    }
    
