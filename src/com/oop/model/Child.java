package com.oop.model;

public class Child {

	private int age;
	private String name;

	public Child(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public boolean canYouTurnOnRadio() {
		if(age<10) {
			System.out.println("C: 아뇨, 어려서 못켜요.");
			return false;
		}
		System.out.println("C: 네, 킬줄 알아요.");
		return true;
	}

	/**
	 *
	 * @param radio
	 */
	public void turnOnRadio(Radio radio) {
		System.out.println("C: 라디오야, 너 켜져있니?");
		if(!radio.isPowerOn()){
			System.out.println("C: 라디오를 키겠습니다.");
			radio.turnOn();
		}
	}

	/**
	 *
	 * @param radio
	 * @return
	 */
	public int turnVolumeUp(Radio radio) {
		// TODO - implement Child.turnVolumeUp
		throw new UnsupportedOperationException();
	}

	public String whatYourName() {
		System.out.println("C: 제이름은 "+this.name+"입니다.");
		return this.name;
	}
}