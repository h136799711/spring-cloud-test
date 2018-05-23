package cn.hebidu.microservice.bookstore.repo;

import cn.hebidu.microservice.bookstore.document.BsBookstoreCategory;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;


@Primary
@Repository
public interface BsBookCategoryRepository extends ReactiveMongoRepository<BsBookstoreCategory, String>{

    Flux<BsBookstoreCategory> findBy(Pageable pageable);
}
