import javax.swing.*;

public class GUIProgram {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
    
    private static void createAndShowGUI() {
        // Criando uma janela
        JFrame frame = new JFrame("Programa GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Criando um rótulo
        JLabel label = new JLabel("Olá, Mundo!");
        label.setHorizontalAlignment(JLabel.CENTER);
        
        // Adicionando o rótulo à janela
        frame.getContentPane().add(label);
        
        // Configurando o tamanho e exibindo a janela
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
