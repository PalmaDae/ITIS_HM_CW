package entity;

public class Subscriptions {
	public User who;
	public User onWhom;
	
	public Subscriptions(User who, User onWhom) {
		this.who = who;
		this.onWhom = onWhom;
	}
	
	public User getWho() {
		return who;
	}
	
	public User getOnWhom() {
		return onWhom;
	}
	
	@Override
	public String toString() {
		return who + " " + onWhom;
	}
}