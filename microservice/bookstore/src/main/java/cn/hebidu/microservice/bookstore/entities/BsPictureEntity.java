package cn.hebidu.microservice.bookstore.entities;

import javax.persistence.*;

@Entity
@Table(name = "bs_picture", schema = "bookstore", catalog = "")
public class BsPictureEntity {
    private int id;
    private String primaryFileUri;
    private String oriName;
    private String saveName;
    private int size;
    private String url;
    private String md5;
    private String sha1;
    private byte status;
    private long createTime;
    private long updateTime;
    private String type;
    private String ext;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "primary_file_uri")
    public String getPrimaryFileUri() {
        return primaryFileUri;
    }

    public void setPrimaryFileUri(String primaryFileUri) {
        this.primaryFileUri = primaryFileUri;
    }

    @Basic
    @Column(name = "ori_name")
    public String getOriName() {
        return oriName;
    }

    public void setOriName(String oriName) {
        this.oriName = oriName;
    }

    @Basic
    @Column(name = "save_name")
    public String getSaveName() {
        return saveName;
    }

    public void setSaveName(String saveName) {
        this.saveName = saveName;
    }

    @Basic
    @Column(name = "size")
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
    @Column(name = "md5")
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    @Basic
    @Column(name = "sha1")
    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
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
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "ext")
    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BsPictureEntity that = (BsPictureEntity) o;

        if (id != that.id) return false;
        if (size != that.size) return false;
        if (status != that.status) return false;
        if (createTime != that.createTime) return false;
        if (updateTime != that.updateTime) return false;
        if (primaryFileUri != null ? !primaryFileUri.equals(that.primaryFileUri) : that.primaryFileUri != null)
            return false;
        if (oriName != null ? !oriName.equals(that.oriName) : that.oriName != null) return false;
        if (saveName != null ? !saveName.equals(that.saveName) : that.saveName != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (md5 != null ? !md5.equals(that.md5) : that.md5 != null) return false;
        if (sha1 != null ? !sha1.equals(that.sha1) : that.sha1 != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (ext != null ? !ext.equals(that.ext) : that.ext != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (primaryFileUri != null ? primaryFileUri.hashCode() : 0);
        result = 31 * result + (oriName != null ? oriName.hashCode() : 0);
        result = 31 * result + (saveName != null ? saveName.hashCode() : 0);
        result = 31 * result + size;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (md5 != null ? md5.hashCode() : 0);
        result = 31 * result + (sha1 != null ? sha1.hashCode() : 0);
        result = 31 * result + (int) status;
        result = 31 * result + (int) (createTime ^ (createTime >>> 32));
        result = 31 * result + (int) (updateTime ^ (updateTime >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (ext != null ? ext.hashCode() : 0);
        return result;
    }
}
