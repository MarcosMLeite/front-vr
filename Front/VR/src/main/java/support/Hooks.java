package support;


import org.junit.AfterClass;
import org.junit.BeforeClass;

import cucumber.api.java.Before;


public class Hooks extends Commons {

    @Before
    public void init() throws Exception {
    	Plataforma.inicializarDriver();
        Ambiente.escolherAmbiente();
    }

    @AfterClass
    public  void close() {
       

    }
}

