package home;

import javax.swing.*;
import java.awt.*;

public class ProyectoForm extends JPanel {
    private JTextField nombreField;
    private JTextField responsableField;
    private JTextField fechaInicioField;
    private JTextField fechaFinField;
    private JTextField estadoField;

    public ProyectoForm() {
        setLayout(new GridLayout(5, 2));

        // Crear etiquetas y campos de texto
        add(new JLabel("Nombre:"));
        nombreField = new JTextField();
        add(nombreField);

        add(new JLabel("Responsable:"));
        responsableField = new JTextField();
        add(responsableField);

        add(new JLabel("Fecha Inicio (YYYY-MM-DD):"));
        fechaInicioField = new JTextField();
        add(fechaInicioField);

        add(new JLabel("Fecha Fin (YYYY-MM-DD):"));
        fechaFinField = new JTextField();
        add(fechaFinField);

        add(new JLabel("Estado:"));
        estadoField = new JTextField();
        add(estadoField);
    }

    // Método para obtener un objeto Proyecto a partir de los campos
    public Proyecto getProyecto() {
        String nombre = nombreField.getText();
        String responsable = responsableField.getText();
        String fechaInicio = fechaInicioField.getText();
        String fechaFin = fechaFinField.getText();
        String estado = estadoField.getText();

        return new Proyecto(nombre, responsable, fechaInicio, fechaFin, estado);
    }
    public void setProyecto(Proyecto proyecto) {
        nombreField.setText(proyecto.getNombre());
        responsableField.setText(proyecto.getResponsable());
        fechaInicioField.setText(proyecto.getFechaInicio());
        fechaFinField.setText(proyecto.getFechaFin());
        estadoField.setText(proyecto.getEstado());
    }

}
