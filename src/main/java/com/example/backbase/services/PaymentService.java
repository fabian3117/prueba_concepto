package com.example.backbase.services;

import com.example.backbase.enums.PaymentResponseType;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PaymentService {
    public PaymentResponseType processPayment(@NonNull Long id ,@NonNull Long plan_id){
        return PaymentResponseType.OK;
    }
}
