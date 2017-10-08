package com.demo.helloworld.file;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/file")
public class FileController {

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String read() throws IOException {
		return FileReader.getread();
	}
}
