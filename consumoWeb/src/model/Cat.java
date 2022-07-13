package model;

public class Cat {
	
	private Status status;
	private String _id;
	private int __v;
	private String text;
	private String source;
	private String updatedAt;
	private String type;
	private String createdAt;
	private boolean deleted;
	private boolean used;
	private String user;
	
	public Cat(Status status, String _id, int __v, String text, String source, String updatedAt, String type,
			String createdAt, boolean deleted, boolean used, String user) {
		super();
		this.status = status;
		this._id = _id;
		this.__v = __v;
		this.text = text;
		this.source = source;
		this.updatedAt = updatedAt;
		this.type = type;
		this.createdAt = createdAt;
		this.deleted = deleted;
		this.used = used;
		this.user = user;
	}

	public Status getStatus() {
		return status;
	}

	public String get_id() {
		return _id;
	}

	public int get__v() {
		return __v;
	}

	public String getText() {
		return text;
	}

	public String getSource() {
		return source;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public String getType() {
		return type;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public boolean isUsed() {
		return used;
	}

	public String getUser() {
		return user;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public void set__v(int __v) {
		this.__v = __v;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Cat [status=" + status + ", _id=" + _id + ", __v=" + __v + ", text=" + text + ", source=" + source
				+ ", updatedAt=" + updatedAt + ", type=" + type + ", createdAt=" + createdAt + ", deleted=" + deleted
				+ ", used=" + used + ", user=" + user + "]";
	}
	
	

}
