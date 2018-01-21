package org.delphy.timetask.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class DelphyTransaction implements Serializable {
    private Long id;

    private Long marketId;

    private Long userId;

    private Long optionId;

    private Integer amount;

    private BigDecimal cost;

    private Boolean transType;

    private String merkleRoot;

    private Integer merkleOrder;

    private Boolean status;

    private Long createTime;

    private Long updateTime;

    private String withdrawAddress;

    private Boolean coinType;

    private String eventTitle;

    private String txHash;

    private String optionDesc;

    private String reason;

    private BigDecimal costLimit;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMarketId() {
        return marketId;
    }

    public void setMarketId(Long marketId) {
        this.marketId = marketId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Boolean getTransType() {
        return transType;
    }

    public void setTransType(Boolean transType) {
        this.transType = transType;
    }

    public String getMerkleRoot() {
        return merkleRoot;
    }

    public void setMerkleRoot(String merkleRoot) {
        this.merkleRoot = merkleRoot == null ? null : merkleRoot.trim();
    }

    public Integer getMerkleOrder() {
        return merkleOrder;
    }

    public void setMerkleOrder(Integer merkleOrder) {
        this.merkleOrder = merkleOrder;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getWithdrawAddress() {
        return withdrawAddress;
    }

    public void setWithdrawAddress(String withdrawAddress) {
        this.withdrawAddress = withdrawAddress == null ? null : withdrawAddress.trim();
    }

    public Boolean getCoinType() {
        return coinType;
    }

    public void setCoinType(Boolean coinType) {
        this.coinType = coinType;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle == null ? null : eventTitle.trim();
    }

    public String getTxHash() {
        return txHash;
    }

    public void setTxHash(String txHash) {
        this.txHash = txHash == null ? null : txHash.trim();
    }

    public String getOptionDesc() {
        return optionDesc;
    }

    public void setOptionDesc(String optionDesc) {
        this.optionDesc = optionDesc == null ? null : optionDesc.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public BigDecimal getCostLimit() {
        return costLimit;
    }

    public void setCostLimit(BigDecimal costLimit) {
        this.costLimit = costLimit;
    }
}