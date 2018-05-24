package com.sngular.eureka.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.hamcrest.CoreMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


/**
 * @author Raul Arroyo
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(properties = "words = foo,bar,baz")
@AutoConfigureMockMvc
public class WordControllerTests {

	@Autowired
	MockMvc mockMvc;

	/**
	 * @throws Exception
	 */
	@Test
	public void words() throws Exception {
		mockMvc.perform(
			get("/"))//
			.andExpect(
				content().string(anyOf(is("foo"), is("bar"), is("baz"))));
	}

}
