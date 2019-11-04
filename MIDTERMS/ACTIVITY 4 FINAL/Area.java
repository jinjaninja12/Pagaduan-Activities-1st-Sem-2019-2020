import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.lang.Math;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Area extends JFrame implements ActionListener,KeyListener{
	
	public static void main (String [] args){
		
		Area m = new Area();
		m.createGUIMain(275,180);
		m.addComponents();
		
	}
	
	public void createGUIMain(int width, int height){
		
		this.setTitle("Computing the Area");
		this.setResizable(false);
		this.getContentPane().setBackground(Color.DARK_GRAY);
		this.setSize(width,height);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(3);
		this.setLayout(null);
		this.setVisible(true);
		
		try{
			
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		
		catch(Exception e){
		 	System.out.println("Error");
		}


	}
	
	public static JTextField tfRadius, tfArea, tfSides, tfWidth, tfHeight;
	public static JButton btn, btn2,btn3,btn4;
	public static JComboBox cbShape;
	public static JLabel lblShape, lblRadius, lblSides, lblWidth, lblHeight, lblArea;
	
	public void addComponents(){
		
		lblShape = new JLabel("Enter Shape");
		lblShape.setBounds(10,20,100,20);
		lblShape.setFont(new Font("Courier New", Font.ITALIC,12));
		lblShape.setForeground(Color.white);
		this.add(lblShape);
		
		lblRadius = new JLabel("Enter Radius: ");
		lblRadius.setBounds(10,53,100,20);
		lblRadius.setFont(new Font("Courier New", Font.ITALIC,12));
		lblRadius.setForeground(Color.white);
		
		
		lblSides = new JLabel("Enter Sides: ");
		lblSides.setBounds(10,53,100,20);
		lblSides.setFont(new Font("Courier New", Font.ITALIC,12));
		lblSides.setForeground(Color.white);
	
		
		lblWidth = new JLabel("Enter Width: ");
		lblWidth.setBounds(10,53,100,20);
		lblWidth.setFont(new Font("Courier New", Font.ITALIC,12));
		lblWidth.setForeground(Color.white);
		
		
		lblHeight = new JLabel("Enter Height: ");
		lblHeight.setBounds(10,83,100,20);
		lblHeight.setFont(new Font("Courier New", Font.ITALIC,12));
		lblHeight.setForeground(Color.white);
	
		String [] shape  = {"Circle", "Square", "Rectangle", "Triangle"};
		cbShape = new JComboBox(shape);
		cbShape.setBounds(105,20,150,20);
		cbShape.setEditable(false);
		cbShape.setSelectedIndex(-1);
		this.add(cbShape);
		cbShape.addActionListener(this);
		
		tfRadius = new JTextField();
		tfRadius.setBounds(105,50,150,25);
		tfRadius.setBackground(Color.GRAY.brighter());
		tfRadius.addKeyListener(this);
		
		tfSides = new JTextField();
		tfSides.setBounds(105,50,150,25);
		tfSides.setBackground(Color.GRAY.brighter());
		tfSides.addKeyListener(this);
		
		tfWidth = new JTextField();
		tfWidth.setBounds(105,50,150,25);
		tfWidth.setBackground(Color.GRAY.brighter());
		tfWidth.addKeyListener(this);
		
		tfHeight = new JTextField();
		tfHeight.setBounds(105,80,150,25);
		tfHeight.setBackground(Color.GRAY.brighter());
		tfHeight.addKeyListener(this);
		
		btn = new JButton("Enter");
		btn.setBounds(30,120,100,20);
		this.add(btn);
		btn.addActionListener(this);
		btn.setEnabled(false);
		
		btn4 = new JButton("Cancel");
		btn4.setBounds(140,120,100,20);
		this.add(btn4);
		btn4.addActionListener(this);
		
		this.revalidate();
		this.repaint();
		
		
	}
	
	public JFrame f2;
	public float radiusC, sideS, hR, wR, bT, hT;
	
	public void outputGUI(int width, int height, String shape){
		
		Area m = new Area();
		f2 = new JFrame();
		f2.setTitle("Output");
		f2.setResizable(false);
		f2.getContentPane().setBackground(Color.DARK_GRAY);
		f2.setSize(width,height);
		f2.setLocationRelativeTo(null);
		f2.setDefaultCloseOperation(3);
		f2.setLayout(null);
		f2.setVisible(true);
		
		if(shape.equals("Circle")){
			lblArea = new JLabel("Area of the Circle is: ");
			lblArea.setBounds(20,30,200,25);
			lblArea.setFont(new Font("Courier New", Font.ITALIC,12));
			lblArea.setForeground(Color.white);
			f2.add(lblArea);
			
			tfArea = new JTextField();
			tfArea.setBounds(50,60,100,25);
			tfArea.setFont(new Font("Courier New", Font.ITALIC,12));
			tfArea.setForeground(Color.black);
			tfArea.setEditable(false);
			f2.add(tfArea);
			
			btn2 = new JButton("Exit");
			btn2.setBounds(50,130,100,25);
			btn2.setFont(new Font("Courier New", Font.ITALIC,12));
			btn2.setForeground(Color.black);
			f2.add(btn2);
			
			btn3 = new JButton("Try Again");
			btn3.setBounds(50,100,100,25);
			btn3.setFont(new Font("Courier New", Font.ITALIC,12));
			btn3.setForeground(Color.black);
			f2.add(btn3);
			
			btn2.addActionListener(this);
			btn3.addActionListener(this);
			radiusC = Float.parseFloat(tfRadius.getText());
			computeC(radiusC);
			
		
		}
		
		else if(shape.equals("Square")){
			
			lblArea = new JLabel("Area of the Square is: ");
			lblArea.setBounds(20,30,200,25);
			lblArea.setFont(new Font("Courier New", Font.ITALIC,12));
			lblArea.setForeground(Color.white);
			f2.add(lblArea);
			
			tfArea = new JTextField();
			tfArea.setBounds(50,60,100,25);
			tfArea.setFont(new Font("Courier New", Font.ITALIC,12));
			tfArea.setForeground(Color.black);
			tfArea.setEditable(false);
			f2.add(tfArea);
			
			btn2 = new JButton("Exit");
			btn2.setBounds(50,130,100,20);
			btn2.setFont(new Font("Courier New", Font.ITALIC,12));
			btn2.setForeground(Color.black);
			f2.add(btn2);
			
			btn3 = new JButton("Try Again");
			btn3.setBounds(50,100,100,20);
			btn3.setFont(new Font("Courier New", Font.ITALIC,12));
			btn3.setForeground(Color.black);
			f2.add(btn3);
			
			btn2.addActionListener(this);
			btn3.addActionListener(this);
			sideS = Float.parseFloat(tfSides.getText());
			computeS(sideS);
			
			
		}
		else if(shape.equals("Rectangle")){
			lblArea = new JLabel("Area of the Rectangle is: ");
			lblArea.setBounds(16,30,200,25);
			lblArea.setFont(new Font("Courier New", Font.ITALIC,12));
			lblArea.setForeground(Color.white);
			f2.add(lblArea);
			
			tfArea = new JTextField();
			tfArea.setBounds(50,60,100,25);
			tfArea.setFont(new Font("Courier New", Font.ITALIC,12));
			tfArea.setForeground(Color.black);
			tfArea.setEditable(false);
			f2.add(tfArea);
			
			btn2 = new JButton("Exit");
			btn2.setBounds(50,130,100,20);
			btn2.setFont(new Font("Courier New", Font.ITALIC,12));
			btn2.setForeground(Color.black);
			f2.add(btn2);
			
			btn3 = new JButton("Try Again");
			btn3.setBounds(50,100,100,20);
			btn3.setFont(new Font("Courier New", Font.ITALIC,12));
			btn3.setForeground(Color.black);
			f2.add(btn3);
			
			btn2.addActionListener(this);
			btn3.addActionListener(this);
			hR = Float.parseFloat(tfHeight.getText());
			wR = Float.parseFloat(tfWidth.getText());
			computeR(wR, hR);
				
			
		}
		
		else if(shape.equals("Triangle")){
			
			lblArea = new JLabel("Area of the Triangle is: ");
			lblArea.setBounds(16,30,200,25);
			lblArea.setFont(new Font("Courier New", Font.ITALIC,12));
			lblArea.setForeground(Color.black);
			f2.add(lblArea);
			
			tfArea = new JTextField();
			tfArea.setBounds(50,60,100,25);
			tfArea.setFont(new Font("Courier New", Font.ITALIC,12));
			tfArea.setForeground(Color.black);
			tfArea.setEditable(false);
			f2.add(tfArea);
			
			btn2 = new JButton("Exit");
			btn2.setBounds(50,130,100,20);
			btn2.setFont(new Font("Courier New", Font.ITALIC,12));
			btn2.setForeground(Color.black);
			f2.add(btn2);
			
			btn3 = new JButton("Try Again");
			btn3.setBounds(50,100,100,20);
			btn3.setFont(new Font("Courier New", Font.ITALIC,12));
			btn3.setForeground(Color.black);
			f2.add(btn3);
			
			btn2.addActionListener(this);
			btn3.addActionListener(this);
			hR = Float.parseFloat(tfHeight.getText());
			wR = Float.parseFloat(tfWidth.getText());
			computeT(wR,hR);
			
		}
		
		
	}
	
	public void computeC(float rad){
		
		this.radiusC = rad;
		float areaC = (float) (Math.PI * rad * rad);
		DecimalFormat df = new DecimalFormat("0.00");
		String ans = df.format(areaC);
		tfArea.setText(ans);
	}
	
	public void computeS(float sid){
		this.sideS = sid;
		float areaS = sid * sid;
		DecimalFormat df = new DecimalFormat("0.00");
		String ans = df.format(areaS);
		tfArea.setText(ans);
	}
	
	public void computeR(float wid, float hei){
		this.wR = wid;
		this.hR = hei;
		float areaR = wid * hei;
		DecimalFormat df = new DecimalFormat("0.00");
		String ans = df.format(areaR);
		tfArea.setText(ans);
	}
	
	public void computeT(float wid, float hei){
		this.wR = wid;
		this.hR = hei;
		float areaT = (wid*hei)/2;
		DecimalFormat df = new DecimalFormat("0.00");
		String ans = df.format(areaT);
		tfArea.setText(ans);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae){
		Area m = new Area();
		String command = ae.getActionCommand();
		Object cbCommand = (String) cbShape.getSelectedItem();
		
		if(command.equals("Cancel"))
		System.exit(0);
		
		if(cbCommand.toString().equals("Circle")){
			this.add(lblRadius);
			this.add(tfRadius);
			this.remove(lblWidth);
			this.remove(lblHeight);
			this.remove(lblSides);
			this.remove(tfSides);
			this.remove(tfWidth);
			this.remove(tfHeight);
		 	this.repaint();
		 	this.revalidate();
		 	btn.setEnabled(true);
		 	
		 	if(command.equals("Enter")){	
		 		
		 		if(tfRadius.getText().toString().equals("")){
		 			JOptionPane.showMessageDialog(null, "Please enter a radius!");
		 			
		 		}
		 		
		 		else if(tfRadius.getText().toString().equals(tfRadius.getText().toString())){
		 			this.dispose();
		 			m.outputGUI(200,200,"Circle");
		 			
		 		}
		 		
		 	
		 	}
		 	
		 		else if(command.equals("Exit")){
		 			System.exit(0);
		 			
		 		}
		 	
		 	else if(command.equals("Try Again")){
		 		int x = JOptionPane.showConfirmDialog(null, "Confirm?");
		 		if(x == JOptionPane.YES_OPTION){
		 			f2.dispose();
		 			m.createGUIMain(275,180);
		 			m.addComponents();
		 			
		 		}
		 		if(x == JOptionPane.NO_OPTION){
		 			System.exit(0);
		 		}
		 	}
		 	
	
			
		}
		
		else if(cbCommand.toString().equals("Square")){
			
			this.add(lblSides);
			this.add(tfSides);
			this.remove(lblWidth);
			this.remove(lblHeight);
			this.remove(lblRadius);
			this.remove(tfRadius);
			this.remove(tfWidth);
			this.remove(tfHeight);
		 	this.repaint();
		 	this.revalidate();
		 	btn.setEnabled(true);
		 	
		 	if(command.equals("Enter")){	
		 		
		 		if(tfSides.getText().toString().equals("")){
		 			JOptionPane.showMessageDialog(null, "Please enter a Side!");
		 			
		 		}
		 		
		 		else if(tfSides.getText().toString().equals(tfSides.getText().toString())){
		 			this.dispose();
		 			m.outputGUI(200,200,"Square");
		 			
		 		}
		 		
	
		 	}
		 	
		 	else if(command.equals("Exit")){
		 			System.exit(0);
		 			
		 		}
		 	
		 	else if(command.equals("Try Again")){
		 		int x = JOptionPane.showConfirmDialog(null, "Confirm?");
		 		if(x == JOptionPane.YES_OPTION){
		 			f2.dispose();
		 			m.createGUIMain(275,180);
		 			m.addComponents();
		 			
		 		}
		 		if(x == JOptionPane.NO_OPTION){
		 			System.exit(0);
		 		}
		 	}
		 	
		 	
			
			
			
		}
		
		else if(cbCommand.toString().equals("Rectangle")){
			
			this.remove(lblSides);
			this.remove(tfSides);
			this.add(lblWidth);
			this.add(lblHeight);
			this.remove(lblRadius);
			this.remove(tfRadius);
			this.add(tfWidth);
			this.add(tfHeight);
		 	this.repaint();
		 	this.revalidate();
		 	btn.setEnabled(true);
		 	
		 		if(command.equals("Enter")){	
		 		
		 		if(tfWidth.getText().toString().equals("") && tfHeight.getText().toString().equals("")){
		 			JOptionPane.showMessageDialog(null, "Please enter a width and height!");
		 			
		 		}
		 		
		 		else if(tfWidth.getText().toString().equals("")){
		 			JOptionPane.showMessageDialog(null, "Please enter a width!");
		 			
		 		}
		 		else if(tfHeight.getText().toString().equals("")){
		 			JOptionPane.showMessageDialog(null, "Please enter a width and height!");
		 		}
		 		else if(tfRadius.getText().toString().equals(tfRadius.getText().toString())){
		 			this.dispose();
		 			m.outputGUI(200,200,"Rectangle");
		 		}
		 		
		 		
		 	}
		 	
		 		else if(command.equals("Exit")){
		 			System.exit(0);
		 			
		 		}
		 	
		 	else if(command.equals("Try Again")){
		 		int x = JOptionPane.showConfirmDialog(null, "Confirm?");
		 		if(x == JOptionPane.YES_OPTION){
		 			f2.dispose();
		 			m.createGUIMain(275,180);
		 			m.addComponents();
		 			
		 		}
		 		if(x == JOptionPane.NO_OPTION){
		 			System.exit(0);
		 		}
		 	}
			
		}
		
		else if(cbCommand.toString().equals("Triangle")){
			
			
			this.remove(lblSides);
			this.remove(tfSides);
			this.add(lblWidth);
			this.add(lblHeight);
			this.remove(lblRadius);
			this.remove(tfRadius);
			this.add(tfWidth);
			this.add(tfHeight);
		 	this.repaint();
		 	this.revalidate();
		 	btn.setEnabled(true);
			
				if(command.equals("Enter")){	
		 		
		 		if(tfWidth.getText().toString().equals("") && tfHeight.getText().toString().equals("")){
		 			JOptionPane.showMessageDialog(null, "Please enter a width and height!");
		 			
		 		}
		 		
		 		else if(tfWidth.getText().toString().equals("")){
		 			JOptionPane.showMessageDialog(null, "Please enter a width!");
		 			
		 		}
		 		else if(tfHeight.getText().toString().equals("")){
		 			JOptionPane.showMessageDialog(null, "Please enter a width and height!");
		 		}
		 		else if(tfRadius.getText().toString().equals(tfRadius.getText().toString())){
		 			this.dispose();
		 			m.outputGUI(200,200,"Triangle");
		 		}
		 		
		 	
		 	}
		 	
		 		else if(command.equals("Exit")){
		 			System.exit(0);
		 			
		 		}
		 	
		 	else if(command.equals("Try Again")){
		 		int x = JOptionPane.showConfirmDialog(null, "Confirm?");
		 		if(x == JOptionPane.YES_OPTION){
		 			f2.dispose();
		 			m.createGUIMain(275,180);
		 			m.addComponents();
		 			
		 		}
		 		if(x == JOptionPane.NO_OPTION){
		 			System.exit(0);
		 		}
		 	}
			
		}
	}
	
	@Override
	public void keyTyped(KeyEvent ke){
		
		if(Character.isLetter(ke.getKeyChar())){
		 	ke.consume();	
		}
		
	}
	
	public void keyPressed(KeyEvent ke){
		
	}
	
	public void keyReleased(KeyEvent ke){
		
	}
	
	
	

	
}


