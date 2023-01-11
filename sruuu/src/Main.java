import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Kolejka k1 = new Kolejka();

        Osoba o1 = new Osoba("Sita ", "Cicirko ");
        Osoba o2 = new Osoba();
        IObject osoba2 = new Osoba("Grześ", "Sresiu");
        osoba2.Wyswietl();
        k1.insert(o1);
        k1.insert(o2);
        k1.insert(osoba2);
        k1.displayQueue();
        k1.remove();
        k1.displayQueue();

        Pacjet p1 = new Pacjet();
        Pacjet p2 = new Pacjet( "Sita ", "Cicirko ", "12344 ", "1234 ");
        k1.insert(p1);
        k1.insert(p2);
        p1.Wyswietl();
        p2.Wyswietl();

        k1.displayQueue();






    }

        }
