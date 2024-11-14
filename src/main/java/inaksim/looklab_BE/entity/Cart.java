package inaksim.looklab_BE.entity;

import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Document(collection = "cart")
public class Cart {
    private String id;
    private String userId;
    private List<CartItem> items;
}
