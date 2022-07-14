import javax.swing.*;  
public class OptionPaneExample {  
OptionPaneExample(){  
    JFrame f=new JFrame();   
    String name=JOptionPane.showInputDialog(f,"Enter Name");      
}  
public static void main(String[] args) {  
    new OptionPaneExample();  
}  
}  