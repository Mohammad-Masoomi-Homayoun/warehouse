package ir.masoomi.shop.warehouse.domain.service;

import ir.masoomi.shop.warehouse.domain.service.model.Article;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface InventoryService {

  List<Article> getArticles();

}
