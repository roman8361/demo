package com.example.demo;

import com.example.demo.api.repository.UserRepository;
import com.example.demo.entity.User;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	public void insertAnyUsers() {
		for (int i = 0; i < 10; i++) {
			userRepository.save(new User());
		}
	}

	@Test
	public void dellAllUsers(){
		userRepository.deleteAll();
	}

	private void copyFile(File src, File dst) throws IOException {
		try (InputStream in = new FileInputStream(src)) {
			try(OutputStream out = new FileOutputStream(dst)) {
				byte[] buf = new byte[1024];
				int len;
				while ((len = in.read(buf)) > 0) {
					out.write(buf, 0, len);
				}
			}
		}
	}

	@Test
	void insertUser() {
		final User user = new User();
		user.setName("Filya");
		user.setLogin("fil0203");
		user.setPassword("fil01!");

		userRepository.save(user);
	}

}
