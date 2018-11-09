package dynamicFactory_singleton;

import java.sql.Connection;


public class SalvaDB implements InserirDados {

    @Override
    public void InserirDados() {
       
        Pessoa p1 = new Pessoa(1,"Alexsandro", 21, "Corupá","Caminhoneiro");

        Connection conec = Conexao.getInstance();
        Connection conec2 = Conexao.getInstance();
       

        PessoaDao ldao = new PessoaDao(conec);
        ldao.save(p1);
    }
    

    public SalvaDB() {
        this.InserirDados();
    }

}
