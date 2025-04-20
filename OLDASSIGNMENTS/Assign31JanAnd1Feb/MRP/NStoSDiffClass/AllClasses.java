package oldAssignments.Assign31JanAnd1Feb.MRP.NStoSDiffClass;
class CircleArea {
    double calc(double radius)
    {
        double area = 3.142 * radius * radius;
        return area;
    }
}

class EllipseArea {
    double calc(double a, double b) {
        double area = 3.142 * a * b;
        return area;
    }
}

class ParallelogramArea
{
    int area(int x, int y)
    {
        return x*y;
    }
}

class RectangleArea
{
    int area(int a, int b)
    {
        return a*b;
    }
}

class SectorArea {
    double calc(double radius, double angle) { 
        double radian = angle*(3.142/180); 
        double area = 0.5 * radius * radius * radian;
        return area;
    }
}

class SquareArea 
{
    int area(int a) 
    {
        return a*a;
    }
}

class TrapezoidArea
{
    double value(int a,int b, int c)
    {
        return (a+b)/2*c;
    }
}

class TriangleArea
{
	double area(int a, int b)
	{
		return 0.5*a*b;
	}
}