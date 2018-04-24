package dp.hgdb.pojo;

import java.math.BigDecimal;

public class ExpPojo {
    private String accession;
    private BigDecimal ratio;
    private Integer peptideNum;
    private double FC = 1.000000;

    public double getFC() {
        return FC;
    }

    public void setFC(double FC) {
        this.FC = FC;
    }

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    public BigDecimal getRatio() {
        return ratio;
    }

    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }

    public Integer getPeptideNum() {
        return peptideNum;
    }

    public void setPeptideNum(Integer peptideNum) {
        this.peptideNum = peptideNum;
    }
}
