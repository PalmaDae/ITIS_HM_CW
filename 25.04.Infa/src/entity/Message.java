package entity;

public class Message {
	public String sender;
	public String receiver;
	public String text;
	public Boolean sentOn;
	public Boolean opened;
	
	public Message(String sender, String receiver, String text, Boolean sentOn, Boolean opened) {
		this.sender = sender;
		this.receiver = receiver;
		this.text = text;
		this.sentOn = sentOn;
		this.opened = opened;
	}
}