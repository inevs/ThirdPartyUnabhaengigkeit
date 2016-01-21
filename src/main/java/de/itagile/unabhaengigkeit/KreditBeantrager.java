package de.itagile.unabhaengigkeit;

import de.thirdparty.kreditpruefer.KreditPruefer;

public class KreditBeantrager {
    private Kreditantrag kreditantrag;
    private KreditPruefer thirdPartyKreditPruefer;

    public KreditBeantrager(Kreditantrag kreditantrag) {
        this.kreditantrag = kreditantrag;
        thirdPartyKreditPruefer = new KreditPruefer();
    }

    public boolean pruefeKreditFaehigkeit() {
        return thirdPartyKreditPruefer.pruefeKreditFaehigkeit(kreditantrag.getGesamtVermoegenInEuro(), kreditantrag.getMonatlEinkommenInEuro());
    }

    public Kredit nehmeKreditAuf() {
        return new Kredit();
    }

}
