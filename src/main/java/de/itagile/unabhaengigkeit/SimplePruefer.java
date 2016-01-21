package de.itagile.unabhaengigkeit;

import de.thirdparty.kreditpruefer.KreditPruefer;

public class SimplePruefer implements Pruefer {

	private final KreditPruefer kreditPruefer;

	public SimplePruefer() {
		kreditPruefer = new KreditPruefer();
	}

	@Override
	public boolean pruefeKreditFaehigkeit(int gesamtVermoegenInEuro, int monatlEinkommenInEuro) {
		return kreditPruefer.pruefeKreditFaehigkeit(gesamtVermoegenInEuro, monatlEinkommenInEuro);
	}

}
