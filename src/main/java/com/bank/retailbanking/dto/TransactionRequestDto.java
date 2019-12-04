package com.bank.retailbanking.dto;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class TransactionRequestDto {
	private Integer accountId;
	private Integer month;
	private Integer year;
}
