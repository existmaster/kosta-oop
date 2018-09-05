package com.oop.model;

public class Radio {

	private String name;
	private boolean powerOn;

    public Radio(String name) {
        this.name = name;
        this.powerOn = false;
    }

    public boolean isPowerOn() {
    	if(this.powerOn){
			System.out.println("R: 저는 켜져 있습니다.");
		} else {
			System.out.println("R: 저는 꺼져 있습니다.");
		}
		return this.powerOn;
	}

	public void turnOff() {
		// TODO - implement Radio.turnOff
		throw new UnsupportedOperationException();
	}

	public void turnOn() {
		System.out.println("R: 전원을 켜겠습니다.");
		this.powerOn = true;
		System.out.println("R: 오늘의 뉴스를 말씀드리겠습니다...");
	}

	public int turnVolumeDown() {
		// TODO - implement Radio.turnVolumeDown
		throw new UnsupportedOperationException();
	}

	public int turnVolumeUp() {
		// TODO - implement Radio.turnVolumeUp
		throw new UnsupportedOperationException();
	}

    public String getName() {
		System.out.println("R: 제 제품명은 "+this.name+"입니다.");
        return this.name;
    }
}