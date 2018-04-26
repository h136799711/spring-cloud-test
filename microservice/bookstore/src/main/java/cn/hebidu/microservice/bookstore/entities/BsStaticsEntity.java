package cn.hebidu.microservice.bookstore.entities;

import javax.persistence.*;

@Entity
@Table(name = "bs_statics", schema = "bookstore", catalog = "")
public class BsStaticsEntity {
    private long id;
    private String stKey;
    private long stValue;
    private long createTime;
    private long updateTime;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "st_key")
    public String getStKey() {
        return stKey;
    }

    public void setStKey(String stKey) {
        this.stKey = stKey;
    }

    @Basic
    @Column(name = "st_value")
    public long getStValue() {
        return stValue;
    }

    public void setStValue(long stValue) {
        this.stValue = stValue;
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
    @Column(name = "update_time")
    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BsStaticsEntity that = (BsStaticsEntity) o;

        if (id != that.id) return false;
        if (stValue != that.stValue) return false;
        if (createTime != that.createTime) return false;
        if (updateTime != that.updateTime) return false;
        if (stKey != null ? !stKey.equals(that.stKey) : that.stKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (stKey != null ? stKey.hashCode() : 0);
        result = 31 * result + (int) (stValue ^ (stValue >>> 32));
        result = 31 * result + (int) (createTime ^ (createTime >>> 32));
        result = 31 * result + (int) (updateTime ^ (updateTime >>> 32));
        return result;
    }
}
