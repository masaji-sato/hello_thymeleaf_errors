package com.example.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class C {

    @Size(min = 4)
    @Pattern(regexp = "abcd")
    private String value = "c";

    public C() {
        System.out.println("c");
    }

    public String getValue() {
        return value;
    }
}
