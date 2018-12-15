import java.awt.*;

public class FourDPoint extends Point {
    int m;
    int n;

    public FourDPoint(int x, int y, int m, int n) {
        super(x, y);
        this.m = m;
        this.n = n;
    }

    public static void main(String[] args) {


        FourDPoint fourDPoint = new FourDPoint(5, 5, 8,9);
        System.out.println("x wynosi " + fourDPoint.x);
        System.out.println("y wynosi " + fourDPoint.y);
        System.out.println("m wynosi " + fourDPoint.m);
        System.out.println("n wynosi " + fourDPoint.n);
    }
}