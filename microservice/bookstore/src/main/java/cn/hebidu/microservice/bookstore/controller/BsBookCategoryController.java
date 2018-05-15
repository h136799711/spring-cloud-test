package cn.hebidu.microservice.bookstore.controller;

import cn.hebidu.microservice.bookstore.document.BsBookstoreCategory;
import cn.hebidu.microservice.bookstore.repo.BsBookCategoryRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/bookstore/category")
public class BsBookCategoryController {

    private static Logger log = LoggerFactory.getLogger(BsBookCategoryController.class);

    private final BsBookCategoryRepository bookCategoryRepository;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    public BsBookCategoryController(BsBookCategoryRepository bookCategoryRepository) {
        this.bookCategoryRepository = bookCategoryRepository;
    }

    @RequestMapping(value = "/info", method = {RequestMethod.GET, RequestMethod.POST})
    public Mono<BsBookstoreCategory> info(@RequestParam Mono<String> id) throws JsonProcessingException {
        log.error("id = " + id);
        Mono<BsBookstoreCategory> entity = bookCategoryRepository.findById(id);
        log.error("entity = " + entity.toString());
        log.error("entity json" + objectMapper.writeValueAsString(entity));
        return entity;
    }
}
