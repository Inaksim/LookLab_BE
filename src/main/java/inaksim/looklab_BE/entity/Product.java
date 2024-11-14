package inaksim.looklab_BE.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {

    @Id
    private String id;
    private String name;
    private double price;
    private String description;
    private String coverUrl;
    private String modelUrl;
}
