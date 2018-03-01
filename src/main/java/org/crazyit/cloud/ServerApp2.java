package org.crazyit.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerApp2 {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ServerApp2.class).web(true).run(args);
	}

}
