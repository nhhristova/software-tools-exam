package uni.fmi.stsas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService {

	@GetMapping("/")
	String message() {
		return "Project A deployed at Heroku.";
	}

}
