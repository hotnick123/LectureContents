package com.example.demo.service;

import com.example.demo.entity.Monster;
import com.example.demo.entity.Reportcard;

import java.util.List;

public interface VueReportcardService {
    public void register(Reportcard reportcard) throws Exception;

    public List<Reportcard> list() throws Exception;

    public Reportcard read(Integer reportcardNo) throws Exception;

    public void remove(Integer reportcardNo) throws Exception;

    public void modify(Reportcard reportcard) throws Exception;
}