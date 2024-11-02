/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views.Buttons;

import javax.swing.JButton;
import java.awt.Color;

/**
 *
 * @author lmfg0
 */
public class SeatFactory implements Button{
    private int x, y, width, height;
    private String title;
    private String type;
    private boolean occupied = false; 

    public SeatFactory(String type, int x, int y, int width, int height, String title) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.title = title;
    }
    

    public SeatFactory() {
        
    }
       
    
    @Override
    public JButton createButton() {
        JButton button = new JButton(title);
        button.setBounds(x, y, width, height);
        String seatId = type + "_" + title;
        button.setName(seatId);
        
        if ("executive".equals(type)) {
            button.setBackground(Color.BLUE);  // Color específico para silla ejecutiva
            button.setForeground(Color.WHITE);
        } else if ("economy".equals(type)) {
            button.setBackground(Color.GREEN);  // Color específico para silla económica
            button.setForeground(Color.BLACK);
        } else {
            button.setBackground(Color.GRAY);   // Color predeterminado si el tipo es desconocido
            button.setForeground(Color.BLACK);
        }

        button.setFocusPainted(false);  // Sin borde de foco
        return button;
    }
    
    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
