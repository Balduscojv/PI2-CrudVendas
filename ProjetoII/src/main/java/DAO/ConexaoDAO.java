
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *SS
 * @author baldu
 */
public class ConexaoDAO {
    
    public Connection conectaBD(){
        Connection conn = null;
        
        try { 
            String url = "jdbc:mysql://localhost:3306/lojabrinquedos?user=root&password=P@$$w0rd";
			conn = DriverManager.getConnection(url);
		
		} catch (SQLException erro)  {
			         JOptionPane.showMessageDialog(null,  "ConexãoDAO"  + erro.getMessage());
		}
		return conn;
	}
	
	
}
           

