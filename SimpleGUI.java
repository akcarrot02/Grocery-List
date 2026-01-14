import javax.swing.*;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import java.awt.Font;

public class SimpleGUI {
  public static void main(String[] args) {
    UIManager.put("Label.font", new FontUIResource(new Font("Verdana", Font.PLAIN, 16)));
    UIManager.put("CheckBox.font", new FontUIResource(new Font("Verdana", Font.PLAIN, 16)));
    UIManager.put("Button.font", new FontUIResource(new Font("Verdana", Font.BOLD, 16)));

    JFrame frame = new JFrame("Akshita's Grocery list");
    frame.setSize(300, 400);
    frame.getContentPane().setBackground(Color.PINK);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);

    JLabel label = new JLabel("Grocery list!");
    label.setBounds(20, 20, 200, 30);
    frame.add(label);

    JCheckBox milk = new JCheckBox("Milk");
    milk.setBounds(40, 60, 150, 25);
    frame.add(milk);

    JCheckBox bread = new JCheckBox("Bread");
    bread.setBounds(40, 90, 150, 25);
    frame.add(bread);

    JCheckBox orange = new JCheckBox("Orange");
    orange.setBounds(40, 120, 150, 25);
    frame.add(orange);

    JCheckBox rice = new JCheckBox("Rice");
    rice.setBounds(40, 150, 150, 25);
    frame.add(rice);

    JCheckBox juice = new JCheckBox("Juice");
    juice.setBounds(40, 180, 150, 25);
    frame.add(juice);

    JLabel status = new JLabel("Yay all items collected!");
    status.setBounds(40, 300, 200, 30);
    status.setVisible(false); // hidden initially
    frame.add(status);

    Runnable checkAll = () -> {
      if (milk.isSelected() && bread.isSelected() && orange.isSelected() && rice.isSelected() && juice.isSelected()) {
        status.setVisible(true);
      } else {
        status.setVisible(false);
      }
    };

    milk.addActionListener(e -> checkAll.run());
    bread.addActionListener(e -> checkAll.run());
    orange.addActionListener(e -> checkAll.run());
    rice.addActionListener(e -> checkAll.run());
    juice.addActionListener(e -> checkAll.run());

    frame.setVisible(true);
  }
}