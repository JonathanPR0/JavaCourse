package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner input = new Scanner(System.in);
		System.out.print("Qual o id: ");
		int id = input.nextInt();
		
		String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, id);
		ResultSet result = stmt.executeQuery();
		
		if(result.next()) {
			Pessoa p = new Pessoa(result.getInt(1), result.getString(2));
			System.out.println("O nome atual é " + p.getNome());
			
			input.nextLine();
			System.out.print("Qual o nome atualizado: ");
			String novoNome = input.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, id);
			stmt.executeUpdate();
			System.out.println("Pessoa alterada com sucesso!");
		}else {
			System.out.println("Pessoa não encontrada");
		}
		

		stmt.close();
		input.close();
	}
}
