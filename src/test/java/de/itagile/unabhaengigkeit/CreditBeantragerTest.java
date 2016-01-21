package de.itagile.unabhaengigkeit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CreditBeantragerTest {

    private KreditBeantrager kreditwuerdigerBeantrager;
    private KreditBeantrager kreditUnwuerdigerBeantrager;

    @Before
    public void setUp() {
        kreditwuerdigerBeantrager = new KreditBeantrager(new Kreditantrag(2000, 20000));
        kreditUnwuerdigerBeantrager = new KreditBeantrager(new Kreditantrag(400, 2000));
    }

    @Test
    public void lehntBeiFehlenderKreditFaehigkeitAb() throws Exception {
        assertThat(kreditUnwuerdigerBeantrager.pruefeKreditFaehigkeit(), is(false));
    }

    @Test
    public void stimmtBeiKreditFaehigkeitZu() throws Exception {
        assertThat(kreditwuerdigerBeantrager.pruefeKreditFaehigkeit(), is(true));
    }

    @Test
    public void kannKreditAufnehmen() {
        Kredit kredit = kreditwuerdigerBeantrager.nehmeKreditAuf();
        assertThat(kredit.aufgenommen(), is(true));
    }

}
