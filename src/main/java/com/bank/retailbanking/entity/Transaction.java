package com.bank.retailbanking.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transaction")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer transactionId;
	private String transactionType;
	private Double transactionAmount;
	private String transactionDescription;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "from_account_number")
	private Account fromAccount;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "to_account_number")
	private Account toAccount;
	private LocalDate transactionDate;
}
