import java.lang.Math;

public class QuadraticEquation {
    public static void doubleSolve(double a, double b, double c) {
        double d = b * b - 4.0 * a * c;
        double sd = Math.sqrt(d);
        double r1 = (-b + sd) / (2.0 * a);
        double r2 = (-b - sd) / (2.0 * a);
        System.out.printf(" %.5f\t %.5f\n ", r1, r2);
    }

    public static void floatSolve(float a, float b, float c) {
        float d = b * b - 4.0f * a * c;
        float sd = (float)Math.sqrt(d);
        float r1 = (-b + sd) / (2.0f * a);
        float r2 = (-b - sd) / (2.0f * a);
        System.out.printf(" %.5f\t %.5f\n ", r1, r2);
    }

    public static void main(String[] args) {
        float fa = 1.0f;
        float fb = -4.0000000f;
        float fc = 3.9999999f;
        double da = 1.0;
        double db = -4.0000000;
        double dc = 3.9999999;

        System.out.println("roots of equation x^2 - 4.0000000 x + 3.9999999 = 0 are:");
        System.out.println("for float values:");
        floatSolve(fa, fb, fc);

        System.out.println("for double values:");
        doubleSolve(da, db, dc);
    }
}
