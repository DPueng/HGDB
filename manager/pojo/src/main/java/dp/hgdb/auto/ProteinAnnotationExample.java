package dp.hgdb.auto;

import java.util.ArrayList;
import java.util.List;

public class ProteinAnnotationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProteinAnnotationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAccessionIsNull() {
            addCriterion("Accession is null");
            return (Criteria) this;
        }

        public Criteria andAccessionIsNotNull() {
            addCriterion("Accession is not null");
            return (Criteria) this;
        }

        public Criteria andAccessionEqualTo(String value) {
            addCriterion("Accession =", value, "accession");
            return (Criteria) this;
        }

        public Criteria andAccessionNotEqualTo(String value) {
            addCriterion("Accession <>", value, "accession");
            return (Criteria) this;
        }

        public Criteria andAccessionGreaterThan(String value) {
            addCriterion("Accession >", value, "accession");
            return (Criteria) this;
        }

        public Criteria andAccessionGreaterThanOrEqualTo(String value) {
            addCriterion("Accession >=", value, "accession");
            return (Criteria) this;
        }

        public Criteria andAccessionLessThan(String value) {
            addCriterion("Accession <", value, "accession");
            return (Criteria) this;
        }

        public Criteria andAccessionLessThanOrEqualTo(String value) {
            addCriterion("Accession <=", value, "accession");
            return (Criteria) this;
        }

        public Criteria andAccessionLike(String value) {
            addCriterion("Accession like", value, "accession");
            return (Criteria) this;
        }

        public Criteria andAccessionNotLike(String value) {
            addCriterion("Accession not like", value, "accession");
            return (Criteria) this;
        }

        public Criteria andAccessionIn(List<String> values) {
            addCriterion("Accession in", values, "accession");
            return (Criteria) this;
        }

        public Criteria andAccessionNotIn(List<String> values) {
            addCriterion("Accession not in", values, "accession");
            return (Criteria) this;
        }

        public Criteria andAccessionBetween(String value1, String value2) {
            addCriterion("Accession between", value1, value2, "accession");
            return (Criteria) this;
        }

        public Criteria andAccessionNotBetween(String value1, String value2) {
            addCriterion("Accession not between", value1, value2, "accession");
            return (Criteria) this;
        }

        public Criteria andGeneSymbolIsNull() {
            addCriterion("gene_symbol is null");
            return (Criteria) this;
        }

        public Criteria andGeneSymbolIsNotNull() {
            addCriterion("gene_symbol is not null");
            return (Criteria) this;
        }

        public Criteria andGeneSymbolEqualTo(String value) {
            addCriterion("gene_symbol =", value, "geneSymbol");
            return (Criteria) this;
        }

        public Criteria andGeneSymbolNotEqualTo(String value) {
            addCriterion("gene_symbol <>", value, "geneSymbol");
            return (Criteria) this;
        }

        public Criteria andGeneSymbolGreaterThan(String value) {
            addCriterion("gene_symbol >", value, "geneSymbol");
            return (Criteria) this;
        }

        public Criteria andGeneSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("gene_symbol >=", value, "geneSymbol");
            return (Criteria) this;
        }

        public Criteria andGeneSymbolLessThan(String value) {
            addCriterion("gene_symbol <", value, "geneSymbol");
            return (Criteria) this;
        }

        public Criteria andGeneSymbolLessThanOrEqualTo(String value) {
            addCriterion("gene_symbol <=", value, "geneSymbol");
            return (Criteria) this;
        }

        public Criteria andGeneSymbolLike(String value) {
            addCriterion("gene_symbol like", value, "geneSymbol");
            return (Criteria) this;
        }

        public Criteria andGeneSymbolNotLike(String value) {
            addCriterion("gene_symbol not like", value, "geneSymbol");
            return (Criteria) this;
        }

        public Criteria andGeneSymbolIn(List<String> values) {
            addCriterion("gene_symbol in", values, "geneSymbol");
            return (Criteria) this;
        }

        public Criteria andGeneSymbolNotIn(List<String> values) {
            addCriterion("gene_symbol not in", values, "geneSymbol");
            return (Criteria) this;
        }

        public Criteria andGeneSymbolBetween(String value1, String value2) {
            addCriterion("gene_symbol between", value1, value2, "geneSymbol");
            return (Criteria) this;
        }

        public Criteria andGeneSymbolNotBetween(String value1, String value2) {
            addCriterion("gene_symbol not between", value1, value2, "geneSymbol");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightIsNull() {
            addCriterion("Molecular_weight is null");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightIsNotNull() {
            addCriterion("Molecular_weight is not null");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightEqualTo(Integer value) {
            addCriterion("Molecular_weight =", value, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightNotEqualTo(Integer value) {
            addCriterion("Molecular_weight <>", value, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightGreaterThan(Integer value) {
            addCriterion("Molecular_weight >", value, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("Molecular_weight >=", value, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightLessThan(Integer value) {
            addCriterion("Molecular_weight <", value, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightLessThanOrEqualTo(Integer value) {
            addCriterion("Molecular_weight <=", value, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightIn(List<Integer> values) {
            addCriterion("Molecular_weight in", values, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightNotIn(List<Integer> values) {
            addCriterion("Molecular_weight not in", values, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightBetween(Integer value1, Integer value2) {
            addCriterion("Molecular_weight between", value1, value2, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("Molecular_weight not between", value1, value2, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andSvIsNull() {
            addCriterion("SV is null");
            return (Criteria) this;
        }

        public Criteria andSvIsNotNull() {
            addCriterion("SV is not null");
            return (Criteria) this;
        }

        public Criteria andSvEqualTo(String value) {
            addCriterion("SV =", value, "sv");
            return (Criteria) this;
        }

        public Criteria andSvNotEqualTo(String value) {
            addCriterion("SV <>", value, "sv");
            return (Criteria) this;
        }

        public Criteria andSvGreaterThan(String value) {
            addCriterion("SV >", value, "sv");
            return (Criteria) this;
        }

        public Criteria andSvGreaterThanOrEqualTo(String value) {
            addCriterion("SV >=", value, "sv");
            return (Criteria) this;
        }

        public Criteria andSvLessThan(String value) {
            addCriterion("SV <", value, "sv");
            return (Criteria) this;
        }

        public Criteria andSvLessThanOrEqualTo(String value) {
            addCriterion("SV <=", value, "sv");
            return (Criteria) this;
        }

        public Criteria andSvLike(String value) {
            addCriterion("SV like", value, "sv");
            return (Criteria) this;
        }

        public Criteria andSvNotLike(String value) {
            addCriterion("SV not like", value, "sv");
            return (Criteria) this;
        }

        public Criteria andSvIn(List<String> values) {
            addCriterion("SV in", values, "sv");
            return (Criteria) this;
        }

        public Criteria andSvNotIn(List<String> values) {
            addCriterion("SV not in", values, "sv");
            return (Criteria) this;
        }

        public Criteria andSvBetween(String value1, String value2) {
            addCriterion("SV between", value1, value2, "sv");
            return (Criteria) this;
        }

        public Criteria andSvNotBetween(String value1, String value2) {
            addCriterion("SV not between", value1, value2, "sv");
            return (Criteria) this;
        }

        public Criteria andPeIsNull() {
            addCriterion("PE is null");
            return (Criteria) this;
        }

        public Criteria andPeIsNotNull() {
            addCriterion("PE is not null");
            return (Criteria) this;
        }

        public Criteria andPeEqualTo(String value) {
            addCriterion("PE =", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeNotEqualTo(String value) {
            addCriterion("PE <>", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeGreaterThan(String value) {
            addCriterion("PE >", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeGreaterThanOrEqualTo(String value) {
            addCriterion("PE >=", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeLessThan(String value) {
            addCriterion("PE <", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeLessThanOrEqualTo(String value) {
            addCriterion("PE <=", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeLike(String value) {
            addCriterion("PE like", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeNotLike(String value) {
            addCriterion("PE not like", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeIn(List<String> values) {
            addCriterion("PE in", values, "pe");
            return (Criteria) this;
        }

        public Criteria andPeNotIn(List<String> values) {
            addCriterion("PE not in", values, "pe");
            return (Criteria) this;
        }

        public Criteria andPeBetween(String value1, String value2) {
            addCriterion("PE between", value1, value2, "pe");
            return (Criteria) this;
        }

        public Criteria andPeNotBetween(String value1, String value2) {
            addCriterion("PE not between", value1, value2, "pe");
            return (Criteria) this;
        }

        public Criteria andFunctionIsNull() {
            addCriterion("Function is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIsNotNull() {
            addCriterion("Function is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionEqualTo(String value) {
            addCriterion("Function =", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotEqualTo(String value) {
            addCriterion("Function <>", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThan(String value) {
            addCriterion("Function >", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("Function >=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThan(String value) {
            addCriterion("Function <", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThanOrEqualTo(String value) {
            addCriterion("Function <=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLike(String value) {
            addCriterion("Function like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotLike(String value) {
            addCriterion("Function not like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionIn(List<String> values) {
            addCriterion("Function in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotIn(List<String> values) {
            addCriterion("Function not in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionBetween(String value1, String value2) {
            addCriterion("Function between", value1, value2, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotBetween(String value1, String value2) {
            addCriterion("Function not between", value1, value2, "function");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("Length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("Length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Integer value) {
            addCriterion("Length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Integer value) {
            addCriterion("Length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Integer value) {
            addCriterion("Length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("Length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Integer value) {
            addCriterion("Length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Integer value) {
            addCriterion("Length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Integer> values) {
            addCriterion("Length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Integer> values) {
            addCriterion("Length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Integer value1, Integer value2) {
            addCriterion("Length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("Length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andCoverageIsNull() {
            addCriterion("Coverage is null");
            return (Criteria) this;
        }

        public Criteria andCoverageIsNotNull() {
            addCriterion("Coverage is not null");
            return (Criteria) this;
        }

        public Criteria andCoverageEqualTo(String value) {
            addCriterion("Coverage =", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageNotEqualTo(String value) {
            addCriterion("Coverage <>", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageGreaterThan(String value) {
            addCriterion("Coverage >", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageGreaterThanOrEqualTo(String value) {
            addCriterion("Coverage >=", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageLessThan(String value) {
            addCriterion("Coverage <", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageLessThanOrEqualTo(String value) {
            addCriterion("Coverage <=", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageLike(String value) {
            addCriterion("Coverage like", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageNotLike(String value) {
            addCriterion("Coverage not like", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageIn(List<String> values) {
            addCriterion("Coverage in", values, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageNotIn(List<String> values) {
            addCriterion("Coverage not in", values, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageBetween(String value1, String value2) {
            addCriterion("Coverage between", value1, value2, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageNotBetween(String value1, String value2) {
            addCriterion("Coverage not between", value1, value2, "coverage");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}