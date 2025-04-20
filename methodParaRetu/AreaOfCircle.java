package methodParaRetu;
class AreaOfCircle
{
        static double area(int radius)
        {
            final double pi = 3.142;
            double Are = pi*radius*radius;
            
            return Are;
        }

        public static void main(String[] args)
        {
            double X = area(9); 
            System.out.println(X);
        }
}