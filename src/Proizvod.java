import java.math.BigDecimal;
import java.math.RoundingMode;

public class Proizvod {
    private String naziv;
    private BigDecimal cijena;
    private BigDecimal popust = BigDecimal.ZERO;

    public Proizvod(String naziv, BigDecimal cijena) {
        this.naziv = naziv;
        this.cijena = cijena;
    }
    public void postaviPopust(BigDecimal postotak) {
        this.popust = postotak;
    }

    public BigDecimal izracunajCijenu() {
        BigDecimal iznosPopusta = this.cijena.multiply(this.popust.divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP));
        return this.cijena.subtract(iznosPopusta);
    }

    public String getNaziv() {
        return naziv;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public BigDecimal getPopust() {
        return popust;
    }
}