package de.itagile.unabhaengigkeit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class CreditBeantragerTest {

    private KreditBeantrager kreditBeantrager;
    private Pruefer pruefer;

    @Before
    public void setUp() {
        kreditBeantrager = new KreditBeantrager(mock(Kreditantrag.class));
        pruefer = mock(Pruefer.class);
    }

    @Test
    public void lehntBeiFehlenderKreditFaehigkeitAb() throws Exception {
        when(pruefer.pruefeKreditFaehigkeit(anyInt(), anyInt())).thenReturn(false);
        kreditBeantrager.setPruefer(pruefer);
        assertThat(kreditBeantrager.pruefeKreditFaehigkeit(), is(false));
    }

    @Test
    public void stimmtBeiKreditFaehigkeitZu() throws Exception {
        Pruefer positivPruefer = mock(Pruefer.class);
        when(positivPruefer.pruefeKreditFaehigkeit(anyInt(), anyInt())).thenReturn(true);
        kreditBeantrager.setPruefer(positivPruefer);
        assertThat(kreditBeantrager.pruefeKreditFaehigkeit(), is(true));
    }

    @Test
    public void kannKreditAufnehmen() {
        Kredit kredit = kreditBeantrager.nehmeKreditAuf();
        assertThat(kredit.aufgenommen(), is(true));
    }

}
