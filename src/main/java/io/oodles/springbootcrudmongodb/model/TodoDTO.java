package io.oodles.springbootcrudmongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "todos")
public class TodoDTO {

    @Id
    private String id;

    private String todo;

    private String description;

    private Boolean completed;

    private Date createdAt;

    private Date updatedAt;
}
