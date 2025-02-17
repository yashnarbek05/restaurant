package uz.pdp.apprestaurant.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Food {
    @MongoId
    private String id;

    private String name;

    @DBRef(lazy = true)
    private Category category;
}
