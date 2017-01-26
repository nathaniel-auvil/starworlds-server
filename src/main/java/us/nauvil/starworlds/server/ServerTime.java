package us.nauvil.starworlds.server;

import java.sql.Timestamp;

public class ServerTime {
	private Timestamp currentTime;

	public ServerTime() {
		this.currentTime = new Timestamp(System.currentTimeMillis());
	}

	public String getCurrentTime() {
		return currentTime.toString();
	}

}
