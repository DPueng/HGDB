package dp.hgdb.auto;

import java.math.BigDecimal;

public class ProteinLevel {
    private Integer proteinId;

    private Integer expId;

    private String accession;

    private BigDecimal repeat1;

    private BigDecimal repeat2;

    private BigDecimal repeat3;

    private BigDecimal ratio;

    public Integer getProteinId() {
        return proteinId;
    }

    public void setProteinId(Integer proteinId) {
        this.proteinId = proteinId;
    }

    public Integer getExpId() {
        return expId;
    }

    public void setExpId(Integer expId) {
        this.expId = expId;
    }

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession == null ? null : accession.trim();
    }

    public BigDecimal getRepeat1() {
        return repeat1;
    }

    public void setRepeat1(BigDecimal repeat1) {
        this.repeat1 = repeat1;
    }

    public BigDecimal getRepeat2() {
        return repeat2;
    }

    public void setRepeat2(BigDecimal repeat2) {
        this.repeat2 = repeat2;
    }

    public BigDecimal getRepeat3() {
        return repeat3;
    }

    public void setRepeat3(BigDecimal repeat3) {
        this.repeat3 = repeat3;
    }

    public BigDecimal getRatio() {
        return ratio;
    }

    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }
}