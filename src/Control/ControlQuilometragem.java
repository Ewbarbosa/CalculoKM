
package Control;

import Model.ModelQuilometragem;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControlQuilometragem {
    Conexao conectaQuilometragem = new Conexao();
    
    public void inserirQuilometragem(ModelQuilometragem model){
        
        conectaQuilometragem.conectabanco();
            
        try {
            PreparedStatement pst = conectaQuilometragem.conecta.prepareStatement("insert into quilometragem" +
"                   (placa, data, localmotivo, kmrodado)values(?,?,?,?)");
            
            
            pst.setString(1, model.getPlaca());  
            pst.setDate(2, model.getData());
            pst.setString(3, model.getLocalmotivo());
            pst.setDouble(4, model.getKmrodado());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!");
                    
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro: \n"+ex);
        }
     
    }
    
}
