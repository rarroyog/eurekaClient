package com.sngular.eureka.client.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Raul Arroyo
 *
 */
@RestController
public class WordController {

	private final Random random = new Random();

	@Value("${words}")
	String[] words;

	/**
	 * @return
	 */
	@GetMapping("/")
	public String getWord() {
		return words[random.nextInt(words.length)];
	}

}
