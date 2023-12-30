package uz.pdp.apprestaurant.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Category {
    @MongoId
    private String id;

    private String name;
}
