package dp.hgdb.auto;

import java.math.BigDecimal;

public class PeptideLevel {
    private Integer peptideId;

    private Integer expId;

    private Integer proteinId;

    private String sequence;

    private String prob;

    private String ionScore;

    private BigDecimal repeat1;

    private BigDecimal repeat2;

    private BigDecimal repeat3;

    private BigDecimal ratio;

    public Integer getPeptideId() {
        return peptideId;
    }

    public void setPeptideId(Integer peptideId) {
        this.peptideId = peptideId;
    }

    public Integer getExpId() {
        return expId;
    }

    public void setExpId(Integer expId) {
        this.expId = expId;
    }

    public Integer getProteinId() {
        return proteinId;
    }

    public void setProteinId(Integer proteinId) {
        this.proteinId = proteinId;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence == null ? null : sequence.trim();
    }

    public String getProb() {
        return prob;
    }

    public void setProb(String prob) {
        this.prob = prob == null ? null : prob.trim();
    }

    public String getIonScore() {
        return ionScore;
    }

    public void setIonScore(String ionScore) {
        this.ionScore = ionScore == null ? null : ionScore.trim();
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