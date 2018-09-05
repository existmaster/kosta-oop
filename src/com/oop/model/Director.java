package com.oop.model;

public class Director {

	public Mom mom;
	public LivingRoom livingRoom;

	//Scene 2
	public void playAdjustVolumeScene() {
		// TODO - implement Director.playAdjustVolumeScene
		throw new UnsupportedOperationException();
	}

	//Scene 1
	public void playTurnOnRadioScene() {
		//무대를 준비
	    this.livingRoom = new LivingRoom();
		this.mom = new Mom("MinsuMom");
		livingRoom.enter(new Child(15, "Minsu"));
		livingRoom.setup(new Radio("LG"));
        System.out.println("D: 무대가 준비되었습니다.");

		//시뮬레이터 동작
        System.out.println("D: Scene 1 시뮬레이터를 시작합니다.");
        mom.listenToRadio(livingRoom);

	}

    public static void main(String[] args) {
        Director director = new Director();
        director.playTurnOnRadioScene();
    }



}