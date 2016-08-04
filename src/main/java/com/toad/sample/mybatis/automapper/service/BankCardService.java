package com.toad.sample.mybatis.automapper.service;

import com.github.pagehelper.PageHelper;
import com.toad.sample.mybatis.automapper.entity.BankCard;
import com.toad.sample.mybatis.automapper.util.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankCardService {
    @Autowired
    private BaseMapper<BankCard> mapper;

    public List<BankCard> selectPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return mapper.select(null);
    }
}
