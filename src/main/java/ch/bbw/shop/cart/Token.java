package ch.bbw.shop.cart;

import java.util.UUID;

public class Token {
	
	private String uuid;

	public Token() {
		super();
		this.uuid = UUID.randomUUID().toString();
	}

	public String getId() {
		return uuid;
	}
	public void setId(String uuid) {
		this.uuid = uuid;
	}

}
