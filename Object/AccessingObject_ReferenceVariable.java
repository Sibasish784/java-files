package Object;
class AccessingObject_ReferenceVariable
{
    int a = 100;
    int b = 200;
    public static void main(String[] args) {
        AccessingObject_ReferenceVariable obj = new AccessingObject_ReferenceVariable();
        System.out.println("Value of A global Nonstatic variable : "+obj.a);
        System.out.println("Value of A global Nonstatic variable : "+obj.b);
    }
}