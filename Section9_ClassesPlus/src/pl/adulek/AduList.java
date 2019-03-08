package pl.adulek;

public class AduList {
    Adulem head;

    public AduList(Adulem head) {
        this.head = head;
    }

    public AduList() {
        this.head = null;
    }

    public void addItem(String s) {
        Adulem addAdulem = new Adulem(s);
        this.addItem(addAdulem);
    }

    public void addItem(Adulem e) {
        if (head == null) {
            head = e;
            return;
        }

        boolean sorting = true;
        AbstrElem it = head;
        while (sorting) {

            int isGreater = e.compareTo(it);
            if (isGreater == 0) {
                System.out.println("There cannot be duplicates in the list");
                return;
            } else if (isGreater < 0) {
                if (it.getPrev()!=null)
                    it.getPrev().setNext(e);
                else {
                    head = e;
//                    System.out.println("Head was replaced with "+ e.getObject());
                }
                e.setPrev(it.getPrev());
                e.setNext(it);
                it.setPrev(e);
//                System.out.println("Elem "+e.getObject()+" was added to the list");
                sorting = false;
                continue;
            }
            if(it.getNext() == null) {
                it.setNext(e);
                e.setPrev(it);
                sorting = false;
            } else {
                it = it.moveForward();
            }
        }
    }

    public boolean removeItem(String value) {
        if (head == null) {
            System.out.println("No elements in list");
            return false;
        }
        AbstrElem it = head;
        while (true) {
            if (it == null)
                break;
            if (it.getObject().equals(value)) {
                if(it.getPrev() == null) {
                    head = (Adulem)it.getNext();
                } else {
                    it.getPrev().setNext(it.getNext());
                }
                if(it.getNext() != null)
                    it.getNext().setPrev(it.getPrev());
                System.out.println("" + it.getObject() + " was removed from list!");
                return true;
            }
            it = it.moveForward();
        }
        System.out.println("There is no such elem");
        return false;
    }

    public void print() {
        System.out.println("List contains: ");
        AbstrElem it = head;
        while (true) {
            if (it == null)
                break;
            System.out.println(""+it.getObject());
            it = it.moveForward();
        }

    }

}
