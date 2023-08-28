package com.lumorais.hrpayroll.services;

import com.lumorais.hrpayroll.entities.Payment;
import com.lumorais.hrpayroll.entities.Worker;
import com.lumorais.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days) {


        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(Objects.requireNonNull(worker).getName(), worker.getDailyIncome(), days);
    }
}
