package cn.hebidu.microservice.bookstore.api;

import cn.hebidu.microservice.bookstore.entities.BsBookCategoryEntity;
import cn.hebidu.microservice.bookstore.repo.BsBookCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookstore/category")
public class BsBookCategoryApi {

    @Autowired
    BsBookCategoryRepository bookCategoryRepository;

    @RequestMapping(value = "/info", method = {RequestMethod.GET, RequestMethod.POST})
    public BsBookCategoryEntity info(@RequestParam Long id) {
        return bookCategoryRepository.getOne(id.intValue());
    }
}
