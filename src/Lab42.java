import java.util.Objects;
import java.util.Random;

public class Lab42 {






    public static void main(String[] args) {
        int count;
        //Losowanie wynik = new Losowanie();

        Losowanie wygrana = new Losowanie();
        wygrana.a = 7;
        wygrana.b = 7;
        wygrana.c = 7;
        //do {
        //}
        //while ();
        for (int i = 0; i < 100_000; i++) {
            Losowanie wynik = new Losowanie();
            count=i;
            if (wynik.equals(wygrana)){
                System.out.println(wynik);
                System.out.println("Wylosowano za: " + i);
            break;
            }
            //break;
        }


        //System.out.println(wynik);
    }

}
class Losowanie{

    int a, b, c;

    Random random = new Random();


    public Losowanie() {
        this.a = random.nextInt(10);
        this.b = random.nextInt(10);
        this.c = random.nextInt(10);
    }

    @Override
    public String toString() {
        return "Losowanie{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Losowanie losowanie = (Losowanie) o;
        return a == losowanie.a &&
                b == losowanie.b &&
                c == losowanie.c;
    }



}


