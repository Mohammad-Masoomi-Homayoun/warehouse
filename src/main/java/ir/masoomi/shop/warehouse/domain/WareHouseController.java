package ir.masoomi.shop.warehouse.domain;


import ir.masoomi.shop.warehouse.domain.service.model.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class WareHouseController {

    @GetMapping("/inventory")
    public Flux<Article> getList() {

        return Flux.just(Article.of("Chair", 4), Article.of("Table", 5));
    }
}
