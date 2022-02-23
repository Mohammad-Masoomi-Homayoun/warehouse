package ir.masoomi.shop.warehouse.domain.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class Article {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    private int count;
    private int price;

    @Override
    public String toString() {
        return "ID: " + this.id + ", Name: " + this.name + ", Count: " + this.count + ", Price: " + this.price;
    }
}
