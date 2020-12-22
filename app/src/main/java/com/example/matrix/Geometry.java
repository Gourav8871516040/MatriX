package com.example.matrix;

public class Geometry {
    private static double pie =3.14;
    public double aSquare(double a)
    {
        return a*a;
    }
    public double aTriangle (double h,double b)
    {
       return 0.5*h*b;
    }
    public double aRectangle ( double l,double w)
    {
     return l*w;
    }
    public double aCircle( double r)
    {
          return pie*r*r;
    }
    public double aParallelogram( double b,double h)
    {
        return b*h;
    }
    public double aPentagon(double a)
    {
        return 0.25*6.88*a*a;
    }
    public double aEquiTriangle(double a)
    {
        return (1.73*a*a)/4;
    }
    public double aRightanglTriangle(double b,double h)
    {
        return (b*h)/2;
    }
    public double aTrapezium(double a,double b,double h)
    {
        return ((a+b)/2)*h;
    }
    public double aRhombus( double p,double q)
    {
        return (p*q)/2;
    }
    public double aEllipse(double a,double b)
    {
        return pie*a*b;
    }





    public double saSphere(double r)
    {
        return 4*pie*r*r;
    }
    public double saCube(double a)
    {
        return 6*a*a;
    }
    public double saCuboid(double l,double w,double h)
    {
        return 2*((l*w)+(w*h)+(h*l));
    }
    public double saCylinder(double r,double h)
    {
        return 2*pie*r*(r+h);
    }
    public double saTeiangularPrism(double a,double b,double h)
    {
        return(a*b)+(3*b*h);
    }




    public double vSphere(double r)
    {
        return(4.0/3.0)*pie*r*r*r;
    }
    public double vCube(double s)
    {
        return s*s*s;
    }
    public double vCone(double r,double h)
    {
        return pie*r*r*(h/3);
    }
    public double vCylinder(double r,double h)
    {
        return pie*r*r*h;
    }
    public double vCuboid(double l,double b,double h)
    {
        return l*b*h;
    }


    public double pRectangle(double a,double b)
    {
        return 2*(a+b);
    }
    public double pTriangle(double a,double b,double c)
    {
        return a+b+c;
    }
    public double pSquare(double a)
    {
        return 4*a;
    }
    public double pRhombus(double a)
    {
        return 4*a;
    }
    public double ptrapezium(double a,double b,double c,double d)
    {
        return a+b+c+d;
    }
    public double pParallelogram(double a,double b)
    {
        return 2*(a+b);
    }
    public double pCircle(double r)
    {
        return 2*pie*r;
    }
    public double pCuboid(double l,double b,double h)
    {
        return 4*(l+b+h);
    }
}
