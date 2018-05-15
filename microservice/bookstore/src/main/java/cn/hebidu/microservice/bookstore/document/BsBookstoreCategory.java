package cn.hebidu.microservice.bookstore.document;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@RequiredArgsConstructor
public class BsBookstoreCategory {
    private final String cateName;
    private final int sort;
    private @Id String id;
}
