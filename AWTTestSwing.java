import javax.swing.*;
import java.awt.*;

public class AWTTestSwing {
    public static void main(String[] args) {
        // Cria o JFrame (janela principal)
        JFrame frame = new JFrame("AWT Test");

        // Define a ação de fechar o programa ao clicar no botão de fechar
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define o tamanho da janela principal (largura, altura)
        frame.setSize(400, 200);

        // Define o layout principal da janela como BorderLayout
        frame.setLayout(new BorderLayout());

        // Cria um JLabel (etiqueta de texto) e um JTextField (campo de texto)
        JLabel label1 = new JLabel("Label1");
        JTextField textField1 = new JTextField(17);

        // Cria um painel para adicionar o JLabel e JTextField
        JPanel topPanel = new JPanel();

        // Define o layout do painel superior como FlowLayout (organiza os componentes
        // horizontalmente)
        topPanel.setLayout(new FlowLayout());

        // Adiciona o JLabel e JTextField ao painel superior
        topPanel.add(label1);
        topPanel.add(textField1);

        // Cria três botões e define seus textos
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Cria outro painel para os botões
        JPanel buttonPanel = new JPanel();

        // Define o layout do painel de botões como FlowLayout
        buttonPanel.setLayout(new FlowLayout());

        // Adiciona os botões ao painel de botões
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);

        // Adiciona o painel superior ao norte (parte superior) do BorderLayout
        frame.add(topPanel, BorderLayout.NORTH);

        // Adiciona o painel de botões ao centro do BorderLayout
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Torna a janela visível
        frame.setVisible(true);
    }
}
