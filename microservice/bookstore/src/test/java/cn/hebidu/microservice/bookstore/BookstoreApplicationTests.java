package cn.hebidu.microservice.bookstore;

import cn.hebidu.microservice.bookstore.entities.BsBookCategoryEntity;
import cn.hebidu.microservice.bookstore.repo.BsBookCategoryRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BookstoreApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookstoreApplicationTests {

    @Autowired
    BsBookCategoryRepository bookCategoryRepository;

    @Test
    public void contextLoads() {
        Long id = 1L;
        BsBookCategoryEntity bsBookCategoryEntity = bookCategoryRepository.getOne(id.intValue());
        Assert.assertNotNull(bsBookCategoryEntity);
        Long trueId = bsBookCategoryEntity.getId();
        Assert.assertEquals(id, trueId);
    }

}
