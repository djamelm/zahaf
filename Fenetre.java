//cette fenêtre est la première fenêtre que l'utilisateur verra, elle se charge de lancer la deuxième fenêtre nommée "saisie" qui se charge de saisir les informations saisies par l'utilisateur
package ex03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fenetre extends JFrame {
  private JButton bouton = new JButton("customisation de votre caractère");

  public Fenetre(){      
    this.setTitle("customisation de caractère de jeu");
    this.setSize(400, 90);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);      
    this.getContentPane().setLayout(new FlowLayout());
    this.getContentPane().add(bouton);
    bouton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent arg0) {
        
        sasie d = new sasie(null, "Customisation de votre caractère ", true);
        infomation Info = d.showZDialog(); 
        JOptionPane jop = new JOptionPane();
        jop.showMessageDialog(null, Info.toString(), "Informations de votre caractère", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
      }         
    });      
    this.setVisible(true);      
  }

  public static void main(String[] main){
    Fenetre fen = new Fenetre();
  }    
}




























//créer par zahaf mohamed el-bachir l3 g07