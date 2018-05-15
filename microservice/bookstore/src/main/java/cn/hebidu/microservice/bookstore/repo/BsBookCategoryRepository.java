package cn.hebidu.microservice.bookstore.repo;


import cn.hebidu.microservice.bookstore.document.BsBookstoreCategory;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BsBookCategoryRepository extends ReactiveCrudRepository<BsBookstoreCategory, String> {

}
