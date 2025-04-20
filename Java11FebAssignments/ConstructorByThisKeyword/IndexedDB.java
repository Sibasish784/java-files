package Java11FebAssignments.ConstructorByThisKeyword;
class IndexedDB
{
    int NewDB;
    String DBName;
    Double DBVersion;

    IndexedDB(int NewDB, String DBName, Double DBVersion)
    {
        this.NewDB = NewDB;
        this.DBName = DBName;
        this.DBVersion = DBVersion;
    }

    void Display()
    {
        System.out.println("NewDB: " + NewDB);
        System.out.println("DBName: " + DBName);
        System.out.println("DBVersion: " + DBVersion);
    }

    public static void main(String[] args)
    {
        IndexedDB db1 = new IndexedDB(1, "IndexedDB", 1.0);
        db1.Display();
    
        IndexedDB db2 = new IndexedDB(2, "IndexedDB", 2.0);
        db2.Display();
    }
}