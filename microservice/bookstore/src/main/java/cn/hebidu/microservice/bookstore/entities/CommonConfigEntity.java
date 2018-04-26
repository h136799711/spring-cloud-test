package cn.hebidu.microservice.bookstore.entities;

import javax.persistence.*;

@Entity
@Table(name = "common_config", schema = "bookstore", catalog = "")
public class CommonConfigEntity {
    private int id;
    private String name;
    private byte type;
    private String title;
    private byte group;
    private String extra;
    private String remark;
    private int createTime;
    private int updateTime;
    private byte status;
    private String value;
    private short sort;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "group")
    public byte getGroup() {
        return group;
    }

    public void setGroup(byte group) {
        this.group = group;
    }

    @Basic
    @Column(name = "extra")
    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "create_time")
    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
    public int getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(int updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "status")
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Basic
    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "sort")
    public short getSort() {
        return sort;
    }

    public void setSort(short sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommonConfigEntity that = (CommonConfigEntity) o;

        if (id != that.id) return false;
        if (type != that.type) return false;
        if (group != that.group) return false;
        if (createTime != that.createTime) return false;
        if (updateTime != that.updateTime) return false;
        if (status != that.status) return false;
        if (sort != that.sort) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (extra != null ? !extra.equals(that.extra) : that.extra != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) type;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (int) group;
        result = 31 * result + (extra != null ? extra.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + createTime;
        result = 31 * result + updateTime;
        result = 31 * result + (int) status;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (int) sort;
        return result;
    }
}
