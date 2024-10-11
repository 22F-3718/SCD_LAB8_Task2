import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.plaf.FontUIResource;

public class ColorButtons {

	public ColorButtons()
	{
		designUI();
	}
	
	public void designUI()
	{
		JFrame frame = new JFrame("Color Buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        JButton redButton = new JButton("Red");
        redButton.setBackground(Color.RED);
        redButton.setForeground(Color.white);
        redButton.setOpaque(true);
        redButton.setBounds(150,40,80,80); //Changed Position of Buttons
        redButton.setFont(new FontUIResource("Times New Roman",1,12));
        redButton.setBorderPainted(false);

        JButton greenButton = new JButton("Green");
        greenButton.setBackground(Color.GREEN);
        greenButton.setForeground(Color.white);
        greenButton.setOpaque(true);
        greenButton.setBounds(40,40,80,80); //Changed Position of Buttons
       
        greenButton.setBorderPainted(false);

        JButton blueButton = new JButton("Blue");
        blueButton.setBackground(Color.BLUE);
        blueButton.setForeground(Color.white);
        blueButton.setOpaque(true);
        blueButton.setBounds(250,40,80,80); //This remains same
        blueButton.setBorderPainted(false);

        frame.add(redButton);
        frame.add(greenButton);
        frame.add(blueButton);

        frame.setVisible(true);
	}
    public static void main(String[] args) {
        new ColorButtons();
    }
}
