package com.userFront.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import java.util.Date;

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String status;
    private String approvalStatus;
    private String city;
    private String state;
    private String merchant;
    private String purchaseId;
    private String accountingCode;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
