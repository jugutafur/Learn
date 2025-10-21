package com.tutorialesvip.tutorialunittest.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Long countryId;
    @Column(name = "iso_code")
    private String isoCode;
    @Column(name = "country_name")
    private String countryName;
    @Column(name = "country_capital")
    private String countryCapital;
    @Column(name = "country_independence_date")
    private String countryIdependenceDate;

}
