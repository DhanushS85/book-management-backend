package Valoriz.BookManagement.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    private String id; // B-001, B-002

    @NotBlank
    @Size(max = 100)
    private String title;

    @NotBlank
    @Size(max = 50)
    private String author;

    @NotNull
    private LocalDate publicationDate;

    @NotBlank
    @Pattern(regexp = "\\d{13}")
    private String isbn;

    @NotBlank
    private String genre;

    @NotNull
    @Min(1)
    @Max(5)
    private Integer rating;
    
    private String imgUrl;
    
}

