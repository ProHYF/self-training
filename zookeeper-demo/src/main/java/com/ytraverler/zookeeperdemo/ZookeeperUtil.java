package com.ytraverler.zookeeperdemo;

import org.apache.zookeeper.*;

import java.io.IOException;

public class ZookeeperUtil {

    static Watcher watcher=new Watcher() {
        @Override
        public void process(WatchedEvent watchedEvent) {
            System.out.println("测试监听事件");
        }
    };
    public static void getZookeeper() throws IOException, KeeperException, InterruptedException {
        ZooKeeper zooKeeper = new ZooKeeper("192.168.200.11:2181,192.168.200.12:2181,192.168.200.13:2181",
                1, watcher);
        System.out.println("测试创建节点");
        zooKeeper.create("/abc","abd".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.EPHEMERAL);


    }
}
