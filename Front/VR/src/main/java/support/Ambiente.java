package support;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Ambiente extends Commons{
	public static void escolherAmbiente() throws IOException {

        Properties pro = getProp();
        String ambiente = pro.getProperty("properties.link.ambiente");
        switch (ambiente) {

            case "WEB":
           
                driver.get("https://www.vr.com.br/");
              
                break;

           
            default:
                System.out.println("deve definir ambiente no properties.link.ambiente");

                break;
        }


    }

        public static Properties getProp () throws IOException {
            Properties props = new Properties();
            FileInputStream file = new FileInputStream("src" + File.separator + "test" + File.separator + "java" + File.separator +"Jornada" + File.separator +"setup.properties");
            props.load(file);
            return props;

        }

}
