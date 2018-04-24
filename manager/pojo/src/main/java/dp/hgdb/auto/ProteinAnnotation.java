package dp.hgdb.auto;

public class ProteinAnnotation {
    private String accession;

    private String geneSymbol;

    private String description;

    private Integer molecularWeight;

    private String sv;

    private String pe;

    private String function;

    private Integer length;

    private String coverage;

    private String sequence;

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession == null ? null : accession.trim();
    }

    public String getGeneSymbol() {
        return geneSymbol;
    }

    public void setGeneSymbol(String geneSymbol) {
        this.geneSymbol = geneSymbol == null ? null : geneSymbol.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getMolecularWeight() {
        return molecularWeight;
    }

    public void setMolecularWeight(Integer molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    public String getSv() {
        return sv;
    }

    public void setSv(String sv) {
        this.sv = sv == null ? null : sv.trim();
    }

    public String getPe() {
        return pe;
    }

    public void setPe(String pe) {
        this.pe = pe == null ? null : pe.trim();
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function == null ? null : function.trim();
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage == null ? null : coverage.trim();
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence == null ? null : sequence.trim();
    }
}