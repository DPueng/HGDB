package dp.hgdb.pojo;

import java.math.BigDecimal;

public class ResultPojo {

    private String accession;
    private String geneSymbol;
    private String description;
    private Integer molecularWeight;


    //exp 1
    private BigDecimal FC1;
    private BigDecimal ratio1;
    private Integer peptideNum1;

    //exp 2
    private BigDecimal FC2;
    private BigDecimal ratio2;
    private Integer peptideNum2;

    //exp 3
    private BigDecimal FC3;
    private BigDecimal ratio3;
    private Integer peptideNum3;

    //exp 4
    private BigDecimal FC4;
    private BigDecimal ratio4;
    private Integer peptideNum4;

    //exp 1
    private BigDecimal FC5;
    private BigDecimal ratio5;
    private Integer peptideNum5;


    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    public String getGeneSymbol() {
        return geneSymbol;
    }

    public void setGeneSymbol(String geneSymbol) {
        this.geneSymbol = geneSymbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMolecularWeight() {
        return molecularWeight;
    }

    public void setMolecularWeight(Integer molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    public BigDecimal getFC1() {
        return FC1;
    }

    public void setFC1(BigDecimal FC1) {
        this.FC1 = FC1;
    }

    public BigDecimal getRatio1() {
        return ratio1;
    }

    public void setRatio1(BigDecimal ratio1) {
        this.ratio1 = ratio1;
    }

    public Integer getPeptideNum1() {
        return peptideNum1;
    }

    public void setPeptideNum1(Integer peptideNum1) {
        this.peptideNum1 = peptideNum1;
    }

    public BigDecimal getFC2() {
        return FC2;
    }

    public void setFC2(BigDecimal FC2) {
        this.FC2 = FC2;
    }

    public BigDecimal getRatio2() {
        return ratio2;
    }

    public void setRatio2(BigDecimal ratio2) {
        this.ratio2 = ratio2;
    }

    public Integer getPeptideNum2() {
        return peptideNum2;
    }

    public void setPeptideNum2(Integer peptideNum2) {
        this.peptideNum2 = peptideNum2;
    }

    public BigDecimal getFC3() {
        return FC3;
    }

    public void setFC3(BigDecimal FC3) {
        this.FC3 = FC3;
    }

    public BigDecimal getRatio3() {
        return ratio3;
    }

    public void setRatio3(BigDecimal ratio3) {
        this.ratio3 = ratio3;
    }

    public Integer getPeptideNum3() {
        return peptideNum3;
    }

    public void setPeptideNum3(Integer peptideNum3) {
        this.peptideNum3 = peptideNum3;
    }

    public BigDecimal getFC4() {
        return FC4;
    }

    public void setFC4(BigDecimal FC4) {
        this.FC4 = FC4;
    }

    public BigDecimal getRatio4() {
        return ratio4;
    }

    public void setRatio4(BigDecimal ratio4) {
        this.ratio4 = ratio4;
    }

    public Integer getPeptideNum4() {
        return peptideNum4;
    }

    public void setPeptideNum4(Integer peptideNum4) {
        this.peptideNum4 = peptideNum4;
    }

    public BigDecimal getFC5() {
        return FC5;
    }

    public void setFC5(BigDecimal FC5) {
        this.FC5 = FC5;
    }

    public BigDecimal getRatio5() {
        return ratio5;
    }

    public void setRatio5(BigDecimal ratio5) {
        this.ratio5 = ratio5;
    }

    public Integer getPeptideNum5() {
        return peptideNum5;
    }

    public void setPeptideNum5(Integer peptideNum5) {
        this.peptideNum5 = peptideNum5;
    }

    @Override
    public String toString() {
        return "ResultPojo{" +
                "accession='" + accession + '\'' +
                ", geneSymbol='" + geneSymbol + '\'' +
                ", description='" + description + '\'' +
                ", molecularWeight=" + molecularWeight +
                ", FC1=" + FC1 +
                ", ratio1=" + ratio1 +
                ", peptideNum1=" + peptideNum1 +
                ", FC2=" + FC2 +
                ", ratio2=" + ratio2 +
                ", peptideNum2=" + peptideNum2 +
                ", FC3=" + FC3 +
                ", ratio3=" + ratio3 +
                ", peptideNum3=" + peptideNum3 +
                ", FC4=" + FC4 +
                ", ratio4=" + ratio4 +
                ", peptideNum4=" + peptideNum4 +
                ", FC5=" + FC5 +
                ", ratio5=" + ratio5 +
                ", peptideNum5=" + peptideNum5 +
                '}';
    }
}
