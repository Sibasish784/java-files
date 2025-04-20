package oldAssignments.Java11FebAssignments.PassByReferencein3Class;
class Communication
{
    void transmit()
    {
        System.out.println("Communication::transmit");
    }
}

class Connection
{
    static void connect(Communication tri)
    {
        tri.transmit();
    }
}


class Satellite
{
    public static void main(String[] args) 
    {
        Communication comm = new Communication();
        Connection.connect(comm);
    }
}