package cn.hebidu.microservice.bookstore.controller;

import cn.hebidu.microservice.bookstore.document.BsBookstoreCategory;
import cn.hebidu.microservice.bookstore.repo.BsBookCategoryRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Publisher;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/bookstore/")
public class BsBookCategoryController {

    private final BsBookCategoryRepository bookCategoryRepository;

    @GetMapping("/category")
    public Flux<BsBookstoreCategory> list() {
        return this.bookCategoryRepository.findAll();
    }


    @GetMapping("/category/info_contains/")
    public Flux<BsBookstoreCategory> infoByContains(@RequestParam String cateName) {
        return bookCategoryRepository.findBsBookstoreCategoriesByCateNameContains(cateName);
    }

    @GetMapping("/category/info")
    public Flux<BsBookstoreCategory> info(@RequestParam String cateName) {
        return bookCategoryRepository.findBsBookstoreCategoriesByCateNameContaining(cateName);
    }

    @PostMapping("/category/add")
    public Mono<BsBookstoreCategory> add(@RequestBody Publisher<BsBookstoreCategory> bookstoreCategoryPublisher) {
        return bookCategoryRepository.insert(bookstoreCategoryPublisher).single();
    }

    @GetMapping("/category/delete")
    public Mono<Void> del(@RequestParam String id)
    {
        return bookCategoryRepository.deleteById(id);
    }
}
