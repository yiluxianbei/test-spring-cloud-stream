package com.chen.testspringcloudstreamprovider.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface MySource {


	String MYOUTPUT = "myoutput";
	String MYDELAYED = "mydelayed";
	/**
	 * 自定义的消息通道（生产），项目启动会在rabbitmq中生成一个Exchange
	 */
	@Output("myoutput")//通道名
    MessageChannel myoutput();
	/*
	测试延时消息
	 */
	@Output("mydelayed")//通道名
	MessageChannel delayed();

}