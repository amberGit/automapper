package com.toad.sample.mybatis.automapper.controller;


import com.toad.sample.mybatis.automapper.entity.BankCard;
import com.toad.sample.mybatis.automapper.service.BankCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bankcard")
public class BankCardController {
    @Autowired
    private BankCardService service;

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public List<BankCard> getPage(int pageNum, int pageSize) {
        return service.selectPage(pageNum, pageSize);
    }
}
