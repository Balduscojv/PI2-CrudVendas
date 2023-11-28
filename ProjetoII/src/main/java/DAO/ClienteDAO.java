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

    public void cadastrarCliente(ClienteDTO objclientedto) {
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
                objClienteDTO.setTelefone(rs.getString("nascimento"));
                objClienteDTO.setTelefone(rs.getString("cpf"));
                objClienteDTO.setTelefone(rs.getString("email"));
                objClienteDTO.setTelefone(rs.getString("sexo"));

                lista.add(objClienteDTO);
            }

        } catch (SQLException erro) {
            JOptionPane.showConfirmDialog(null, "ClienteDAO Pesquisar: " + erro);
        }

        return lista;
    }

}
