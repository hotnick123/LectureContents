package com.example.jswithspring.service.hybrid;

import com.example.jswithspring.controller.hybrid.request.RequestHybridOrder;
import com.example.jswithspring.entity.hybrid.HybridOrder;
import com.example.jswithspring.repository.hybrid.HybridOrderRepository;
import com.example.jswithspring.utility.python.PythonRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HybridOrderServiceImpl implements HybridOrderService {

    @Autowired
    HybridOrderRepository repository;

    @Override
    public Boolean registerOrder(RequestHybridOrder order) throws Exception {

        HybridOrder hybridOrder = new HybridOrder(order.getName(), order.getCost());
        repository.save(hybridOrder);

        return true;
    }

    @Override
    public String notice(RequestHybridOrder order) throws Exception {
        // Python으로 REST 요청을 수행해야함
        PythonRequestUtil pru = new PythonRequestUtil();

        // REST 쏘고 성공 여부를 받아오도록 한다.
        return pru.orderTest(order);
    }
}