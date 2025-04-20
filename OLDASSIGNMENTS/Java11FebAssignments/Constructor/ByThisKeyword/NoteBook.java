package oldAssignments.Java11FebAssignments.Constructor.ByThisKeyword;
class NoteBook
{
    int Size;
    String Color;
    String Brand;
    String Type;

    NoteBook(int Size, String Color, String Brand, String Type)
    {
        this.Size = Size;
        this.Color = Color;
        this.Brand = Brand;
        this.Type = Type;
    }

    void Display()
    {
        System.out.println("Size: " + Size);
        System.out.println("Color: " + Color);
        System.out.println("Brand: " + Brand);
        System.out.println("Type: " + Type);
    }

    public static void main(String[] args)
    {
        NoteBook n1 = new NoteBook(15, "Black", "Dell", "Laptop");
        n1.Display();
    
        NoteBook n2 = new NoteBook(13, "White", "HP", "Notebook");
        n2.Display();
    }
}