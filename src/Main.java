import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        samochod s1 = new samochod("opel ", 12);
        taxi t1 = new taxi("bmw ", 123, 100);

        s1.wypisz();
        t1.wypisz();

    }
}