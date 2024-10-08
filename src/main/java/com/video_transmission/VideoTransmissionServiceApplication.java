package com.video_transmission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class VideoTransmissionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoTransmissionServiceApplication.class, args);
	}

}
