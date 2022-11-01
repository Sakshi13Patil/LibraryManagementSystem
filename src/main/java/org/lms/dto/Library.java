package org.lms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Library {
    private String id;
    private List<List<Integer>> racks;

    public Library(String id, Integer rackCount) {
        this.id = id;
        this.racks = new ArrayList<List<Integer>>(rackCount);
    }
}
