package com.reotra.demobatch.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j(topic = "")
public class Scheduler {

    @Autowired
    private BatchLauncher batchLauncher;

    @Scheduled(fixedDelay = 8000)
    public void perform() throws Exception {
        log.info("Batch programmé pour tourner toutes les 8 secondes");
        batchLauncher.run();
    }
}

