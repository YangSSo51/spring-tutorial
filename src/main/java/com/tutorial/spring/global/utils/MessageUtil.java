package com.tutorial.spring.global.utils;

import com.tutorial.spring.global.common.message.CommonMessage;
import org.springframework.stereotype.Component;

@Component
public class MessageUtil {

    public String getMessage(CommonMessage commonMessage) {
        return commonMessage.getMessage();
    }
}
