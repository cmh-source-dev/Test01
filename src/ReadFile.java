import java.io.File;
import java.util.Arrays;

import org.apache.commons.io.FilenameUtils;

public class ReadFile {
	private static String [] handleExt = {"java"};
	 

	   public static void main(String[] args) { 
	         
	        //String strDirPath = "C:\\workspace\\Test\\"; 
	        String strDirPath = "D:\\SOURCE\\work_company\\JKASS\\bin\\..\\"; 
	         
	        ListFile( strDirPath ); 
	    } 
	     
	    // 재귀함수 
	    private static void ListFile( String strDirPath ) { 
	         
	        File path = new File( strDirPath ); 
	        File[] fList = path.listFiles(); 
	         
	        //for( int i = 0; i < fList.length; i++ ) { 
	        try {
	        for( File tempFile : fList ) { 
	             
	            if( tempFile.isFile() ) { 
	                String ext = FilenameUtils.getExtension(tempFile.getName());
	                
//	                Arrays.asList(handleExt).contains(ext);	                
	                System.out.println(Arrays.asList(handleExt).contains(ext));	                
	                
	                
	                System.out.println( tempFile.getPath()+"|"+ext );  // 파일의 FullPath 출력
	                
	                 
	            } 
	            else if( tempFile.isDirectory() ) {
//	            	System.out.println( "=================>"+tempFile.getCanonicalPath().toString());  // 파일의 FullPath 출력
//	            	System.out.println( "=================>"+tempFile.getPath());  // 파일의 FullPath 출력
	                ListFile( tempFile.getPath() );  // 재귀함수 호출 
	            } 
	        } 
	        }catch (Exception e) {
	        	e.printStackTrace();
				// TODO: handle exception
			}
	    } 
	

}
