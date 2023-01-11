public class Osoba implements IObject {
    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public Osoba(){
        imie = "Jan";
        nazwisko = "Nowak";
    }
    public void Wyswietl() {
        System.out.println(imie + " " + nazwisko);
    }
}
