
package DAO;

import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author brunoSS
 */
public class ClienteDAO {
    
    
    Connection conn;
    PreparedStatement pstm;
    /**
     * Tela de Cadastramento de Cliente.
     * 
     * Esta tela permite aos usuários cadastrar novos clientes no sistema.
     * Os dados inseridos são validados e, em caso de sucesso, o cliente é adicionado ao banco de dados.
     * 
     * @param objclientedto 
     */
    public void cadastrarCliente(ClienteDTO objclientedto){
         String sql = "insert into cadcliente (nome, telefone, nascimento, cpf, email, sexo) values (?, ?, ?, ?, ?, ?)";
         
         conn = new ConexaoDAO().conectaBD();
         
         try {
             
             pstm = conn.prepareStatement(sql);
             pstm.setString(1, objclientedto.getNome_usuario());
             pstm.setString(2, objclientedto.getTelefone());
             pstm.setString(3, objclientedto.getNascimento());
             pstm.setString(4, objclientedto.getCpf());
             pstm.setString(5, objclientedto.getEmail());
             pstm.setString(6, objclientedto.getSexo());
            
             pstm.execute();
             pstm.close();
            
        } catch (Exception erro) {
            
             JOptionPane.showConfirmDialog(null, "ClienteDAO" + erro);
            
        }
    }
    
}
