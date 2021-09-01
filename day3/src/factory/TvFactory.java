package factory;

import interfaces.MyRemote;
import interfaces.impl.PanasonicTv;
import interfaces.impl.SonyTv;

public class TvFactory {

	public static MyRemote getTv(String tvType) {
		
		
		if(tvType.equalsIgnoreCase("sony")) {
			return  new SonyTv();
			
		}else if(tvType.equalsIgnoreCase("panasonic")) {
			return new PanasonicTv();
		}else {
			return null;
		}
		
	}
}
