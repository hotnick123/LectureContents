package com.example.demo.service;

import com.example.demo.entity.Monster;
import com.example.demo.entity.Reportcard;
import com.example.demo.repository.VueMonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueReportcardServiceImpl implements VueReportcardService {

    @Autowired
    private VueReportcardRepository repository;

    @Override
    public void register(Reportcard reportcard) throws Exception {
        repository.create(monster);
    }

    @Override
    public List<Reportcard> list() throws Exception {
        return repository.list();
    }

    @Override
    public Reportcard read(Integer reportcardNo) throws Exception {
        return repository.read(reportcardNo);
    }

    @Override
    public void remove(Integer reportcardNo) throws Exception {
        repository.delete(reportcardNo);
    }

    @Override
    public void modify(Reportcard reportcard) throws Exception {
        repository.update(reportcard);
    }
}