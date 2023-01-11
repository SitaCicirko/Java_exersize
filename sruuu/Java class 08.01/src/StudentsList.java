public class StudentsList extends Osoba implements iStudent {
    double Grade;
    public StudentsList(int StudentNumber, String Name,String Surname, double Grade) {
        this.Name = Name;
        this.Surname = Surname;
        this.Number = StudentNumber;
        this.Grade = Grade;
    }
     public void View() {
        System.out.println(Number + ": " + "Imie: " + Name + " Surname: " + Surname + " " + Grade);
    }
}


