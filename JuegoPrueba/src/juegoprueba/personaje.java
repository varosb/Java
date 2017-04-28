
package juegoprueba;


import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;


public class personaje extends JPanel implements ActionListener, KeyListener {

	
	
	//declarar controles a usar y definir valor
        //tambien se define la ruta de donde se selecciona la imagen
	Timer tiempo = new Timer(3,this);
	int x = 0, y = 0, velX, velY;
	Image imagen;
	
	File ruta = new File("link.png");
        
        
        
        
	public personaje(){
		
		//sirve para que inicien las teclas
		
		tiempo.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
                //es una excecion que dice si no encuentra la imagen da un aviso de que no ha encontrado la imagen
                try{
			imagen = ImageIO.read(ruta);
		}
		catch(IOException e){
			System.out.println("No se encunetra la imagen");
		}
				
	}
	
	
	public void init(){}
	
        //estas son coordenadas y tamaño de la imagen que se ha puesto
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		//g.setColor(Color.GREEN);
		//g.fillRect(x, y, 50, 40);
                
                g.drawImage(imagen, x,y,30,30, null);
		
	}
	
	
	public void actionPerformed(ActionEvent e){
		
		x = x + velX;
		y = y + velY;
		repaint();
                
                //los siguientes bucles son para delimimitar la zona por donde se mueve el personaje
                if(x < 0){
			
			velX = 0;
			x = 0;
						
		}
		
		if(x > 370){
			
			velX = 0;
			x = 370;
		
		}
		
		if(y < 0){
			
			velY = 0;
			y = 0;
			
		}
		
		if(y > 400){
			
			velY = 0;
			y = 400;
			
		}
		
		x = x + velX;
		y = y + velY;
		repaint();
		
	}
           

	public void keyPressed1(KeyEvent e) {
	
	}


	@Override
	public void keyTyped(KeyEvent e) {
		
		
		
	}

        //en este apartado he puesto bucles con coordenadas para mover el personaje
	@Override
	public void keyPressed(KeyEvent e) {
		
		int b = e.getKeyCode();
        
        if(b == KeyEvent.VK_LEFT){
            velX = -1;
            velY = 0;
        }
            
        if(b == KeyEvent.VK_UP){
            velX = 0;
            velY = -1;
        }
        if(b == KeyEvent.VK_RIGHT){
            velX = 1;
            velY = 0;
        }
        if(b == KeyEvent.VK_DOWN){
            velX = 0;
            velY = 1;
        }
		
	}


	public void actionReleased(ActionEvent e) {
		
		
	}
	
        //esta parte se usa para que el personaje no se mueva solo y lo tengas que mover tu mismo
	@Override
	public void keyReleased(KeyEvent e) {
		
        int b = e.getKeyCode();
        
        if(b == KeyEvent.VK_LEFT){
            velX = 0;
            velY = 0;
        }
            
        if(b == KeyEvent.VK_UP){
            velX = 0;
            velY = 0;
        }
        if(b == KeyEvent.VK_RIGHT){
            velX = 0;
            velY = 0;
        }
        if(b == KeyEvent.VK_DOWN){
            velX = 0;
            velY = 0;
        }
		
		
	}
	
	
	//aqui se crea la venta junto con el tamaño
	public static void main(String[] arg){
		
		personaje ver = new personaje();
		JFrame form = new JFrame();
		form.setTitle("en movimiento");
		form.setSize(600,500);
		form.setVisible(true);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.add(ver);
		
		
	}


	
	
}