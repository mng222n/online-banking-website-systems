package com.userFront.controller;

import com.userFront.domain.User;
import com.userFront.service.TransactionService;
import com.userFront.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/transaction-list", method = RequestMethod.GET)
    public String listTransaction(Model model) {
        return null;
    }


    @RequestMapping(value = "/manage-approval-queue", method = RequestMethod.GET)
    public String manageApprovalQueue(Model model) {
        return null;
    }


    @RequestMapping(value = "/manage-approval-history", method = RequestMethod.GET)
    public String manageApprovalHistory(Model model) {
        return null;
    }


    @RequestMapping(value = "/manage-order-queue", method = RequestMethod.GET)
    public String manageOrderQueue(Model model) {
        return null;
    }

}