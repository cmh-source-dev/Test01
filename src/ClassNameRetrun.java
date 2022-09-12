import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class ClassNameRetrun {

	public static String getClassName() {
		
		
		int  kk = Thread.currentThread().getStackTrace().length;
		
		for (int i = 0 ; i < kk ; i++) {
			System.out.println(Thread.currentThread().getStackTrace()[i].getClassName());	
			System.out.println(Thread.currentThread().getStackTrace()[i].getFileName());
		}
		
		
		 return  Thread.currentThread().getStackTrace()[2].getClassName();
	}
	
	public static Logger getLogger() {
		
		//String className = ClassNameRetrun.getClassName();
		
		return LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
		
	}

	
	
	String className = ClassNameRetrun.getClassName();
	
	Logger logger = LoggerFactory.getLogger(className);
	
	
}
