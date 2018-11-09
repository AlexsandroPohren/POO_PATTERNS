package dynamicFactory_singleton;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class SalvaTXT implements InserirDados {

    @Override
    public void InserirDados() {

        Pessoa p1 = new Pessoa(1, "Alexsandro", 21,"Corupá","Caminhoneiro");
        String temp = p1.toString();
        
        try   {
   
      FileOutputStream arquivoGrav =
      new FileOutputStream("file.txt");
      ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
      objGravar.writeObject(temp);
      objGravar.flush();
      objGravar.close();
      arquivoGrav.flush();
      arquivoGrav.close();
      System.out.println("Pessoa gravada com sucesso!");
 
    }
 
    catch(Exception e) {
 
      e.printStackTrace();
 
    }
    }

    public SalvaTXT() {
        this.InserirDados();
    }

}
