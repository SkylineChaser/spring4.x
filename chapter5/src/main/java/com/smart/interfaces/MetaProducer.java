package com.smart.interfaces;

import org.springframework.stereotype.Service;

/**
 * @author luobiao
 * @date 2018-01-12
 */

public class MetaProducer implements StrongProducer {
    @Override
    public void send() {
        System.out.println("meta producer send");
    }

    @Override
    public void strongProducer() {
        System.out.println("meta producer strongProducer");
    }
}
