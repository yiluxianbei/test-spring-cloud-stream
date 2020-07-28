package com.chen.testspringcloudstreamconsumer8803.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface MySink {


	String MYINPUT = "myinput";
	String MYDELAYDE = "mydelayed";
	/**
	 * 自定义的消息通道(消费)，项目启动会在rabbitmq中生成一个Queue
	 */
	@Input("myinput")//通道名
    SubscribableChannel myinput();

//	测试延迟消息
	@Input("mydelayed")
	SubscribableChannel mydelayed();
}