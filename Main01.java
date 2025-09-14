//Singelton Pattern
class logger {
	public static logger instance;
	private logger() {
		System.out.println("Logger initialized..");
	}
	public static logger getInstance() {
		if(instance==null) {
			instance = new logger();
		}
		return instance;
	}

}
public class Main01
{
	public static void main(String[] args) {
		logger l1 = logger.getInstance();
		logger l2 = logger.getInstance();
		if(l1==l2) System.out.println("True");
		else System.out.println("False");
	}
}