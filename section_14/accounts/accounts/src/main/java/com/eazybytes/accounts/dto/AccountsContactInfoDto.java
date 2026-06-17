package com.eazybytes.accounts.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "accounts")
@Getter
@Setter
public class AccountsContactInfoDto {

    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;

}

/*Ms read during startup from config server
 * once object of accountDto created during startup we cannot change in record class
 * cannot change prop values at runtime by invoking setter method
 * record class created objects using constructor has fixed values
 * no way to change value inside
 * 
 * so record class changed to normal class
 * will allow Ms to change prop values at runtime
 *  **/
