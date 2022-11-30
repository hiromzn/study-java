import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
 
public class ReadPropertiesSample {
 
	private static Properties configuration = new Properties();
 
	static void load( String path ) {
		try{
			InputStreamReader cf = new InputStreamReader( ReadPropertiesSample.class.getResourceAsStream(path), "UTF-8" ) ;
			configuration.load(cf);
			cf.close();
		}
		catch(IOException e){
			System.out.println(e.getStackTrace());
		}
	}
 
	public static void main(String[] args) {
		String path;		

		path = args[0];
		// System.out.printf("%s\n", path );

		load( path );
		configuration.forEach((key, value) -> System.out.println("Key : " + key + ", Value : " + value));
	}
 
}
