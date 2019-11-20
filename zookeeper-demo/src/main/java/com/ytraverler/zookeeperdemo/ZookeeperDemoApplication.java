package com.ytraverler.zookeeperdemo;

import org.apache.zookeeper.KeeperException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

import static com.ytraverler.zookeeperdemo.ZookeeperUtil.getZookeeper;

@SpringBootApplication
public class ZookeeperDemoApplication {

    public static void main(String[] args) throws InterruptedException, IOException, KeeperException {
        SpringApplication.run(ZookeeperDemoApplication.class, args);
        getZookeeper();
    }

}
