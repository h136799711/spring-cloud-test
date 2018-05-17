package cn.hebidu.microservice.bookstore;

import cn.hebidu.microservice.bookstore.document.BsBookstoreCategory;
import cn.hebidu.microservice.bookstore.repo.BsBookCategoryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Flux;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BookstoreApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookstoreApplicationTests {

    @Autowired
    BsBookCategoryRepository bookCategoryRepository;

    private final static Logger logger = LoggerFactory.getLogger(BookstoreApplicationTests.class);

    @Test
    public void contextLoads() {
        String id = "";
        Flux<BsBookstoreCategory> list = bookCategoryRepository.findAll();

        list.log()
                .map(entity -> {
            System.out.println(entity.getCateName());
            return entity;
        });
//        logger.error(bsBookCatego);
    }

}
