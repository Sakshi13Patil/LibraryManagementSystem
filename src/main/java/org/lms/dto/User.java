package org.lms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.validation.constraints.Max;

@AllArgsConstructor
@Getter
@Setter
public class User {
    @NonNull
    private int userId;
    private String name;
    @Max(5)
    private int booksBorrowed;
}
