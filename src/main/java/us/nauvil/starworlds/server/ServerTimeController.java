package us.nauvil.starworlds.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerTimeController {

	@RequestMapping(path = "/serverTime", method = RequestMethod.GET)
	public ServerTime getCurrentTime() {
		return new ServerTime();
	}
}
