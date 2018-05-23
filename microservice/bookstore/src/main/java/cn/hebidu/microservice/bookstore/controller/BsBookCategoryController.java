package cn.hebidu.microservice.bookstore.controller;

import cn.hebidu.microservice.bookstore.document.BsBookstoreCategory;
import cn.hebidu.microservice.bookstore.repo.BsBookCategoryRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Publisher;
import org.springframework.data.domain.*;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/bookstore/")
public class BsBookCategoryController {

    private final BsBookCategoryRepository bsBookCategoryRepository;


    @GetMapping("/category")
    public Flux<BsBookstoreCategory> list() {
        return this.bsBookCategoryRepository.findAll();
    }

    @GetMapping("/category/info/")
    public Mono<BsBookstoreCategory> infoByContains(@RequestParam String cateName) {
        BsBookstoreCategory category = new BsBookstoreCategory();
        category.setCateName(cateName);
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("cateName", ExampleMatcher.GenericPropertyMatchers.contains());
        Example<BsBookstoreCategory> example = Example.of(category, matcher);
        return bsBookCategoryRepository.findOne(example);
    }

    @PostMapping("/category/add")
    public Mono<BsBookstoreCategory> add(@RequestBody Publisher<BsBookstoreCategory> bookstoreCategoryPublisher) {
        return bsBookCategoryRepository.insert(bookstoreCategoryPublisher).single();
    }

    @GetMapping("/category/delete")
    public Mono<Void> del(@RequestParam String id)
    {
        return bsBookCategoryRepository.deleteById(id);
    }


    @GetMapping("/category/get_list")
    public Flux<BsBookstoreCategory> getList(@RequestParam(required = false) String cateName,@PageableDefault(value = 15, sort = { "id" }, direction = Sort.Direction.DESC)
            Pageable pageable)
    {

        Sort sort = new Sort(Sort.Direction.DESC, "cate_name");
        PageRequest request = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), sort);
        log.info(request.toString() + " offset = " + request.getOffset() + "page_size = " + request.getPageSize());

//        log.info(bsBookCategoryRepository.query(request).toString());
        return bsBookCategoryRepository.findBy(request);

//        return bsBookCategoryRepository.findAll(request.getSort())
//                .buffer(request.getPageSize(), (int) request.getOffset()).log();
    }

}
