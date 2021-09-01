package interfaces.app;

import factory.TvFactory;
import interfaces.MyRemote;

public class RemoteMain {

	public static void main(String[] args) {
		
		MyRemote remote=TvFactory.getTv(args[0]);
		
		remote.switchOn();
		remote.switchOff();
		remote.changeChannel(10);

	}

}
