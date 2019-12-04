package com.bank.retailbanking.dto;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.bank.retailbanking.entity.Account;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TransactionResponseDto {

	private String transactionType;
	private Double transactionAmount;
	private String transactionDescription;
	private Long fromAccount;
	private Long toAccount;
	private LocalDate transactionDate;

}
