package com.human.inheritanceTest3;

public class TelePhone extends Phone {
	private String when = null;
	
	public TelePhone() {}
	public TelePhone(String owner) {super(owner);}
	public TelePhone(String owner, String when) {
		super(owner);
		this.when = when;
	}
	
	public void autoAnswering() {
		System.out.println(super.owner+ "�� ����. " + this.getWhen()+" ��ȭ �ٷ�");
	}
	
	public String getWhen() {
		return when;
	}
	public void setWhen(String when) {
		this.when = when;
	}

}
