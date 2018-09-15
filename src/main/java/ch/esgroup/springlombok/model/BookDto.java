package ch.esgroup.springlombok.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    @JsonProperty("bookName")
    private String bookName;
    @JsonProperty("authors")
    private List<String> authors;
    @JsonProperty("description")
    private String description;
}
