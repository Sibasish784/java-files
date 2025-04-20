package objectClass;

class Equals {

	public static void main(String[] args) {
		Equals e = new Equals();
		Equals e1 = new Equals();
		System.out.println(e.equals(e1));
	}
	// Overriding the equals() method to compare two objects
	public boolean equals(Object obj) 
	{
		return true;
	}

}
