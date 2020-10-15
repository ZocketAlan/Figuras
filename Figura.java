
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
        
        //Borde
        g.setColor(Color.black);
        g.drawRoundRect(10,10,765,540,20,20);
        
        //Ventanitas
        g.setColor(Color.black);
        g.drawRect(20,20,242,255);//1
        g.drawRect(272,20,242,255);//2
        g.drawRect(522,20,242,255);//3
        g.drawRect(20,286,242,255);//4
        g.drawRect(272,286,242,255);//5
        g.drawRect(522,286,242,255);//6
                
        //Casita
        g.setColor(Color.black);
        g.drawLine(50, 100, 240, 100);//1
        g.drawLine(240, 100, 240, 190);//2
        g.drawLine(50, 100, 50, 190);//3
        g.drawLine(50, 190, 240, 190);//4
        g.drawLine(50, 100, 150, 40);//5
        g.drawLine(150, 40, 240, 100);//6
        g.drawLine(110, 150, 110, 190);//7
        g.drawOval(115, 170, 5, 5);//chapa
        g.drawLine(140, 150, 140, 190);//8
        g.drawLine(110, 150, 140, 150);//9
        g.drawLine(110, 190, 70, 230);//10
        g.drawLine(140, 190, 100, 230);//11
        g.drawLine(170,120,170,150);//12
        g.drawLine(210,120,210,150);//13
        g.drawLine(170,120,210,120);//14
        g.drawLine(170,150,210,150);//15
        g.drawLine(170,135,210,135);//16
        g.drawLine(190,120,190,150);//17
        g.drawLine(70,230,100,230);//18
        g.setColor(Color.BLUE);
        g.drawString("Dibujando Líneas.", 100, 250);
        
        //Wifi
        g.setColor(Color.BLACK);
        g.fillRect(302, 180, 25, 60);//1
        g.fillRect(332, 150, 25, 90);//2
        g.fillRect(362, 120, 25, 120);//3
        g.fillRect(392, 90, 25, 150);//4
        g.drawRect(422, 60, 25, 180);//5
        g.drawRect(452, 30, 25, 210);//6
        g.setColor(Color.BLUE);
        g.drawString("Dibujando Rectángulos.", 330, 260);

        //Toyota
        g.setColor(Color.red);
        g.drawOval(540, 60, 200, 140);//1
        g.drawOval(545, 65, 190, 130);//1
        g.drawOval(560, 60, 160, 75);//2
        g.drawOval(565, 65, 150, 65);//2
        g.drawOval(615, 65, 50, 130);//3
        g.drawOval(620, 70, 40, 120);//3
        g.drawString("TOYOTA", 617, 220);
        g.setColor(Color.blue);
        g.drawString("Dibujando Óvalos con Círculos.", 560, 250);
        
        //Carita
        g.setColor(Color.yellow);//Carita fondo
        g.fillRoundRect(60, 326, 150, 150, 150, 150);
        g.setColor(Color.white);//Ojos relleno
        g.fillRoundRect(95, 356, 30, 30, 30, 30);
        g.fillRoundRect(145, 356, 30, 30, 30, 30);
        g.setColor(Color.black);//Ojos contorno
        g.drawRoundRect(95, 356, 30, 30, 30, 30);
        g.drawRoundRect(145, 356, 30, 30, 30, 30);
        g.setColor(Color.red);//Ojos pupila
        g.fillRoundRect(115, 366, 5, 5, 5, 5);
        g.fillRoundRect(165, 366, 5, 5, 5, 5);
        g.setColor(Color.white);//Boca fondo
        g.fillRoundRect(85, 416, 100, 20, 10, 40);
        g.setColor(Color.black);//Boca contorno
        g.drawRoundRect(85, 416, 100, 20, 10, 40);
        g.drawLine(85, 426, 185, 426);//Dientes
        g.drawLine(95, 416, 95, 436);
        g.drawLine(115, 416, 115, 436);
        g.drawLine(135, 416, 135, 436);
        g.drawLine(155, 416, 155, 436);
        g.drawLine(175, 416, 175, 436);
        g.setColor(Color.blue);
        g.drawString("Dibujando Óvalos con Rectángulos.", 48, 510);

        //Gusano
        g.setColor(Color.green);
        g.fillOval(302, 316, 30, 30);//1
        g.fillOval(322, 319, 30, 30);//2
        g.fillOval(342, 321, 30, 30);//3
        g.fillOval(362, 323, 30, 30);//4
        g.fillOval(370, 338, 30, 30);//5
        g.fillOval(380, 358, 30, 30);//6
        g.fillOval(400, 368, 30, 30);//7
        g.fillOval(415, 372, 45, 45);//8
        g.setColor(Color.red);
        g.fillOval(440, 382, 10, 10);//Ojo fondo
        g.setColor(Color.black);
        g.fillOval(443, 385, 5, 5);//Ojo pupila
        g.setColor(Color.black);
        g.drawLine(450, 378, 458, 366);//Antena
        g.fillOval(456, 364, 5, 5);
        g.drawLine(450, 413, 446, 406);//Boca
        g.setColor(Color.blue);
        g.drawString("Dibujando Círculos.", 340, 510);
        
        //Triángulos
        g.setColor(Color.blue);
        g.drawLine(540, 316, 540, 466);//1
        g.setColor(Color.green);
        g.drawLine(540, 316, 700, 391);//2
        g.setColor(Color.red);
        g.drawLine(540, 466, 700, 391);//3
        g.drawLine(540, 466, 645, 365);//4
        g.setColor(Color.blue);
        g.drawLine(540, 316, 645, 415);//5
        g.setColor(Color.blue);
        g.drawString("G", 610, 470);
        g.setColor(Color.red);
        g.drawString("o", 618, 470);
        g.setColor(Color.yellow);
        g.drawString("o", 626, 470);
        g.setColor(Color.blue);
        g.drawString("g", 634, 470);
        g.setColor(Color.green);
        g.drawString("l", 642, 470);
        g.setColor(Color.red);
        g.drawString("e", 646, 470);
        g.setColor(Color.blue);
        g.drawString("Dibujando Triángulos.", 580, 510);
    }
}

        /*
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
        */
