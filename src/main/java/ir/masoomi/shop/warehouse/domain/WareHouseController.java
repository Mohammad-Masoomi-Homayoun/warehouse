package ir.masoomi.shop.warehouse.domain;


import ir.masoomi.shop.warehouse.domain.service.model.Article;
import ir.masoomi.shop.warehouse.domain.service.InventoryService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
