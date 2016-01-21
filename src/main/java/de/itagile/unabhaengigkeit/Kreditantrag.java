package de.itagile.unabhaengigkeit;

public class Kreditantrag {

    private int monatlEinkommenInEuro;
    private int gesamtVermoegenInEuro;

    public Kreditantrag(int monatlEinkommenInEuro, int gesamtVermoegen) {
        this.monatlEinkommenInEuro = monatlEinkommenInEuro;
        gesamtVermoegenInEuro = gesamtVermoegen;
    }

    public int getMonatlEinkommenInEuro() {
        return monatlEinkommenInEuro;
    }

    public int getGesamtVermoegenInEuro() {
        return gesamtVermoegenInEuro;
    }

}
