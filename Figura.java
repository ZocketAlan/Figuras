
package Figuras;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Figura extends JPanel{
     //Ventana
    private JFrame ventana;
    //Contenedor
    private Container contenedor;
    //Figura en hexadecimal
    
    public Figura() {
        //Inicializar la ventana
        ventana = new JFrame("Dibujando ícono");
        //Definir tamaño a ventana
        ventana.setSize(800, 600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        //Inicializar contenedor
        contenedor = ventana.getContentPane();
        //Definir mismo tamaño
        contenedor.setSize(800, 600);
        //Agregar la ventana en el contenedor
        contenedor.add(this, BorderLayout.CENTER);

    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.black);
        g.drawLine(100, 50, 200, 50);
        g.drawLine(200, 50, 200, 100);
        g.drawLine(100, 50, 100, 100);
        g.drawLine(100, 100, 200, 100);
        
        g.setColor(Color.green);
        g.drawLine(100, 50, 150, 20);
        g.drawLine(200, 50, 150, 20);
        //rectangulos
        g.setColor(Color.cyan);
        g.drawRect(280, 50, 100, 50);
        g.fillRect(280, 110, 100, 50);
        // Rectángulo redondeado
        g.setColor(Color.PINK);
        g.drawRoundRect(450, 50, 100, 50, 50, 50);
        g.fillRoundRect(450, 110, 100, 50, 20, 20);// GRADO MENOR DE REDONDEO
        // Círculo
        g.setColor(Color.RED);
        g.drawOval(100, 200, 80, 80);
        g.fillOval(100, 290, 50, 50);
        // Óvalos
        g.setColor(Color.LIGHT_GRAY);
        g.drawOval(280,200,80,40);// ancho y alto no se pone igual para notar la diferencia
        g.fillOval(280, 290, 40,80 );
        // Triángulo
        g.setColor(Color.GRAY);
        g.drawLine(450, 300, 550, 300);
        g.drawLine(450, 300, 500, 250);
        g.drawLine(550, 300, 500, 250);
        // Cadena texto
        g.setColor(Color.yellow);
        g.drawString("EJEMPLO DE TRAZO DE FIGURAS", 200, 400);
        //Arco
        g.setColor(Color.magenta);
        g.drawArc(550, 400, 300,100, 150, 100);
        g.fillArc(300, 400, 300, 100, 150, 100);
    }
}
