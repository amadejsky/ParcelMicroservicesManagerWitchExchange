package org.amadejsky.parcelreceiver;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ParcelReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParcelReceiverApplication.class, args);
	}
	@Bean
	public MessageConverter massageConverter(){
		return new Jackson2JsonMessageConverter();
	}

}
