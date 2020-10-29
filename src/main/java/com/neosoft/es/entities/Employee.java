package com.neosoft.es.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@NoArgsConstructor
@ToString
@Document(collection = "employee")
public class Employee {
    @Id
    private Integer id;
    private String name;
    private String address;
    private String mobNo;
    

}
