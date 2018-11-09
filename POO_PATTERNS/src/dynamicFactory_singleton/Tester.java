package dynamicFactory_singleton;

import java.io.IOException;


public class Tester {

    public static void main(String[] args) {

        
        try {

            FabricaDinamica fb = new FabricaDinamica("properties.txt");
            fb.criaImplementacao(InserirDados.class);
        } catch (IOException e) {
            e.printStackTrace();

        }

        
    }
}
