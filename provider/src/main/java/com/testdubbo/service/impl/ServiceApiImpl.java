package  com.testdubbo.service.impl;

import com.testdubbo.service.ServiceApi;

public class ServiceApiImpl implements ServiceApi {

    @Override
    public String sendMessage(String message) {
        System.out.println("message="+message);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "quickstart-provider-message="+message;
    }



}
