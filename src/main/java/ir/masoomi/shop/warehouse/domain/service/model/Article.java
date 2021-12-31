package ir.masoomi.shop.warehouse.domain.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(staticName = "of")
public class Article {

    private String name;
    private Integer count;
}
