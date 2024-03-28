package org.example.lombook;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Araba {
    private String marka;
    private String vites;
    private int model;
    private int kilometre;
}

