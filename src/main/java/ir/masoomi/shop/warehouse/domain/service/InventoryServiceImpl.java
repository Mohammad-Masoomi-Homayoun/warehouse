package ir.masoomi.shop.warehouse.domain.service;

import ir.masoomi.shop.warehouse.domain.service.model.Article;
import ir.masoomi.shop.warehouse.domain.service.model.InventoryRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {

  private final InventoryRepository inventoryRepository;

  @Override
  public List<Article> getArticles() {

    return inventoryRepository.findAll();
  }

}
