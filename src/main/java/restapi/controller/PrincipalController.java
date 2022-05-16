package restapi.controller;

import java.util.HashMap;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/WCMGateway/services")
public class PrincipalController {

	@GetMapping("/categories/{categoryName}")
	HashMap findCategory(@PathVariable String categoryName, @RequestParam("libraryName") String libraryName,
			@RequestParam("tid") String tid) {
		HashMap hash = new HashMap<String,String>();
		hash.put("hola", "Como te va");
		hash.put("y vos", "todo tranqui");
		System.out.println("findCategory: " + categoryName + " " + libraryName + " " + tid);
		System.out.println(hash);
		return hash;
	}

	@GetMapping("/categories/{categoryName}/contents")
	void findContentsByCategory(@PathVariable String categoryName, @RequestParam("libraryName") String libraryName,
			@RequestParam("tid") String tid) {

		System.out.println("findContentsByCategory: " + categoryName + " " + libraryName + " " + tid);
	}

	@GetMapping("/contents/{contentName}")
	void findContent(@PathVariable String contentName, @RequestParam("libraryName") String libraryName,
			@RequestParam("tid") String tid) {

		System.out.println("findContent: " + contentName + " " + libraryName + " " + tid);
	}

}
