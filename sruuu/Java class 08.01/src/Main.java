
public class Main {
    public static void main(String[] args) {
        Groups g1 = new Groups("Grupa 1");
        Groups g2 = new Groups("Grupa 2");

        Wykladowca w1 = new Wykladowca(1, "Jan", "Kowalski");
        Wykladowca w2 = new Wykladowca(2, "Anna", "Nowak");

        Student s1 = new Student(1, "Piotr", "Wiśniewski", 4.5);
        Student s2 = new Student(2, "Katarzyna", "Malinowska", 3.5);
        Student s3 = new Student(3, "Michał", "Kwiatkowski", 5.0);
        Student s4 = new Student(4, "Agata", "Dąbrowska", 4.0);

        g1.AddWykladowce(w1);
        g1.AddStudent(s1);
        g1.AddStudent(s2);

        g2.AddWykladowce(w2);
        g2.AddStudent(s3);
        g2.AddStudent(s4);

        g1.ViewGroup();
        System.out.println();
        g2.ViewGroup();

        w1.View();
        w2.View();
    }
}
