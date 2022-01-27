//package ir.masoomi.shop.warehouse.domain;
//
//
//import ir.masoomi.shop.warehouse.domain.service.model.Article;
//import ir.masoomi.shop.warehouse.domain.service.InventoryService;
//import java.util.List;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import reactor.core.publisher.Flux;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/api/inventory")
//public class WareHouseController {
//
//    private final InventoryService inventoryService;
//
//    @GetMapping
//    public List<Article> getList() {
//
//        return inventoryService.getArticles();
//    }
//
//    @PostMapping
//    public Article postArticle(@RequestBody @Validated Article article) {
//
//        return inventoryService.postArticle(article);
//    }
//}
