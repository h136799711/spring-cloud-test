package cn.hebidu.microservice.bookstore.entities;

import javax.persistence.*;

@Entity
@Table(name = "bs_book_source", schema = "bookstore", catalog = "")
public class BsBookSourceEntity {
    private long id;
    private long bookId;
    private String bookAddress;
    private String bookSourceAddress;
    private String bookSourceName;
    private long createTime;
    private long updateTime;
    private long sourceBookId;
    private int bookSourceType;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "book_address")
    public String getBookAddress() {
        return bookAddress;
    }

    public void setBookAddress(String bookAddress) {
        this.bookAddress = bookAddress;
    }

    @Basic
    @Column(name = "book_source_address")
    public String getBookSourceAddress() {
        return bookSourceAddress;
    }

    public void setBookSourceAddress(String bookSourceAddress) {
        this.bookSourceAddress = bookSourceAddress;
    }

    @Basic
    @Column(name = "book_source_name")
    public String getBookSourceName() {
        return bookSourceName;
    }

    public void setBookSourceName(String bookSourceName) {
        this.bookSourceName = bookSourceName;
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
    @Column(name = "source_book_id")
    public long getSourceBookId() {
        return sourceBookId;
    }

    public void setSourceBookId(long sourceBookId) {
        this.sourceBookId = sourceBookId;
    }

    @Basic
    @Column(name = "book_source_type")
    public int getBookSourceType() {
        return bookSourceType;
    }

    public void setBookSourceType(int bookSourceType) {
        this.bookSourceType = bookSourceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BsBookSourceEntity that = (BsBookSourceEntity) o;

        if (id != that.id) return false;
        if (bookId != that.bookId) return false;
        if (createTime != that.createTime) return false;
        if (updateTime != that.updateTime) return false;
        if (sourceBookId != that.sourceBookId) return false;
        if (bookSourceType != that.bookSourceType) return false;
        if (bookAddress != null ? !bookAddress.equals(that.bookAddress) : that.bookAddress != null) return false;
        if (bookSourceAddress != null ? !bookSourceAddress.equals(that.bookSourceAddress) : that.bookSourceAddress != null)
            return false;
        if (bookSourceName != null ? !bookSourceName.equals(that.bookSourceName) : that.bookSourceName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (bookId ^ (bookId >>> 32));
        result = 31 * result + (bookAddress != null ? bookAddress.hashCode() : 0);
        result = 31 * result + (bookSourceAddress != null ? bookSourceAddress.hashCode() : 0);
        result = 31 * result + (bookSourceName != null ? bookSourceName.hashCode() : 0);
        result = 31 * result + (int) (createTime ^ (createTime >>> 32));
        result = 31 * result + (int) (updateTime ^ (updateTime >>> 32));
        result = 31 * result + (int) (sourceBookId ^ (sourceBookId >>> 32));
        result = 31 * result + bookSourceType;
        return result;
    }
}
