public class taxi extends samochod{
    protected float stawka;

    public taxi(String marka, int spalanie, float stawka){
        super(marka, spalanie);
        this.stawka = stawka;
    }
    public void wypisz(){
        super.wypisz();
        System.out.println("stawka: " + stawka);
    }

}
