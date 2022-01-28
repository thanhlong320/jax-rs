package com.axonactive.sample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Department {
    private Long id;
    private String name;
    private String location;
}
