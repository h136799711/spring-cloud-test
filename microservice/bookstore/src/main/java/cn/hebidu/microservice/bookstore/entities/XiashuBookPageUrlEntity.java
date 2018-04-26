package cn.hebidu.microservice.bookstore.entities;

import javax.persistence.*;

@Entity
@Table(name = "xiashu_book_page_url", schema = "bookstore", catalog = "")
public class XiashuBookPageUrlEntity {
    private long id;
    private int priority;
    private byte isSpiderOver;
    private long bookId;
    private long spiderActiveTime;
    private long updateTime;
    private String source;
    private int sourceType;
    private String url;
    private long createTime;
    private String spiderInfo;
    private byte spiderStatus;
    private String spiderId;
    private int failCnt;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "priority")
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Basic
    @Column(name = "is_spider_over")
    public byte getIsSpiderOver() {
        return isSpiderOver;
    }

    public void setIsSpiderOver(byte isSpiderOver) {
        this.isSpiderOver = isSpiderOver;
    }

    @Basic
    @Column(name = "book_id")
    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "spider_active_time")
    public long getSpiderActiveTime() {
        return spiderActiveTime;
    }

    public void setSpiderActiveTime(long spiderActiveTime) {
        this.spiderActiveTime = spiderActiveTime;
    }

    @Basic
    @Column(name = "update_time")
    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "source_type")
    public int getSourceType() {
        return sourceType;
    }

    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "create_time")
    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "spider_info")
    public String getSpiderInfo() {
        return spiderInfo;
    }

    public void setSpiderInfo(String spiderInfo) {
        this.spiderInfo = spiderInfo;
    }

    @Basic
    @Column(name = "spider_status")
    public byte getSpiderStatus() {
        return spiderStatus;
    }

    public void setSpiderStatus(byte spiderStatus) {
        this.spiderStatus = spiderStatus;
    }

    @Basic
    @Column(name = "spider_id")
    public String getSpiderId() {
        return spiderId;
    }

    public void setSpiderId(String spiderId) {
        this.spiderId = spiderId;
    }

    @Basic
    @Column(name = "fail_cnt")
    public int getFailCnt() {
        return failCnt;
    }

    public void setFailCnt(int failCnt) {
        this.failCnt = failCnt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XiashuBookPageUrlEntity that = (XiashuBookPageUrlEntity) o;

        if (id != that.id) return false;
        if (priority != that.priority) return false;
        if (isSpiderOver != that.isSpiderOver) return false;
        if (bookId != that.bookId) return false;
        if (spiderActiveTime != that.spiderActiveTime) return false;
        if (updateTime != that.updateTime) return false;
        if (sourceType != that.sourceType) return false;
        if (createTime != that.createTime) return false;
        if (spiderStatus != that.spiderStatus) return false;
        if (failCnt != that.failCnt) return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (spiderInfo != null ? !spiderInfo.equals(that.spiderInfo) : that.spiderInfo != null) return false;
        if (spiderId != null ? !spiderId.equals(that.spiderId) : that.spiderId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + priority;
        result = 31 * result + (int) isSpiderOver;
        result = 31 * result + (int) (bookId ^ (bookId >>> 32));
        result = 31 * result + (int) (spiderActiveTime ^ (spiderActiveTime >>> 32));
        result = 31 * result + (int) (updateTime ^ (updateTime >>> 32));
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + sourceType;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (int) (createTime ^ (createTime >>> 32));
        result = 31 * result + (spiderInfo != null ? spiderInfo.hashCode() : 0);
        result = 31 * result + (int) spiderStatus;
        result = 31 * result + (spiderId != null ? spiderId.hashCode() : 0);
        result = 31 * result + failCnt;
        return result;
    }
}
