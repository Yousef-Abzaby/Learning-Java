import javax.swing.JOptionPane;

class test {
    public static void main(String[] arg){
        String name = JOptionPane.showInputDialog("What is your name ?");

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your Age ?"));

        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your Height ?"));

        JOptionPane.showMessageDialog(null, "Hello " + name);
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
    }
}