package interfaces.impl;

import interfaces.MyRemote;

public class PanasonicTv implements MyRemote{

	@Override
	public void switchOn() {
		System.out.println("Panasonic TV switched ON");
		
	}

	@Override
	public void switchOff() {
		System.out.println(" Panasonic TV switched OFF");
		
	}

	@Override
	public void changeChannel(int channelNo) {
		System.out.println("Channel set To "+channelNo);
		
	}

}
