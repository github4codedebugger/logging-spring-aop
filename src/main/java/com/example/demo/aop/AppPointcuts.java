package com.example.demo.aop;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppPointcuts {


    @Pointcut("within(@org.springframework.web.bind.annotation.RestController *)")
    public void controllerPointcut(){
        // NO-OP
    }

    @Pointcut("within(@org.springframework.stereotype.Service *)")
    public void servicePointcut(){
        // NO-OP
    }

    @Pointcut("within(@org.springframework.stereotype.Repository *)")
    public void repositoryPointcut(){
        // NO-OP
    }

    @Pointcut("execution(* com.example.demo..*(..))")
    public void appPointcut(){
        // NO-OP
    }


    @Pointcut("appPointcut() && (controllerPointcut() || servicePointcut() || repositoryPointcut())")
    public void mainPointcut(){
        // NO-OP
    }
}
