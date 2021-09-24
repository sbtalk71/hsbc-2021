
public class Proxy extends Target {

	@Override
	public String echo(String message) {
		// TODO Auto-generated method stub
		return super.echo(message)+" World!!";
	}
}
