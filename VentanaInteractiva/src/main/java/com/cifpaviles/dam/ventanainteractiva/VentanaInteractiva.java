/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cifpaviles.dam.ventanainteractiva;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class VentanaInteractiva extends JFrame {

    
    private final int ANCHO_INICIAL = 400;
    private final int ALTO_INICIAL = 300;
    private final int ANCHO_REDIMENSIONADO = 600;
    private final int ALTO_REDIMENSIONADO = 400;

    
    public VentanaInteractiva() {
       
        setTitle("Actividad 4 - Interfaz Gráfica con Swing");
        setSize(ANCHO_INICIAL, ALTO_INICIAL);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setResizable(true); 

        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        
        JButton btnColor = new JButton("Cambiar color de fondo");
        JButton btnRedimensionar = new JButton("Redimensionar a 600x400");
        JButton btnRestaurar = new JButton("Restaurar tamaño original");

        
        panel.add(btnColor);
        panel.add(btnRedimensionar);
        panel.add(btnRestaurar);

       
        add(panel);

       

        
        btnColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                Color colorAleatorio = new Color(
                        random.nextInt(256),
                        random.nextInt(256),
                        random.nextInt(256)
                );
                panel.setBackground(colorAleatorio);
            }
        });

        
        btnRedimensionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSize(ANCHO_REDIMENSIONADO, ALTO_REDIMENSIONADO);
            }
        });

       
        btnRestaurar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSize(ANCHO_INICIAL, ALTO_INICIAL);
            }
        });
    }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaInteractiva ventana = new VentanaInteractiva();
            ventana.setVisible(true);
        });
    }
}

