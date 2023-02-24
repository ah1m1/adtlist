public class Vokabel {
    private String deutsch, englisch;
    private int anzahlVersuche, anzahlKorrekt;
    private double erfolgsquote;

    public Vokabel(String d, String e) {
        deutsch = d;
        englisch = e;
    }

    public String getDeutsch() {
        return deutsch;
    }

    public String getEnglisch() {
        return englisch;
    }

    public void setAnzahlVersuche(int versuche) {
        anzahlVersuche = versuche;
    }

    public int getAnzahlVersuche() {
        return anzahlVersuche;
    }

    public void setAnzahlKorrekt(int korrekt) {
        anzahlKorrekt = korrekt;
    }

    public int getAnzahlKorrekt() {
        return getAnzahlKorrekt();
    }

    public void setErfolgsquote(double quote) {
        erfolgsquote = quote;
    }

    public double getErfolgsquote() {
        return erfolgsquote;
    }
}
