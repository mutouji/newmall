package org.delphy.timetask.pojo;

import java.io.Serializable;

public class DelphyMerkle implements Serializable {
    private String rootHash;

    private String txHash;

    private String receipts;

    private String txs;

    private Integer txCount;

    private Long createTime;

    private Long updateTime;

    private Boolean status;

    private static final long serialVersionUID = 1L;

    public String getRootHash() {
        return rootHash;
    }

    public void setRootHash(String rootHash) {
        this.rootHash = rootHash == null ? null : rootHash.trim();
    }

    public String getTxHash() {
        return txHash;
    }

    public void setTxHash(String txHash) {
        this.txHash = txHash == null ? null : txHash.trim();
    }

    public String getReceipts() {
        return receipts;
    }

    public void setReceipts(String receipts) {
        this.receipts = receipts == null ? null : receipts.trim();
    }

    public String getTxs() {
        return txs;
    }

    public void setTxs(String txs) {
        this.txs = txs == null ? null : txs.trim();
    }

    public Integer getTxCount() {
        return txCount;
    }

    public void setTxCount(Integer txCount) {
        this.txCount = txCount;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}