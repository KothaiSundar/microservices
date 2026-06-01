package com.eazybytes.accounts.service.client;

import com.eazybytes.accounts.dto.LoansDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class LoansFallback implements LoansFeignClient{

  
	@Override
	public ResponseEntity<LoansDto> fetchLoanDetails(String mobileNumber) {
	
	    return null;
	}
}

//fallback able to send null if loans not work
//others 2 can work
// without fall back if loans not work ,all acc,cards will also not work