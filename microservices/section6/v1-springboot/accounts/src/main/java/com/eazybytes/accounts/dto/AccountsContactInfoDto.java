package com.eazybytes.accounts.dto;


import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//this dto class is use for data carriers between microservices
//instead of writing all getters method pass the all data in constructor
//that are going to be final data in fields you can simply use record class
//define the fields in the brackets with same name as property name

//now java is going to make this fields as final
//same time is going to generate getter methods and constructor
//there wont be an setter method
//in record class you can initialize  data at once and whatever you provided data
//time of constructor is going to  be final
//so at runtime the values that these fields are getting cant be changed

//Now to map all the fields with the property names using annotation @ConfugirationProperties


//Now during startup spring boot will read my all properties from application.yml
//and we can use this pojo class inside my business logic
@ConfigurationProperties(prefix = "accounts")
public record AccountsContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {

}
