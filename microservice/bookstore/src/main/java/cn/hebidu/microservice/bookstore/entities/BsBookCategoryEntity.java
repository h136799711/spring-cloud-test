package cn.hebidu.microservice.bookstore.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 */
@Entity
@Table(name = "bs_book_category", schema = "bookstore", catalog = "")
public class BsBookCategoryEntity implements Serializable {


    private static final long serialVersionUID = -286344104860138091L;

    private long id;
    private String cateName;
    private long createTime;
    private long updateTime;
    private byte type;
    private int sort;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cate_name")
    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
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

    @Basic
    @Column(name = "type")
    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    @Basic
    @Column(name = "sort")
    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BsBookCategoryEntity that = (BsBookCategoryEntity) o;

        if (id != that.id) return false;
        if (createTime != that.createTime) return false;
        if (updateTime != that.updateTime) return false;
        if (type != that.type) return false;
        if (sort != that.sort) return false;
        if (cateName != null ? !cateName.equals(that.cateName) : that.cateName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (cateName != null ? cateName.hashCode() : 0);
        result = 31 * result + (int) (createTime ^ (createTime >>> 32));
        result = 31 * result + (int) (updateTime ^ (updateTime >>> 32));
        result = 31 * result + (int) type;
        result = 31 * result + sort;
        return result;
    }

    @Override
    public String toString() {
        return "BsBookCategoryEntity{" +
                "id=" + id +
                ", cateName='" + cateName + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", type=" + type +
                ", sort=" + sort +
                '}';
    }
}
