public class Pacjet extends Osoba {
    private String pesel;
    private String numerKartoteki;
    public Pacjet(String imie, String nazwisko, String pesel, String numerKartoteki){
        super(imie, nazwisko);
        this.pesel = pesel;
        this.numerKartoteki = numerKartoteki;

    }
    public Pacjet(){
        super();
        pesel = " ";
        numerKartoteki = " ";
    }
    public void Wyswietl() {
        super.Wyswietl();
        System.out.println(pesel + numerKartoteki);
    }

}
