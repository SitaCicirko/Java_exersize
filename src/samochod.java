

    public class samochod {
        protected String marka;
        protected int spalanie;

        public samochod (String marka, int spalanie ){
            this.marka=marka;
            this.spalanie=spalanie;

        }
        public void wypisz(){
            System.out.println("marka i spalanie: " + marka + spalanie);
        }
    }

