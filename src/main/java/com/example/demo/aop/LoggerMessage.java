package com.example.demo.aop;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoggerMessage {

    private String className;
    private String methodName;
    private String methodArgs;
    private Long elapsedTimeInMillis;
    private Long elapsedTimeInMicros;
    private Object result;


    @SneakyThrows
    @Override
    public String toString() {
        return "{" +
                "className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                ", methodArgs='" + methodArgs + '\'' +
                ", elapsedTimeInMillis=" + elapsedTimeInMillis +
                ", elapsedTimeInMicros=" + elapsedTimeInMicros +
                ", result=" + new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(this.result) +
                '}';
    }
}
