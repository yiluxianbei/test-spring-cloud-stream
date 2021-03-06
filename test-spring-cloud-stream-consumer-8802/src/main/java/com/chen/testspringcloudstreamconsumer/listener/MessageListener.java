package com.chen.testspringcloudstreamconsumer.listener;

import com.chen.testspringcloudstreamconsumer.channel.MySink;
import com.chen.testspringcloudstreamconsumer.pojo.PayLoad;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

@EnableBinding(MySink.class)
public class MessageListener {

	//监听通道消息,接收到消息后处理业务逻辑如果有异常，会重新执行方法（默认最多执行3次）
	@StreamListener("myConsumer")//这里配置的是要监听的消息通道（消费通道）
	public void input(Message<PayLoad> message) {
		System.out.println("获取到消息: "+message.getPayload());
	}
	//监听通道消息(测试延时消息)
	@StreamListener("myDelayedConsumer")//这里配置的是要监听的消息通道（消费通道）
	public void mydelayed(Message message) {
		System.out.println("获取到消息: "+message.getPayload());
	}

}
