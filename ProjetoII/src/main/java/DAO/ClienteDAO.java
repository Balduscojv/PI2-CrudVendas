package DAO;

import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author brunoSS
 */
public class ClienteDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ClienteDTO> lista = new ArrayList<>();

    public void cadastrarCliente(ClienteDTO objclientedto) throws SQLException {
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
            
        } catch (SQLException erro){
            
            JOptionPane.showConfirmDialog(null, "ClienteDAO cadastrar" + erro);
            
            
              /**
     * Tela de Cadastramento de Cliente.
     * 
     * Esta tela permite aos usuários cadastrar novos clientes no sistema.
     * Os dados inseridos são validados e, em caso de sucesso, o cliente é adicionado ao banco de dados.
     * 
     * @param objclientedto 
     */    /**
     * Tela de Cadastramento de Cliente.
     * 
     * Esta tela permite aos usuários cadastrar novos clientes no sistema.
     * Os dados inseridos são validados e, em caso de sucesso, o cliente é adicionado ao banco de dados.
     * 
     * @param objclientedto 
     */

    /**
     * Tela de Cadastramento de Cliente.Esta tela permite aos usuários cadastrar novos clientes no sistema.Os dados inseridos são validados e, em caso de sucesso, o cliente é adicionado ao banco de dados.
     */
        }
    }

      public ArrayList<ClienteDTO> PesquisarCliente() {
        String sql = "select * from cadcliente";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                ClienteDTO objClienteDTO = new ClienteDTO();
                objClienteDTO.setId_Cliente(rs.getInt("id_cliente"));
                objClienteDTO.setNome_usuario(rs.getString("nome"));
                objClienteDTO.setTelefone(rs.getString("telefone"));
                objClienteDTO.setNascimento(rs.getString("nascimento"));
                objClienteDTO.setCpf(rs.getString("cpf"));
                objClienteDTO.setEmail(rs.getString("email"));
                objClienteDTO.setSexo(rs.getString("sexo"));
                
                lista.add(objClienteDTO);

                
            }

        } catch (SQLException erro) {
            JOptionPane.showConfirmDialog(null, "ClienteDAO Pesquisar: " + erro);
        }
        
        return lista;
}
      
      public void alterarCLiente(ClienteDTO objClienteDTO){
          String sql = "update cadcliente set nome = ?, telefone = ?, nascimento = ?, cpf = ?, email = ?, sexo = ? where id_cliente = ?";
          conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objClienteDTO.getNome_usuario());
            pstm.setString(2, objClienteDTO.getTelefone());
            pstm.setString(3, objClienteDTO.getNascimento());
            pstm.setString(4, objClienteDTO.getCpf());
            pstm.setString(5, objClienteDTO.getEmail());
            pstm.setString(6, objClienteDTO.getSexo());
            pstm.setInt(7, objClienteDTO.getId_Cliente());
            
            
           
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro){
            
            JOptionPane.showConfirmDialog(null, "ClienteDAO Alterar" + erro);
        }
          
          
      }
      
      public void excluirCliente(ClienteDTO objClienteDTO){
          String sql = "DELETE FROM cadcliente where id_cliente = ?";
          conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objClienteDTO.getId_Cliente());
           
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro){
            
            JOptionPane.showConfirmDialog(null, "ClienteDAO Excluir" + erro);
        }
          
      }

}


  
  
    


