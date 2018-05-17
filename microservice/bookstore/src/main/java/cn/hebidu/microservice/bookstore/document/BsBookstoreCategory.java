package cn.hebidu.microservice.bookstore.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "bs_bookstore_category")
public class BsBookstoreCategory {

    @NotNull
    private String cateName;
    private int sort;
    private int type;
    private int foreignId;
    @Id
    private String id;
}
