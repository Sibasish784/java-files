package oldAssignments.Java11FebAssignments.Constructor.ByThisKeyword;
class Network
{
    int port;
    String IP;
    String Protocol;

    Network(int port, String IP, String Protocol)
    {
        this.port = port;
        this.IP = IP;
        this.Protocol = Protocol;
    }

    void Display()
    {
        System.out.println("Port: " + port);
        System.out.println("IP: " + IP);
        System.out.println("Protocol: " + Protocol);
    }

    public static void main(String[] args)
    {
        Network n1 = new Network(80, " 192.168.183", "HTTP");
        n1.Display();
        Network n2 = new Network(80, " 192.168.183", "HTTP");
        n2.Display();
    }
}