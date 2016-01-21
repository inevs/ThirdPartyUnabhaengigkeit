package de.itagile.unabhaengigkeit;

public class KreditBeantrager {
    private Pruefer pruefer;
    private Kreditantrag kreditantrag;

    public KreditBeantrager(Kreditantrag kreditantrag) {
        this.kreditantrag = kreditantrag;
        pruefer = new SimplePruefer();
    }

    public Pruefer getPruefer() {
		if (pruefer == null) {
			pruefer = new SimplePruefer();
		}
        return pruefer;
    }

	public void setPruefer(Pruefer pruefer) {
		this.pruefer = pruefer;
	}

    public boolean pruefeKreditFaehigkeit() {
        return getPruefer().pruefeKreditFaehigkeit(kreditantrag.getGesamtVermoegenInEuro(), kreditantrag.getMonatlEinkommenInEuro());
    }

    public Kredit nehmeKreditAuf() {
        return new Kredit();
    }

}
