package fr.formation.inti.model;

public class MessageStore {
	
	private String message;
	
	public MessageStore() {
		message = "Default message";
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageStore [message=" + message + "]";
	}
	
	
	
	
}
