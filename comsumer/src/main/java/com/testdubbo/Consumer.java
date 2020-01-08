package com.testdubbo;
import com.alibaba.dubbo.rpc.RpcContext;
import com.testdubbo.service.ServiceApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Consumer {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-consumer.xml");

        context.start();

        while (true){
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();

            // 获取接口
            ServiceApi serviceAPI = (ServiceApi)context.getBean("consumerService");
            String result = serviceAPI.sendMessage(message);
            System.out.println(result);
        }

    }

}
