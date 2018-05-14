package cn.hebidu.microservice.bookstore.controller;

import cn.hebidu.microservice.bookstore.entities.BsBookCategoryEntity;
import cn.hebidu.microservice.bookstore.repo.BsBookCategoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bookstore/category")
public class BsBookCategoryController {

    private static Logger log = LoggerFactory.getLogger(BsBookCategoryController.class);

    final
    BsBookCategoryRepository bookCategoryRepository;

    @Autowired
    public BsBookCategoryController(BsBookCategoryRepository bookCategoryRepository) {
        this.bookCategoryRepository = bookCategoryRepository;
    }

    @RequestMapping(value = "/info", method = {RequestMethod.GET, RequestMethod.POST})
    public String info(@RequestParam Long id) {
        log.error("id = " + id);
        BsBookCategoryEntity entity = bookCategoryRepository.getOne(id);
        log.error("entity = " + entity.toString());
        return entity.toString();
    }
}
