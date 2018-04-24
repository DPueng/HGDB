package dp.hgdb.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PeptideLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PeptideLevelExample() {
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

        public Criteria andPeptideIdIsNull() {
            addCriterion("Peptide_id is null");
            return (Criteria) this;
        }

        public Criteria andPeptideIdIsNotNull() {
            addCriterion("Peptide_id is not null");
            return (Criteria) this;
        }

        public Criteria andPeptideIdEqualTo(Integer value) {
            addCriterion("Peptide_id =", value, "peptideId");
            return (Criteria) this;
        }

        public Criteria andPeptideIdNotEqualTo(Integer value) {
            addCriterion("Peptide_id <>", value, "peptideId");
            return (Criteria) this;
        }

        public Criteria andPeptideIdGreaterThan(Integer value) {
            addCriterion("Peptide_id >", value, "peptideId");
            return (Criteria) this;
        }

        public Criteria andPeptideIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Peptide_id >=", value, "peptideId");
            return (Criteria) this;
        }

        public Criteria andPeptideIdLessThan(Integer value) {
            addCriterion("Peptide_id <", value, "peptideId");
            return (Criteria) this;
        }

        public Criteria andPeptideIdLessThanOrEqualTo(Integer value) {
            addCriterion("Peptide_id <=", value, "peptideId");
            return (Criteria) this;
        }

        public Criteria andPeptideIdIn(List<Integer> values) {
            addCriterion("Peptide_id in", values, "peptideId");
            return (Criteria) this;
        }

        public Criteria andPeptideIdNotIn(List<Integer> values) {
            addCriterion("Peptide_id not in", values, "peptideId");
            return (Criteria) this;
        }

        public Criteria andPeptideIdBetween(Integer value1, Integer value2) {
            addCriterion("Peptide_id between", value1, value2, "peptideId");
            return (Criteria) this;
        }

        public Criteria andPeptideIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Peptide_id not between", value1, value2, "peptideId");
            return (Criteria) this;
        }

        public Criteria andExpIdIsNull() {
            addCriterion("Exp_id is null");
            return (Criteria) this;
        }

        public Criteria andExpIdIsNotNull() {
            addCriterion("Exp_id is not null");
            return (Criteria) this;
        }

        public Criteria andExpIdEqualTo(Integer value) {
            addCriterion("Exp_id =", value, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdNotEqualTo(Integer value) {
            addCriterion("Exp_id <>", value, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdGreaterThan(Integer value) {
            addCriterion("Exp_id >", value, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Exp_id >=", value, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdLessThan(Integer value) {
            addCriterion("Exp_id <", value, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdLessThanOrEqualTo(Integer value) {
            addCriterion("Exp_id <=", value, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdIn(List<Integer> values) {
            addCriterion("Exp_id in", values, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdNotIn(List<Integer> values) {
            addCriterion("Exp_id not in", values, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdBetween(Integer value1, Integer value2) {
            addCriterion("Exp_id between", value1, value2, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Exp_id not between", value1, value2, "expId");
            return (Criteria) this;
        }

        public Criteria andProteinIdIsNull() {
            addCriterion("Protein_id is null");
            return (Criteria) this;
        }

        public Criteria andProteinIdIsNotNull() {
            addCriterion("Protein_id is not null");
            return (Criteria) this;
        }

        public Criteria andProteinIdEqualTo(Integer value) {
            addCriterion("Protein_id =", value, "proteinId");
            return (Criteria) this;
        }

        public Criteria andProteinIdNotEqualTo(Integer value) {
            addCriterion("Protein_id <>", value, "proteinId");
            return (Criteria) this;
        }

        public Criteria andProteinIdGreaterThan(Integer value) {
            addCriterion("Protein_id >", value, "proteinId");
            return (Criteria) this;
        }

        public Criteria andProteinIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Protein_id >=", value, "proteinId");
            return (Criteria) this;
        }

        public Criteria andProteinIdLessThan(Integer value) {
            addCriterion("Protein_id <", value, "proteinId");
            return (Criteria) this;
        }

        public Criteria andProteinIdLessThanOrEqualTo(Integer value) {
            addCriterion("Protein_id <=", value, "proteinId");
            return (Criteria) this;
        }

        public Criteria andProteinIdIn(List<Integer> values) {
            addCriterion("Protein_id in", values, "proteinId");
            return (Criteria) this;
        }

        public Criteria andProteinIdNotIn(List<Integer> values) {
            addCriterion("Protein_id not in", values, "proteinId");
            return (Criteria) this;
        }

        public Criteria andProteinIdBetween(Integer value1, Integer value2) {
            addCriterion("Protein_id between", value1, value2, "proteinId");
            return (Criteria) this;
        }

        public Criteria andProteinIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Protein_id not between", value1, value2, "proteinId");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNull() {
            addCriterion("Sequence is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNotNull() {
            addCriterion("Sequence is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceEqualTo(String value) {
            addCriterion("Sequence =", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotEqualTo(String value) {
            addCriterion("Sequence <>", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThan(String value) {
            addCriterion("Sequence >", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThanOrEqualTo(String value) {
            addCriterion("Sequence >=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThan(String value) {
            addCriterion("Sequence <", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThanOrEqualTo(String value) {
            addCriterion("Sequence <=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLike(String value) {
            addCriterion("Sequence like", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotLike(String value) {
            addCriterion("Sequence not like", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceIn(List<String> values) {
            addCriterion("Sequence in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotIn(List<String> values) {
            addCriterion("Sequence not in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceBetween(String value1, String value2) {
            addCriterion("Sequence between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotBetween(String value1, String value2) {
            addCriterion("Sequence not between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andProbIsNull() {
            addCriterion("Prob is null");
            return (Criteria) this;
        }

        public Criteria andProbIsNotNull() {
            addCriterion("Prob is not null");
            return (Criteria) this;
        }

        public Criteria andProbEqualTo(String value) {
            addCriterion("Prob =", value, "prob");
            return (Criteria) this;
        }

        public Criteria andProbNotEqualTo(String value) {
            addCriterion("Prob <>", value, "prob");
            return (Criteria) this;
        }

        public Criteria andProbGreaterThan(String value) {
            addCriterion("Prob >", value, "prob");
            return (Criteria) this;
        }

        public Criteria andProbGreaterThanOrEqualTo(String value) {
            addCriterion("Prob >=", value, "prob");
            return (Criteria) this;
        }

        public Criteria andProbLessThan(String value) {
            addCriterion("Prob <", value, "prob");
            return (Criteria) this;
        }

        public Criteria andProbLessThanOrEqualTo(String value) {
            addCriterion("Prob <=", value, "prob");
            return (Criteria) this;
        }

        public Criteria andProbLike(String value) {
            addCriterion("Prob like", value, "prob");
            return (Criteria) this;
        }

        public Criteria andProbNotLike(String value) {
            addCriterion("Prob not like", value, "prob");
            return (Criteria) this;
        }

        public Criteria andProbIn(List<String> values) {
            addCriterion("Prob in", values, "prob");
            return (Criteria) this;
        }

        public Criteria andProbNotIn(List<String> values) {
            addCriterion("Prob not in", values, "prob");
            return (Criteria) this;
        }

        public Criteria andProbBetween(String value1, String value2) {
            addCriterion("Prob between", value1, value2, "prob");
            return (Criteria) this;
        }

        public Criteria andProbNotBetween(String value1, String value2) {
            addCriterion("Prob not between", value1, value2, "prob");
            return (Criteria) this;
        }

        public Criteria andIonScoreIsNull() {
            addCriterion("Ion_score is null");
            return (Criteria) this;
        }

        public Criteria andIonScoreIsNotNull() {
            addCriterion("Ion_score is not null");
            return (Criteria) this;
        }

        public Criteria andIonScoreEqualTo(String value) {
            addCriterion("Ion_score =", value, "ionScore");
            return (Criteria) this;
        }

        public Criteria andIonScoreNotEqualTo(String value) {
            addCriterion("Ion_score <>", value, "ionScore");
            return (Criteria) this;
        }

        public Criteria andIonScoreGreaterThan(String value) {
            addCriterion("Ion_score >", value, "ionScore");
            return (Criteria) this;
        }

        public Criteria andIonScoreGreaterThanOrEqualTo(String value) {
            addCriterion("Ion_score >=", value, "ionScore");
            return (Criteria) this;
        }

        public Criteria andIonScoreLessThan(String value) {
            addCriterion("Ion_score <", value, "ionScore");
            return (Criteria) this;
        }

        public Criteria andIonScoreLessThanOrEqualTo(String value) {
            addCriterion("Ion_score <=", value, "ionScore");
            return (Criteria) this;
        }

        public Criteria andIonScoreLike(String value) {
            addCriterion("Ion_score like", value, "ionScore");
            return (Criteria) this;
        }

        public Criteria andIonScoreNotLike(String value) {
            addCriterion("Ion_score not like", value, "ionScore");
            return (Criteria) this;
        }

        public Criteria andIonScoreIn(List<String> values) {
            addCriterion("Ion_score in", values, "ionScore");
            return (Criteria) this;
        }

        public Criteria andIonScoreNotIn(List<String> values) {
            addCriterion("Ion_score not in", values, "ionScore");
            return (Criteria) this;
        }

        public Criteria andIonScoreBetween(String value1, String value2) {
            addCriterion("Ion_score between", value1, value2, "ionScore");
            return (Criteria) this;
        }

        public Criteria andIonScoreNotBetween(String value1, String value2) {
            addCriterion("Ion_score not between", value1, value2, "ionScore");
            return (Criteria) this;
        }

        public Criteria andRepeat1IsNull() {
            addCriterion("Repeat1 is null");
            return (Criteria) this;
        }

        public Criteria andRepeat1IsNotNull() {
            addCriterion("Repeat1 is not null");
            return (Criteria) this;
        }

        public Criteria andRepeat1EqualTo(BigDecimal value) {
            addCriterion("Repeat1 =", value, "repeat1");
            return (Criteria) this;
        }

        public Criteria andRepeat1NotEqualTo(BigDecimal value) {
            addCriterion("Repeat1 <>", value, "repeat1");
            return (Criteria) this;
        }

        public Criteria andRepeat1GreaterThan(BigDecimal value) {
            addCriterion("Repeat1 >", value, "repeat1");
            return (Criteria) this;
        }

        public Criteria andRepeat1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Repeat1 >=", value, "repeat1");
            return (Criteria) this;
        }

        public Criteria andRepeat1LessThan(BigDecimal value) {
            addCriterion("Repeat1 <", value, "repeat1");
            return (Criteria) this;
        }

        public Criteria andRepeat1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Repeat1 <=", value, "repeat1");
            return (Criteria) this;
        }

        public Criteria andRepeat1In(List<BigDecimal> values) {
            addCriterion("Repeat1 in", values, "repeat1");
            return (Criteria) this;
        }

        public Criteria andRepeat1NotIn(List<BigDecimal> values) {
            addCriterion("Repeat1 not in", values, "repeat1");
            return (Criteria) this;
        }

        public Criteria andRepeat1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Repeat1 between", value1, value2, "repeat1");
            return (Criteria) this;
        }

        public Criteria andRepeat1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Repeat1 not between", value1, value2, "repeat1");
            return (Criteria) this;
        }

        public Criteria andRepeat2IsNull() {
            addCriterion("Repeat2 is null");
            return (Criteria) this;
        }

        public Criteria andRepeat2IsNotNull() {
            addCriterion("Repeat2 is not null");
            return (Criteria) this;
        }

        public Criteria andRepeat2EqualTo(BigDecimal value) {
            addCriterion("Repeat2 =", value, "repeat2");
            return (Criteria) this;
        }

        public Criteria andRepeat2NotEqualTo(BigDecimal value) {
            addCriterion("Repeat2 <>", value, "repeat2");
            return (Criteria) this;
        }

        public Criteria andRepeat2GreaterThan(BigDecimal value) {
            addCriterion("Repeat2 >", value, "repeat2");
            return (Criteria) this;
        }

        public Criteria andRepeat2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Repeat2 >=", value, "repeat2");
            return (Criteria) this;
        }

        public Criteria andRepeat2LessThan(BigDecimal value) {
            addCriterion("Repeat2 <", value, "repeat2");
            return (Criteria) this;
        }

        public Criteria andRepeat2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Repeat2 <=", value, "repeat2");
            return (Criteria) this;
        }

        public Criteria andRepeat2In(List<BigDecimal> values) {
            addCriterion("Repeat2 in", values, "repeat2");
            return (Criteria) this;
        }

        public Criteria andRepeat2NotIn(List<BigDecimal> values) {
            addCriterion("Repeat2 not in", values, "repeat2");
            return (Criteria) this;
        }

        public Criteria andRepeat2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Repeat2 between", value1, value2, "repeat2");
            return (Criteria) this;
        }

        public Criteria andRepeat2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Repeat2 not between", value1, value2, "repeat2");
            return (Criteria) this;
        }

        public Criteria andRepeat3IsNull() {
            addCriterion("Repeat3 is null");
            return (Criteria) this;
        }

        public Criteria andRepeat3IsNotNull() {
            addCriterion("Repeat3 is not null");
            return (Criteria) this;
        }

        public Criteria andRepeat3EqualTo(BigDecimal value) {
            addCriterion("Repeat3 =", value, "repeat3");
            return (Criteria) this;
        }

        public Criteria andRepeat3NotEqualTo(BigDecimal value) {
            addCriterion("Repeat3 <>", value, "repeat3");
            return (Criteria) this;
        }

        public Criteria andRepeat3GreaterThan(BigDecimal value) {
            addCriterion("Repeat3 >", value, "repeat3");
            return (Criteria) this;
        }

        public Criteria andRepeat3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Repeat3 >=", value, "repeat3");
            return (Criteria) this;
        }

        public Criteria andRepeat3LessThan(BigDecimal value) {
            addCriterion("Repeat3 <", value, "repeat3");
            return (Criteria) this;
        }

        public Criteria andRepeat3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Repeat3 <=", value, "repeat3");
            return (Criteria) this;
        }

        public Criteria andRepeat3In(List<BigDecimal> values) {
            addCriterion("Repeat3 in", values, "repeat3");
            return (Criteria) this;
        }

        public Criteria andRepeat3NotIn(List<BigDecimal> values) {
            addCriterion("Repeat3 not in", values, "repeat3");
            return (Criteria) this;
        }

        public Criteria andRepeat3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Repeat3 between", value1, value2, "repeat3");
            return (Criteria) this;
        }

        public Criteria andRepeat3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Repeat3 not between", value1, value2, "repeat3");
            return (Criteria) this;
        }

        public Criteria andRatioIsNull() {
            addCriterion("Ratio is null");
            return (Criteria) this;
        }

        public Criteria andRatioIsNotNull() {
            addCriterion("Ratio is not null");
            return (Criteria) this;
        }

        public Criteria andRatioEqualTo(BigDecimal value) {
            addCriterion("Ratio =", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotEqualTo(BigDecimal value) {
            addCriterion("Ratio <>", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThan(BigDecimal value) {
            addCriterion("Ratio >", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Ratio >=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThan(BigDecimal value) {
            addCriterion("Ratio <", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Ratio <=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioIn(List<BigDecimal> values) {
            addCriterion("Ratio in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotIn(List<BigDecimal> values) {
            addCriterion("Ratio not in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Ratio between", value1, value2, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Ratio not between", value1, value2, "ratio");
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