package org.delphy.timetask.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DelphyTransactionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DelphyTransactionExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMarketIdIsNull() {
            addCriterion("market_id is null");
            return (Criteria) this;
        }

        public Criteria andMarketIdIsNotNull() {
            addCriterion("market_id is not null");
            return (Criteria) this;
        }

        public Criteria andMarketIdEqualTo(Long value) {
            addCriterion("market_id =", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotEqualTo(Long value) {
            addCriterion("market_id <>", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdGreaterThan(Long value) {
            addCriterion("market_id >", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdGreaterThanOrEqualTo(Long value) {
            addCriterion("market_id >=", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdLessThan(Long value) {
            addCriterion("market_id <", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdLessThanOrEqualTo(Long value) {
            addCriterion("market_id <=", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdIn(List<Long> values) {
            addCriterion("market_id in", values, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotIn(List<Long> values) {
            addCriterion("market_id not in", values, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdBetween(Long value1, Long value2) {
            addCriterion("market_id between", value1, value2, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotBetween(Long value1, Long value2) {
            addCriterion("market_id not between", value1, value2, "marketId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOptionIdIsNull() {
            addCriterion("option_id is null");
            return (Criteria) this;
        }

        public Criteria andOptionIdIsNotNull() {
            addCriterion("option_id is not null");
            return (Criteria) this;
        }

        public Criteria andOptionIdEqualTo(Long value) {
            addCriterion("option_id =", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdNotEqualTo(Long value) {
            addCriterion("option_id <>", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdGreaterThan(Long value) {
            addCriterion("option_id >", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("option_id >=", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdLessThan(Long value) {
            addCriterion("option_id <", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdLessThanOrEqualTo(Long value) {
            addCriterion("option_id <=", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdIn(List<Long> values) {
            addCriterion("option_id in", values, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdNotIn(List<Long> values) {
            addCriterion("option_id not in", values, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdBetween(Long value1, Long value2) {
            addCriterion("option_id between", value1, value2, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdNotBetween(Long value1, Long value2) {
            addCriterion("option_id not between", value1, value2, "optionId");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(BigDecimal value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(BigDecimal value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(BigDecimal value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(BigDecimal value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<BigDecimal> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<BigDecimal> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNull() {
            addCriterion("trans_type is null");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNotNull() {
            addCriterion("trans_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransTypeEqualTo(Boolean value) {
            addCriterion("trans_type =", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotEqualTo(Boolean value) {
            addCriterion("trans_type <>", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThan(Boolean value) {
            addCriterion("trans_type >", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("trans_type >=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThan(Boolean value) {
            addCriterion("trans_type <", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("trans_type <=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeIn(List<Boolean> values) {
            addCriterion("trans_type in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotIn(List<Boolean> values) {
            addCriterion("trans_type not in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("trans_type between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("trans_type not between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andMerkleRootIsNull() {
            addCriterion("merkle_root is null");
            return (Criteria) this;
        }

        public Criteria andMerkleRootIsNotNull() {
            addCriterion("merkle_root is not null");
            return (Criteria) this;
        }

        public Criteria andMerkleRootEqualTo(String value) {
            addCriterion("merkle_root =", value, "merkleRoot");
            return (Criteria) this;
        }

        public Criteria andMerkleRootNotEqualTo(String value) {
            addCriterion("merkle_root <>", value, "merkleRoot");
            return (Criteria) this;
        }

        public Criteria andMerkleRootGreaterThan(String value) {
            addCriterion("merkle_root >", value, "merkleRoot");
            return (Criteria) this;
        }

        public Criteria andMerkleRootGreaterThanOrEqualTo(String value) {
            addCriterion("merkle_root >=", value, "merkleRoot");
            return (Criteria) this;
        }

        public Criteria andMerkleRootLessThan(String value) {
            addCriterion("merkle_root <", value, "merkleRoot");
            return (Criteria) this;
        }

        public Criteria andMerkleRootLessThanOrEqualTo(String value) {
            addCriterion("merkle_root <=", value, "merkleRoot");
            return (Criteria) this;
        }

        public Criteria andMerkleRootLike(String value) {
            addCriterion("merkle_root like", value, "merkleRoot");
            return (Criteria) this;
        }

        public Criteria andMerkleRootNotLike(String value) {
            addCriterion("merkle_root not like", value, "merkleRoot");
            return (Criteria) this;
        }

        public Criteria andMerkleRootIn(List<String> values) {
            addCriterion("merkle_root in", values, "merkleRoot");
            return (Criteria) this;
        }

        public Criteria andMerkleRootNotIn(List<String> values) {
            addCriterion("merkle_root not in", values, "merkleRoot");
            return (Criteria) this;
        }

        public Criteria andMerkleRootBetween(String value1, String value2) {
            addCriterion("merkle_root between", value1, value2, "merkleRoot");
            return (Criteria) this;
        }

        public Criteria andMerkleRootNotBetween(String value1, String value2) {
            addCriterion("merkle_root not between", value1, value2, "merkleRoot");
            return (Criteria) this;
        }

        public Criteria andMerkleOrderIsNull() {
            addCriterion("merkle_order is null");
            return (Criteria) this;
        }

        public Criteria andMerkleOrderIsNotNull() {
            addCriterion("merkle_order is not null");
            return (Criteria) this;
        }

        public Criteria andMerkleOrderEqualTo(Integer value) {
            addCriterion("merkle_order =", value, "merkleOrder");
            return (Criteria) this;
        }

        public Criteria andMerkleOrderNotEqualTo(Integer value) {
            addCriterion("merkle_order <>", value, "merkleOrder");
            return (Criteria) this;
        }

        public Criteria andMerkleOrderGreaterThan(Integer value) {
            addCriterion("merkle_order >", value, "merkleOrder");
            return (Criteria) this;
        }

        public Criteria andMerkleOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("merkle_order >=", value, "merkleOrder");
            return (Criteria) this;
        }

        public Criteria andMerkleOrderLessThan(Integer value) {
            addCriterion("merkle_order <", value, "merkleOrder");
            return (Criteria) this;
        }

        public Criteria andMerkleOrderLessThanOrEqualTo(Integer value) {
            addCriterion("merkle_order <=", value, "merkleOrder");
            return (Criteria) this;
        }

        public Criteria andMerkleOrderIn(List<Integer> values) {
            addCriterion("merkle_order in", values, "merkleOrder");
            return (Criteria) this;
        }

        public Criteria andMerkleOrderNotIn(List<Integer> values) {
            addCriterion("merkle_order not in", values, "merkleOrder");
            return (Criteria) this;
        }

        public Criteria andMerkleOrderBetween(Integer value1, Integer value2) {
            addCriterion("merkle_order between", value1, value2, "merkleOrder");
            return (Criteria) this;
        }

        public Criteria andMerkleOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("merkle_order not between", value1, value2, "merkleOrder");
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

        public Criteria andWithdrawAddressIsNull() {
            addCriterion("withdraw_address is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressIsNotNull() {
            addCriterion("withdraw_address is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressEqualTo(String value) {
            addCriterion("withdraw_address =", value, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressNotEqualTo(String value) {
            addCriterion("withdraw_address <>", value, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressGreaterThan(String value) {
            addCriterion("withdraw_address >", value, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressGreaterThanOrEqualTo(String value) {
            addCriterion("withdraw_address >=", value, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressLessThan(String value) {
            addCriterion("withdraw_address <", value, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressLessThanOrEqualTo(String value) {
            addCriterion("withdraw_address <=", value, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressLike(String value) {
            addCriterion("withdraw_address like", value, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressNotLike(String value) {
            addCriterion("withdraw_address not like", value, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressIn(List<String> values) {
            addCriterion("withdraw_address in", values, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressNotIn(List<String> values) {
            addCriterion("withdraw_address not in", values, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressBetween(String value1, String value2) {
            addCriterion("withdraw_address between", value1, value2, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressNotBetween(String value1, String value2) {
            addCriterion("withdraw_address not between", value1, value2, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andCoinTypeIsNull() {
            addCriterion("coin_type is null");
            return (Criteria) this;
        }

        public Criteria andCoinTypeIsNotNull() {
            addCriterion("coin_type is not null");
            return (Criteria) this;
        }

        public Criteria andCoinTypeEqualTo(Boolean value) {
            addCriterion("coin_type =", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeNotEqualTo(Boolean value) {
            addCriterion("coin_type <>", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeGreaterThan(Boolean value) {
            addCriterion("coin_type >", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("coin_type >=", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeLessThan(Boolean value) {
            addCriterion("coin_type <", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("coin_type <=", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeIn(List<Boolean> values) {
            addCriterion("coin_type in", values, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeNotIn(List<Boolean> values) {
            addCriterion("coin_type not in", values, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("coin_type between", value1, value2, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("coin_type not between", value1, value2, "coinType");
            return (Criteria) this;
        }

        public Criteria andEventTitleIsNull() {
            addCriterion("event_title is null");
            return (Criteria) this;
        }

        public Criteria andEventTitleIsNotNull() {
            addCriterion("event_title is not null");
            return (Criteria) this;
        }

        public Criteria andEventTitleEqualTo(String value) {
            addCriterion("event_title =", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotEqualTo(String value) {
            addCriterion("event_title <>", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleGreaterThan(String value) {
            addCriterion("event_title >", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleGreaterThanOrEqualTo(String value) {
            addCriterion("event_title >=", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleLessThan(String value) {
            addCriterion("event_title <", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleLessThanOrEqualTo(String value) {
            addCriterion("event_title <=", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleLike(String value) {
            addCriterion("event_title like", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotLike(String value) {
            addCriterion("event_title not like", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleIn(List<String> values) {
            addCriterion("event_title in", values, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotIn(List<String> values) {
            addCriterion("event_title not in", values, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleBetween(String value1, String value2) {
            addCriterion("event_title between", value1, value2, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotBetween(String value1, String value2) {
            addCriterion("event_title not between", value1, value2, "eventTitle");
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

        public Criteria andOptionDescIsNull() {
            addCriterion("option_desc is null");
            return (Criteria) this;
        }

        public Criteria andOptionDescIsNotNull() {
            addCriterion("option_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOptionDescEqualTo(String value) {
            addCriterion("option_desc =", value, "optionDesc");
            return (Criteria) this;
        }

        public Criteria andOptionDescNotEqualTo(String value) {
            addCriterion("option_desc <>", value, "optionDesc");
            return (Criteria) this;
        }

        public Criteria andOptionDescGreaterThan(String value) {
            addCriterion("option_desc >", value, "optionDesc");
            return (Criteria) this;
        }

        public Criteria andOptionDescGreaterThanOrEqualTo(String value) {
            addCriterion("option_desc >=", value, "optionDesc");
            return (Criteria) this;
        }

        public Criteria andOptionDescLessThan(String value) {
            addCriterion("option_desc <", value, "optionDesc");
            return (Criteria) this;
        }

        public Criteria andOptionDescLessThanOrEqualTo(String value) {
            addCriterion("option_desc <=", value, "optionDesc");
            return (Criteria) this;
        }

        public Criteria andOptionDescLike(String value) {
            addCriterion("option_desc like", value, "optionDesc");
            return (Criteria) this;
        }

        public Criteria andOptionDescNotLike(String value) {
            addCriterion("option_desc not like", value, "optionDesc");
            return (Criteria) this;
        }

        public Criteria andOptionDescIn(List<String> values) {
            addCriterion("option_desc in", values, "optionDesc");
            return (Criteria) this;
        }

        public Criteria andOptionDescNotIn(List<String> values) {
            addCriterion("option_desc not in", values, "optionDesc");
            return (Criteria) this;
        }

        public Criteria andOptionDescBetween(String value1, String value2) {
            addCriterion("option_desc between", value1, value2, "optionDesc");
            return (Criteria) this;
        }

        public Criteria andOptionDescNotBetween(String value1, String value2) {
            addCriterion("option_desc not between", value1, value2, "optionDesc");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andCostLimitIsNull() {
            addCriterion("cost_limit is null");
            return (Criteria) this;
        }

        public Criteria andCostLimitIsNotNull() {
            addCriterion("cost_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCostLimitEqualTo(BigDecimal value) {
            addCriterion("cost_limit =", value, "costLimit");
            return (Criteria) this;
        }

        public Criteria andCostLimitNotEqualTo(BigDecimal value) {
            addCriterion("cost_limit <>", value, "costLimit");
            return (Criteria) this;
        }

        public Criteria andCostLimitGreaterThan(BigDecimal value) {
            addCriterion("cost_limit >", value, "costLimit");
            return (Criteria) this;
        }

        public Criteria andCostLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_limit >=", value, "costLimit");
            return (Criteria) this;
        }

        public Criteria andCostLimitLessThan(BigDecimal value) {
            addCriterion("cost_limit <", value, "costLimit");
            return (Criteria) this;
        }

        public Criteria andCostLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_limit <=", value, "costLimit");
            return (Criteria) this;
        }

        public Criteria andCostLimitIn(List<BigDecimal> values) {
            addCriterion("cost_limit in", values, "costLimit");
            return (Criteria) this;
        }

        public Criteria andCostLimitNotIn(List<BigDecimal> values) {
            addCriterion("cost_limit not in", values, "costLimit");
            return (Criteria) this;
        }

        public Criteria andCostLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_limit between", value1, value2, "costLimit");
            return (Criteria) this;
        }

        public Criteria andCostLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_limit not between", value1, value2, "costLimit");
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