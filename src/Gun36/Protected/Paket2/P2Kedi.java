package Gun36.Protected.Paket2;

import Gun36.Protected.Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {
    public P2Kedi(String ad, String cinsi) {
        super.Ad = ad;  // kendi class olsaydı this diyecektik,
        // ust class ın elemanı oldugu için super dedik.
        super.cinsi = cinsi;
    }

    @Override
    public String toString() {
        return "P2Kedi{" +
                "Ad='" + Ad + '\'' +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }
}
