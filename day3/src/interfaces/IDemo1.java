package interfaces;

public interface IDemo1 {
public void show();
default public void test() {
	System.out.println("this is Demo1");
}
}
