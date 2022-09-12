
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Logger logger = LoggerFactory.getLogger(LogTest.class);
		
//		String className = Thread.currentThread().getStackTrace()[1].getClassName();
		String className = ClassNameRetrun.getClassName();
		
		 Logger logger = ClassNameRetrun.getLogger();
		 logger.info("11111111");
		 
		 
		 RuntimeException e = new RuntimeException("  ");
		 
		 logger.info("2222",e);
		 logger.error("2222",e);
		 
		 
		 
		 
		 
		 try{
			 throw new Exception("!!!Error!!!");
		}catch(Exception ee){
			 logger.error("messege", ee);
		}
	}

}
