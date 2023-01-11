import java.util.ArrayList;
import java.util.List;

public class Groups {
    ArrayList<Student> Group;
    private Wykladowca W;
    private String GName;
    public Groups(String GName) {
        Group = new ArrayList<>();
        this.GName = GName;
    }
    public void AddStudent(Student S){
        Group.add(S);
    }
    public void AddWykladowce(Wykladowca W){
        this.W = W ;
    }
    public void ViewGroupName(){
       System.out.println("Name: " + GName);
    }

    public void ViewGroup() {
        ViewGroupName();
        System.out.println("Teacher: " + W.Name + " " + W.Surname );
        for (Student S : Group) System.out.println(S.Name + " " + S.Surname + " " + S.Grade);
    }
}
