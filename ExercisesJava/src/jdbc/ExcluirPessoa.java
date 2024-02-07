package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe o código: ");
		int id = input.nextInt();
		input.nextLine();
		
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, id);
		
		if(stmt.executeUpdate() > 0)
			System.out.println("Pessoa excluida com sucesso!");
		else
			System.out.println("Id não encontrado");
		
		stmt.executeUpdate();
		
		conexao.close();
		input.close();
	}
}
