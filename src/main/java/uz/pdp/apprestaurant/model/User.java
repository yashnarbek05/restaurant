package uz.pdp.apprestaurant.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class User {
    @MongoId
    private String id;
}
