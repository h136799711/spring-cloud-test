package cn.hebidu.microservice.bookstore.repo;

import cn.hebidu.microservice.bookstore.entities.BsBookCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BsBookCategoryRepository extends JpaRepository<BsBookCategoryEntity, Long> {

}
