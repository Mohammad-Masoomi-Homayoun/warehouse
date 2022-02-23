package ir.masoomi.shop.warehouse.domain;


import ir.masoomi.shop.warehouse.domain.service.model.Article;
import ir.masoomi.shop.warehouse.domain.service.InventoryService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class WareHouseController {

    private final InventoryService inventoryService;

    @GetMapping("/inventory")
    public List<Article> getList() {

        return inventoryService.getArticles();
    }

    @PostMapping("/inventory")
    public Article postArticle(@RequestBody @Validated Article article) {

        return inventoryService.postArticle(article);
    }
}
