package ir.masoomi.shop.warehouse.domain.service.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("ARTICLE")
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class Article {

    private Long id;
    @NotNull
    @NotEmpty
    private String name;
    @Min(0)
    private Integer count;
    @Min(1)
    private Integer price;
}
