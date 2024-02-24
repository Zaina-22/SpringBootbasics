package com.demo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class alien {
    @Autowired
    Laptop laptop;
    @Autowired
    Cpu cpu;
    public void code(){
//        System.out.println("Coding");
        laptop.compile();
        cpu.process();

    }

}
