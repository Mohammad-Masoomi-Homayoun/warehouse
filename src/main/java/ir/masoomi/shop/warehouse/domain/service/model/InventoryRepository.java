package ir.masoomi.shop.warehouse.domain.service.model;

import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends ReactiveSortingRepository<Article, Long> {

}
