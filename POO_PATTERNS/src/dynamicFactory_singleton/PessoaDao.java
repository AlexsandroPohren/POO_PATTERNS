package dynamicFactory_singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class PessoaDao implements IDao<Pessoa> {
	
	private Connection connection;

    public PessoaDao(Connection connection) {
        this.connection = connection;
    }

	@Override
	public void save(Pessoa t) {
		String SQL = "insert into pessoa (nome, idade, endereco,"
                + "profissao) values (?,?,?,?)";
        try {
            PreparedStatement pstmt = this.connection.prepareStatement(SQL);
            pstmt.setString(1, t.getNome());
            pstmt.setInt(2, t.getIdade());
            pstmt.setString(3, t.getEndereco());
            pstmt.setString(4, t.getProfissao());
            pstmt.execute();
            System.out.println("pessoa inserida com sucesso");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
	}

	@Override
	public Pessoa getOne(int id) {
		
		Pessoa p = null;
        try {
            Statement sta = connection.createStatement();
            ResultSet elements = sta.executeQuery("select * from pessoa " + "where id = " + id);
            while (elements.next()) {
                p = new Pessoa();
                p.setId(elements.getInt("id"));
                p.setNome(elements.getString("nome"));
                p.setIdade(elements.getInt("idade"));
                p.setEndereco(elements.getString("endereco"));
                p.setProfissao(elements.getString("profissao"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return p;
	}

}
