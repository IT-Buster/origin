import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesApp {

	public PropertiesApp(String mode) {
		if (mode.equals("Test")) {
			System.out.println("Testing Mode");
			//setKontaktProp();
		}

		if (mode.equals("Prod")) {
			System.out.println("Production Mode");
			//setKontaktProp();
		}
	}

	public void setKontaktProp() {

		Properties prop = new Properties();
		OutputStream output = null;

		try {
			
			output = new FileOutputStream("config.properties");
			//prop.setProperty("host_prod", "sql.bk.waw.pl");
			//prop.setProperty("database_prod", "18430467_kontakt");
			//prop.setProperty("dbuser_prod", "18430467_kontakt");
			//prop.setProperty("dbpassword_prod", "QQnamuniU30");
			
			//prop.setProperty("host_dev", "sql.bk.waw.pl");
			//prop.setProperty("database_dev", "18430467_kontakt");
			//prop.setProperty("dbuser_dev", "18430467_kontakt");
			//prop.setProperty("dbpassword_dev", "QQnamuniU30");
			
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public String getKontaktProp(String key) {

		Properties prop = new Properties();
		OutputStream output = null;

		try {
			prop.load(new FileInputStream("config.properties"));

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		return prop.getProperty(key);

	}

}