package org.lms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Book {
    @NonNull
    private int bookId;
    private String title;
    private List<String> authors;
    private List<String> publishers;
    private List<String> bookCopies;
}
