package de.thirdparty.kreditpruefer;

public class KreditPruefer {
    @java.lang.Override
    public boolean pruefeKreditFaehigkeit(int gesamtVermoegenInEuro, int monatlichesEinkommenInEuro) {
        return gesamtVermoegenInEuro >= 20000 || monatlichesEinkommenInEuro > 1000;
    }
}
