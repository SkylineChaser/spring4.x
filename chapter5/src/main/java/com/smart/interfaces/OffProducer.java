package com.smart.interfaces;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author luobiao
 * @date 2018-01-12
 */
@Component("test11")
public class OffProducer implements  StrongProducer {
    @Override
    public void strongProducer() {
        System.out.println("offline strongProducer ");
    }

    @Override
    public void send() {
        System.out.println("offline send ");
    }
}
