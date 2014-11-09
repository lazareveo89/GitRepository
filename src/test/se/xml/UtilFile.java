package test.se.xml;

import java.io.File;
import java.io.InputStream;

public class UtilFile {
	public static File getFile(String name){
		System.out.println(name);
		File f = new File(name);
		return f;
	}
}
