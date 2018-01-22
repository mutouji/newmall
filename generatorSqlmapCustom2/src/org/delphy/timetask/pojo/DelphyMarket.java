package org.delphy.timetask.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class DelphyMarket implements Serializable {
    private Long id;

    private Long eventId;

    private Long endTime;

    private Long beginTime;

    private String oracleId;

    private Boolean status;

    private BigDecimal deposit;

    private BigDecimal lossLimit;

    private Long rightOption;

    private Long clearTime;

    private String resultUrl;

    private Integer numInvestor;

    private Long createTime;

    private Long updateTime;

    private Integer creatorId;

    private String description;

    private String title;

    private String image;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public String getOracleId() {
        return oracleId;
    }

    public void setOracleId(String oracleId) {
        this.oracleId = oracleId == null ? null : oracleId.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public BigDecimal getLossLimit() {
        return lossLimit;
    }

    public void setLossLimit(BigDecimal lossLimit) {
        this.lossLimit = lossLimit;
    }

    public Long getRightOption() {
        return rightOption;
    }

    public void setRightOption(Long rightOption) {
        this.rightOption = rightOption;
    }

    public Long getClearTime() {
        return clearTime;
    }

    public void setClearTime(Long clearTime) {
        this.clearTime = clearTime;
    }

    public String getResultUrl() {
        return resultUrl;
    }

    public void setResultUrl(String resultUrl) {
        this.resultUrl = resultUrl == null ? null : resultUrl.trim();
    }

    public Integer getNumInvestor() {
        return numInvestor;
    }

    public void setNumInvestor(Integer numInvestor) {
        this.numInvestor = numInvestor;
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

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }
}