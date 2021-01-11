package ch.bbw.shop.cart;

import java.util.UUID;

public class Token {
	
	private UUID uuid;

	public Token() {
		super();
		this.uuid = UUID.randomUUID();
	}

	public UUID getId() {
		return uuid;
	}
	public void setId(UUID uuid) {
		this.uuid = uuid;
	}

}
