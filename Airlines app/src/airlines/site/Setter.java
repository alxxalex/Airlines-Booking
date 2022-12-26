package airlines.site;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/* @author uSER*/
public class Setter {

    private List<String> locations = new ArrayList();
    DefaultListModel model = new DefaultListModel();

    public Setter() {

    }

    public void setLocations() {
        try {
            FileReader fr = new FileReader("Locations/Locations.txt");
            BufferedReader br = new BufferedReader(fr);
            String location;
            while ((location = br.readLine()) != null) {
                locations.add(location);
            }
            fr.close();
            br.close();
            refreshModel(locations);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "FileNotFoundException");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "IOException");
        }
    }

    public void setAccounts() {

        /*try {
            FileReader fr = new FileReader("C:\\Accounts\\Accounts.txt");
            BufferedReader br = new BufferedReader(fr);
            String account;
            while ((account = br.readLine()) != null) {
            String[] elem = account.split(",");
            SignUp.accounts.add(new Account(elem[0], elem[1], elem[2]));
            }
            fr.close();
            br.close();
            } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "FileNotFoundException");
            } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "IOException");
            }*/
        try {
            Connection conection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Accounts?user=root&password=Alexovidiu2003");
            Statement statement = conection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = statement.executeQuery("select * from accounts");
            rs.beforeFirst();
            while(rs.next()){
            String username = rs.getString("a_username");
            String password = rs.getString("a_password");
            String email = rs.getString("a_email");
            SignUp.accounts.add(new Account(username, password, email));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Setter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void refreshModel(List<String> list) {
        model.clear();
        for (String l : list) {
            model.addElement(l);
        }

    }

    public void filterList(String text) {
        List<String> filteredLocations = new ArrayList();
        filteredLocations = locations.stream().parallel()
                .filter(p -> p.toLowerCase().contains(text.toLowerCase()))
                .collect(Collectors.toList());
        refreshModel(filteredLocations);
    }

    public DefaultListModel getModel() {
        return model;
    }

}
