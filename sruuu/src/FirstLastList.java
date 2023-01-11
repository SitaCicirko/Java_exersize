public class FirstLastList {
    class Link {
        private IObject dData;
        private Link next;  //nastepny element listy

        public Link(IObject d)//konstruktor
        {
            dData = d;
            next = null;
        }

        //------------
        public void displayLink()  //wypisanie danych
        {
            dData.Wyswietl();
            //System.out.print(dData + " ");
        }
    } // koniec klasy Link

    //////////////////////////
    private Link first;  //referencja do pierwszego elementu
    private Link last;  //refeerencja do ostatniego elementu

    //------------
    public FirstLastList()//konstruktor
    {
        first = null;
        last = null;
    }

    //-------------
    public boolean isEmpty() //wzraca true jesli lista jest pusta
    {
        return first == null;
    }

    public void insertFirst(IObject dd)//wstawia na poczatek listy
    {
        Link newLink = new Link(dd);
        if (isEmpty())
            last = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(IObject dd)//wstawianie na koniec listy
    {
        Link newLink = new Link(dd);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    //----------------------
    public IObject deleteFirst()//usuwanie pierwszego elementu
    {
        IObject temp = first.dData;
        if (first.next == null)
            last = null;
        first = first.next;
        return temp;
    }

    //--------------------
    public void displayList() {
        System.out.println("Lista (poczatek --> koniec): ");
        Link current = first; //zaczynamy od poczatku;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}