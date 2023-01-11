public class Kolejka implements IKolejka{
        private FirstLastList kolejka;
        Kolejka(){
        kolejka = new FirstLastList();

        };
    public boolean isEmpty() {
        return kolejka.isEmpty();
    }

    public void insert(IObject x) {
        kolejka.insertLast(x);
    }

    public IObject remove() {
        return kolejka.deleteFirst();
    }

    public void displayQueue() {
        kolejka.displayList();

    }


}
