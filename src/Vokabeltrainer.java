import java.util.Scanner;

public class Vokabeltrainer {
    private List<Vokabel> vokabeln = new List();
    private Scanner scan = new Scanner(System.in);
    private int size;

    public Vokabeltrainer() {
        size = 0;
    }

    public void vokabelHinzufuegen(String deutsch, String englisch) {
        if (!vokabeln.isEmpty())
            vokabeln.toFirst();
        vokabeln.insert(new Vokabel(deutsch, englisch));
    }
}
