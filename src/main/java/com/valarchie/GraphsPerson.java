package com.valarchie;

import javax.validation.constraints.NotNull;

public class GraphsPerson {

    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
