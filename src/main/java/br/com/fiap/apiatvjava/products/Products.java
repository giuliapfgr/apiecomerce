package br.com.fiap.apiatvjava.products;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name="products")
public class Products {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String description;
    String tag;
    String image;
    BigDecimal price;
}
