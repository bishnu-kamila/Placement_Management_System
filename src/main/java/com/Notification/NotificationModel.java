package com.Notification;

public class NotificationModel {
	private int id;
	private String topic;
	private String notification;
	private String apply_link;
	private String exam_link;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getNotification() {
		return notification;
	}
	public void setNotification(String notification) {
		this.notification = notification;
	}
	
	public String getApply_link() {
		return apply_link;
	}
	public void setApply_link(String apply_link) {
		this.apply_link = apply_link;
	}
	public String getExam_link() {
		return exam_link;
	}
	public void setExam_link(String exam_link) {
		this.exam_link = exam_link;
	}
	@Override
	public String toString() {
		return "NotificationModel [id=" + id + ", topic=" + topic + ", notification=" + notification + ", apply_link="
				+ apply_link + ", exam_link=" + exam_link + "]";
	}

	
	
}
