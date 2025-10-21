package com.tutorialesvip.tutorialunittest.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryResponse {
    private String countryName;
    private String capitalName;
    private String independenceDate;
    private int yearsOfIndependency;
    private int monthsOfIndependency;
    private int dayssOfIndependency;

}
