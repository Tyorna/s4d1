package com.example.demo.secondo.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;
import lombok.Setter;

@Setter
@PropertySource("classpath:application.properties")
@Getter
public class Ordine {
@Value("${application.coperto}")
private int coperto;
private int nOrdine;
private int nCoperti;
private String orario;
}
