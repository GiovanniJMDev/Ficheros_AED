package home;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {
    public Home() {
        setTitle("Sistema de Gestión de Proyectos");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        // Botones para abrir cada formato
        JButton jsonButton = new JButton("Visualizar JSON");
        JButton xmlButton = new JButton("Visualizar XML");
        JButton csvButton = new JButton("Visualizar CSV");

        jsonButton.addActionListener(e -> new JSONInterface().setVisible(true));
        xmlButton.addActionListener(e -> new XMLInterface().setVisible(true));
        csvButton.addActionListener(e -> new CSVInterface().setVisible(true));

        add(jsonButton);
        add(xmlButton);
        add(csvButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }
}
