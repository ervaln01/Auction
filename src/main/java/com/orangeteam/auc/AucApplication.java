package com.orangeteam.auc;

import com.orangeteam.auc.init.Init;
import com.orangeteam.auc.rep.AttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AucApplication implements CommandLineRunner {

	@Autowired
	private AttributeRepository attributeRepository;

	public static void main(String[] args) {
		SpringApplication.run(AucApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Init init = new Init();
		init.initAttributes(attributeRepository);
	}
}
