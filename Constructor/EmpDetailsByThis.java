package Constructor;
class EmpDetailsByThis
{
	int id;
	int sal;
	String grade;
	String name;

	EmpDetailsByThis(int id, int sal, String grade, String name)
	{
		this.id=id;
		this.sal=sal;
		this.grade=grade;
		this.name=name;
	}

	void display()
	{
		System.out.println(id+" "+sal+" "+grade+" "+name);
	}

	public static void main(String[] args)
	{
	EmpDetailsByThis E1 = new EmpDetailsByThis(1,2000,"A","Sib");
	E1.display();
	EmpDetailsByThis E2 = new EmpDetailsByThis(2,3000,"B","Ans");
	E2.display();
	}
}