// 672115045 Virawit Kongthong OOP Lab 9 Question 3

public class TriangleException {
    public static void main(String[] args) {
        try {
            Triangle testTri = new Triangle(7, 2, 3);
            System.out.println("Valid Triangle");
            System.out.println(testTri);
        } catch (IllegalTriangleException e) {
            System.out.println("Illegal Triangle");
            System.out.println();
        }
    }
}

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String msg) {
        super(msg);
    }
}


class Triangle {
    private static double s1, s2, s3;

    public Triangle(double s1, double s2, double s3) throws IllegalTriangleException {
        if (!validTriangle()) {
            throw new IllegalTriangleException("Invalid Triangle");
        }
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double getPerimeter() {
        return s1 + s2 + s3;
    }

    public double getArea() {
        return (Math.sqrt(((getPerimeter()/2)*((getPerimeter()/2)*s1)*((getPerimeter()/2)*s2)*((getPerimeter()/2)*s3))));
    }

    public static boolean validTriangle() {
        return ((s1 + s2) > s3) && ((s1 + s3) > s2) && ((s2+s3) > s1);
    }

    @Override
    public String toString() {
        return "Perimeter: " + getPerimeter() + "\nArea: " + getArea() + "\nSide1: " + s1 + "\nSide2: " + s2 + "\nSide 3: " + s3;
    }
}
