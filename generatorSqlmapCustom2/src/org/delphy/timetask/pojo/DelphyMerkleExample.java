package org.delphy.timetask.pojo;

import java.util.ArrayList;
import java.util.List;

public class DelphyMerkleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DelphyMerkleExample() {
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

        public Criteria andRootHashIsNull() {
            addCriterion("root_hash is null");
            return (Criteria) this;
        }

        public Criteria andRootHashIsNotNull() {
            addCriterion("root_hash is not null");
            return (Criteria) this;
        }

        public Criteria andRootHashEqualTo(String value) {
            addCriterion("root_hash =", value, "rootHash");
            return (Criteria) this;
        }

        public Criteria andRootHashNotEqualTo(String value) {
            addCriterion("root_hash <>", value, "rootHash");
            return (Criteria) this;
        }

        public Criteria andRootHashGreaterThan(String value) {
            addCriterion("root_hash >", value, "rootHash");
            return (Criteria) this;
        }

        public Criteria andRootHashGreaterThanOrEqualTo(String value) {
            addCriterion("root_hash >=", value, "rootHash");
            return (Criteria) this;
        }

        public Criteria andRootHashLessThan(String value) {
            addCriterion("root_hash <", value, "rootHash");
            return (Criteria) this;
        }

        public Criteria andRootHashLessThanOrEqualTo(String value) {
            addCriterion("root_hash <=", value, "rootHash");
            return (Criteria) this;
        }

        public Criteria andRootHashLike(String value) {
            addCriterion("root_hash like", value, "rootHash");
            return (Criteria) this;
        }

        public Criteria andRootHashNotLike(String value) {
            addCriterion("root_hash not like", value, "rootHash");
            return (Criteria) this;
        }

        public Criteria andRootHashIn(List<String> values) {
            addCriterion("root_hash in", values, "rootHash");
            return (Criteria) this;
        }

        public Criteria andRootHashNotIn(List<String> values) {
            addCriterion("root_hash not in", values, "rootHash");
            return (Criteria) this;
        }

        public Criteria andRootHashBetween(String value1, String value2) {
            addCriterion("root_hash between", value1, value2, "rootHash");
            return (Criteria) this;
        }

        public Criteria andRootHashNotBetween(String value1, String value2) {
            addCriterion("root_hash not between", value1, value2, "rootHash");
            return (Criteria) this;
        }

        public Criteria andTxHashIsNull() {
            addCriterion("tx_hash is null");
            return (Criteria) this;
        }

        public Criteria andTxHashIsNotNull() {
            addCriterion("tx_hash is not null");
            return (Criteria) this;
        }

        public Criteria andTxHashEqualTo(String value) {
            addCriterion("tx_hash =", value, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashNotEqualTo(String value) {
            addCriterion("tx_hash <>", value, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashGreaterThan(String value) {
            addCriterion("tx_hash >", value, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashGreaterThanOrEqualTo(String value) {
            addCriterion("tx_hash >=", value, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashLessThan(String value) {
            addCriterion("tx_hash <", value, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashLessThanOrEqualTo(String value) {
            addCriterion("tx_hash <=", value, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashLike(String value) {
            addCriterion("tx_hash like", value, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashNotLike(String value) {
            addCriterion("tx_hash not like", value, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashIn(List<String> values) {
            addCriterion("tx_hash in", values, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashNotIn(List<String> values) {
            addCriterion("tx_hash not in", values, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashBetween(String value1, String value2) {
            addCriterion("tx_hash between", value1, value2, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashNotBetween(String value1, String value2) {
            addCriterion("tx_hash not between", value1, value2, "txHash");
            return (Criteria) this;
        }

        public Criteria andReceiptsIsNull() {
            addCriterion("receipts is null");
            return (Criteria) this;
        }

        public Criteria andReceiptsIsNotNull() {
            addCriterion("receipts is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptsEqualTo(String value) {
            addCriterion("receipts =", value, "receipts");
            return (Criteria) this;
        }

        public Criteria andReceiptsNotEqualTo(String value) {
            addCriterion("receipts <>", value, "receipts");
            return (Criteria) this;
        }

        public Criteria andReceiptsGreaterThan(String value) {
            addCriterion("receipts >", value, "receipts");
            return (Criteria) this;
        }

        public Criteria andReceiptsGreaterThanOrEqualTo(String value) {
            addCriterion("receipts >=", value, "receipts");
            return (Criteria) this;
        }

        public Criteria andReceiptsLessThan(String value) {
            addCriterion("receipts <", value, "receipts");
            return (Criteria) this;
        }

        public Criteria andReceiptsLessThanOrEqualTo(String value) {
            addCriterion("receipts <=", value, "receipts");
            return (Criteria) this;
        }

        public Criteria andReceiptsLike(String value) {
            addCriterion("receipts like", value, "receipts");
            return (Criteria) this;
        }

        public Criteria andReceiptsNotLike(String value) {
            addCriterion("receipts not like", value, "receipts");
            return (Criteria) this;
        }

        public Criteria andReceiptsIn(List<String> values) {
            addCriterion("receipts in", values, "receipts");
            return (Criteria) this;
        }

        public Criteria andReceiptsNotIn(List<String> values) {
            addCriterion("receipts not in", values, "receipts");
            return (Criteria) this;
        }

        public Criteria andReceiptsBetween(String value1, String value2) {
            addCriterion("receipts between", value1, value2, "receipts");
            return (Criteria) this;
        }

        public Criteria andReceiptsNotBetween(String value1, String value2) {
            addCriterion("receipts not between", value1, value2, "receipts");
            return (Criteria) this;
        }

        public Criteria andTxsIsNull() {
            addCriterion("txs is null");
            return (Criteria) this;
        }

        public Criteria andTxsIsNotNull() {
            addCriterion("txs is not null");
            return (Criteria) this;
        }

        public Criteria andTxsEqualTo(String value) {
            addCriterion("txs =", value, "txs");
            return (Criteria) this;
        }

        public Criteria andTxsNotEqualTo(String value) {
            addCriterion("txs <>", value, "txs");
            return (Criteria) this;
        }

        public Criteria andTxsGreaterThan(String value) {
            addCriterion("txs >", value, "txs");
            return (Criteria) this;
        }

        public Criteria andTxsGreaterThanOrEqualTo(String value) {
            addCriterion("txs >=", value, "txs");
            return (Criteria) this;
        }

        public Criteria andTxsLessThan(String value) {
            addCriterion("txs <", value, "txs");
            return (Criteria) this;
        }

        public Criteria andTxsLessThanOrEqualTo(String value) {
            addCriterion("txs <=", value, "txs");
            return (Criteria) this;
        }

        public Criteria andTxsLike(String value) {
            addCriterion("txs like", value, "txs");
            return (Criteria) this;
        }

        public Criteria andTxsNotLike(String value) {
            addCriterion("txs not like", value, "txs");
            return (Criteria) this;
        }

        public Criteria andTxsIn(List<String> values) {
            addCriterion("txs in", values, "txs");
            return (Criteria) this;
        }

        public Criteria andTxsNotIn(List<String> values) {
            addCriterion("txs not in", values, "txs");
            return (Criteria) this;
        }

        public Criteria andTxsBetween(String value1, String value2) {
            addCriterion("txs between", value1, value2, "txs");
            return (Criteria) this;
        }

        public Criteria andTxsNotBetween(String value1, String value2) {
            addCriterion("txs not between", value1, value2, "txs");
            return (Criteria) this;
        }

        public Criteria andTxCountIsNull() {
            addCriterion("tx_count is null");
            return (Criteria) this;
        }

        public Criteria andTxCountIsNotNull() {
            addCriterion("tx_count is not null");
            return (Criteria) this;
        }

        public Criteria andTxCountEqualTo(Integer value) {
            addCriterion("tx_count =", value, "txCount");
            return (Criteria) this;
        }

        public Criteria andTxCountNotEqualTo(Integer value) {
            addCriterion("tx_count <>", value, "txCount");
            return (Criteria) this;
        }

        public Criteria andTxCountGreaterThan(Integer value) {
            addCriterion("tx_count >", value, "txCount");
            return (Criteria) this;
        }

        public Criteria andTxCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("tx_count >=", value, "txCount");
            return (Criteria) this;
        }

        public Criteria andTxCountLessThan(Integer value) {
            addCriterion("tx_count <", value, "txCount");
            return (Criteria) this;
        }

        public Criteria andTxCountLessThanOrEqualTo(Integer value) {
            addCriterion("tx_count <=", value, "txCount");
            return (Criteria) this;
        }

        public Criteria andTxCountIn(List<Integer> values) {
            addCriterion("tx_count in", values, "txCount");
            return (Criteria) this;
        }

        public Criteria andTxCountNotIn(List<Integer> values) {
            addCriterion("tx_count not in", values, "txCount");
            return (Criteria) this;
        }

        public Criteria andTxCountBetween(Integer value1, Integer value2) {
            addCriterion("tx_count between", value1, value2, "txCount");
            return (Criteria) this;
        }

        public Criteria andTxCountNotBetween(Integer value1, Integer value2) {
            addCriterion("tx_count not between", value1, value2, "txCount");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
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