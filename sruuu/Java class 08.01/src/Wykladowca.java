import javax.swing.*;
import java.util.ArrayList;
public class Wykladowca extends Osoba {
    private Groups Gr;
    public Wykladowca (int WNumber,String Name, String Surname){
        this.Number = WNumber;
        this.Name = Name;
        this.Surname = Surname;
    }
    public void setGroup(Groups G){
        if(this.Gr!=null){
            Gr.AddWykladowce(null);
        }
        this.Gr = G;
    }
    public void View(){
        if(this.Gr!=null) {
            Gr.ViewGroupName();
        } else
            System.out.println("Brak grupy");
        System.out.println(Number + ": " + "Imie: " + Name + " " + "Nazwisko: " + Surname);
    }
}
