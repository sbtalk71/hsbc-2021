package interfaces.impl;

import interfaces.MyRemote;

public class SonyTv implements MyRemote{

	@Override
	public void switchOn() {
		System.out.println("Sony TV switched ON");
		
	}

	@Override
	public void switchOff() {
		System.out.println(" Sony TV switched OFF");
		
	}

	@Override
	public void changeChannel(int channelNo) {
		System.out.println("Channels set To "+channelNo);
		
	}

}
