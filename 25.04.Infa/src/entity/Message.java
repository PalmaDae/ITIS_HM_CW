package entity;

public class Message {
	public String sender;
	public String receiver;
	public String text;
	public boolean sentOn;
	public boolean opened;
	
	public Message(String sender, String receiver, String text, boolean sentOn, boolean opened) {
		this.sender = sender;
		this.receiver = receiver;
		this.text = text;
		this.sentOn = sentOn;
		this.opened = opened;
	}
}