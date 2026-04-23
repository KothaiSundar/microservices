package com.eazybytes.accounts.dto;


import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;


//what ever we send the valuse it will be same throughout
@ConfigurationProperties(prefix = "accounts")
public record AccountsContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {

}