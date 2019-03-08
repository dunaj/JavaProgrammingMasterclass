package pl.adulek;

public class Main {

    public static void main(String[] args) {
        String line = "Twaro Mis Bubi Krauzega Adulek Kapuczino";
        AduList list = new AduList();
        String[] data = line.split(" ");
        for (String s : data) {
            list.addItem(s);
        }
        list.print();

        list.addItem("Bubi");

        list.removeItem("Bubi");
        list.removeItem("Kapuczino");
        list.addItem("Kajto");
        list.removeItem("Twaro");
        list.print();
        list.removeItem("Adulek");
        list.print();
        list.removeItem("Kajto");
        list.removeItem("Krauzega");
        list.removeItem("Mis");
        list.print();
        list.addItem("Kajto");
        list.addItem("Adam");
        list.print();
    }
}
