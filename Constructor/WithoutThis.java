package Constructor;
public class WithoutThis {
    int a ;
    int b;

    WithoutThis(int aValue, int bValue) {
        a = aValue;
        b = bValue;
    } 
    {
        
    }

    public static void main(String[] args) {
        WithoutThis obj = new WithoutThis( 10, 20);
        System.out.println("a = " + obj.a + " b = " + obj.b);
    }
    
}
