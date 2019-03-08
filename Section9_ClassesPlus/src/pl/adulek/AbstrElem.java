package pl.adulek;

public abstract class AbstrElem {
    protected AbstrElem prev;
    protected AbstrElem next;
    protected Object object;

    public AbstrElem() {
        prev = null;
        next = null;
        object = null;
    }

    public AbstrElem(Object o) {
        prev = null;
        next = null;
        object = o;
    }

    public AbstrElem getPrev() {
        return prev;
    }

    public void setPrev(AbstrElem prev) {
        this.prev = prev;
    }

    public AbstrElem getNext() {
        return next;
    }

    public void setNext(AbstrElem next) {
        this.next = next;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Comparable object) {
        this.object = object;
    }

    public AbstrElem moveForward() {
        return this.next;
    }

    public AbstrElem moveBackward() {
        return this.prev;
    }

    public abstract int compareTo(AbstrElem e);

}
