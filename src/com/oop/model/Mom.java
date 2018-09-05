package com.oop.model;

import java.util.*;

public class Mom {

	public Collection<Child> son;
	private String name;
	private int age;

    public Mom(String name) {
        this.name = name;
    }

    /**
	 *
	 * @param livingRoom
	 */
	public void adjustRadioVolume(LivingRoom livingRoom) {
		// TODO - implement Mom.adjustRadioVolume
		throw new UnsupportedOperationException();
	}

	public boolean feelAsLowVolume() {
		// TODO - implement Mom.feelAsLowVolume
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param livingRoom
	 */
	public void listenToRadio(LivingRoom livingRoom) {
		System.out.println("M: 지금부터 라디오를 듣겠습니다.");
		System.out.println("M: 민수를 찾겠습니다.");
		Child minsu = livingRoom.callChild("Minsu");
		System.out.println("M: 라디오를 찾겠습니다.");
		Radio radio = livingRoom.requestRadio();
		System.out.println("M: 민수가 라디오를 켤수 있는지 물어보겠습니다.");
		if(minsu.canYouTurnOnRadio()){
			System.out.println("M: 민수야, 라디오좀 켜줄래?");
			minsu.turnOnRadio(radio);
			minsu.turnOnRadio(radio);
		}else{
			System.out.println("M: 그래.. 민수가 아직 어리지.. 내가 키마.");
			radio.turnOn();
		}
	}

}