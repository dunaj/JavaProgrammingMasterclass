package pl.adulek;

public class Adulem extends AbstrElem {

    public int compareTo(AbstrElem e) {
        return ((String)this.object).compareTo((String)e.object);
    }

    public Adulem(String s) {
        super((Object)s);
    }
}
