import javax.swing.JFrame;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.util.ArrayList;

public class ComputerSwingApp {
   ArrayList<Computer> computers = new ArrayList<Computer>();

   void AddComputer(ArrayList<Computer> computer_list, Computer computer) {
      computer_list.add(computer);
   }

   void ClearComputers(ArrayList<Computer> computer_list) {
      computer_list.clear();
   }

   void ShowComputers(ArrayList<Computer> computer_list) {

   }

   public static void initialize() {
      // Labels
      JLabel address_label = new JLabel("Computer Lab IP Address");
      JLabel value_label = new JLabel("Value");

      // Input Fields
      JTextField address_input = new JTextField("");
      JTextField value_input = new JTextField("");

      // Buttons
      JButton add_btn = new JButton("+");
      JButton clear_btn = new JButton("Clear");
      JButton show_btn = new JButton("Show Computers");
      JButton exit_btn = new JButton("Exit App");

      // Set Fonts
      address_label.setFont(new Font("Arial", Font.BOLD, 20));
      value_label.setFont(new Font("Arial", Font.BOLD, 20));

      address_input.setFont(new Font("Arial", Font.BOLD, 20));
      value_input.setFont(new Font("Arial", Font.BOLD, 20));

      add_btn.setFont(new Font("Arial", Font.BOLD, 20));
      clear_btn.setFont(new Font("Arial", Font.BOLD, 20));
      show_btn.setFont(new Font("Arial", Font.BOLD, 20));
      exit_btn.setFont(new Font("Arial", Font.BOLD, 20));

      // Frame
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(800, 400);
      frame.setVisible(true);
      frame.setLayout(new GridLayout(4, 2 /* , 10, 10 */));

      // Compose Frame
      frame.add(address_label);
      frame.add(address_input);

      frame.add(value_label);
      frame.add(value_input);

      frame.add(add_btn);
      frame.add(show_btn);
      frame.add(clear_btn);
      frame.add(exit_btn);

      // Button Action Listeners
      add_btn.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            System.out.println(add_btn.getText().toString());
         }
      });
      show_btn.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            System.out.println(show_btn.getText().toString());
         }
      });
      clear_btn.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            System.out.println(clear_btn.getText().toString());
         }
      });
      exit_btn.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            // System.out.println(exit_btn.getText().toString());
            System.exit(0);
         }
      });
   }

   public static void main(String[] args) {
      initialize();
   }

}
