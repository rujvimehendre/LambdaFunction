package org.example;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.List;
import java.util.Map;


/**
 * Hello world!
 *
 */
public class WelcomeLambda implements RequestHandler<Map<String, String> , String>
{

    @Override
    public String handleRequest(Map<String, String> event, Context context) {
        System.out.println("Welcome to my first lambda function");
        System.out.println("Context info: " + context.getFunctionName() + " " +
                context.getFunctionVersion() +  " " + context.getInvokedFunctionArn());
        return "Hello "  + event.get("first_name") + " " + event.get("last_name");
    }
}
