package model;

public class Status {
	private boolean verified;
	private int sentCount;
	
	public Status(boolean verified, int sentCount) {
		super();
		this.verified = verified;
		this.sentCount = sentCount;
	}

	public boolean isVerified() {
		return verified;
	}

	public int getSentCount() {
		return sentCount;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public void setSentCount(int sentCount) {
		this.sentCount = sentCount;
	} 
	
	
	
}
