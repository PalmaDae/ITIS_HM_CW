package entity;

public class Subscriptions {
	public String who;
	public String onWhom;
	
	public Subscriptions(String who, String onWhom) {
		this.who = who;
		this.onWhom = onWhom;
	}
	
	public String getWho() {
		return who;
	}
	
	public String getOnWhom() {
		return onWhom;
	}
	
	@Override
	public String toString() {
		return who + " " + onWhom;
	}
}