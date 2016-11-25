import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.io.*;

public class Screenshot3 extends JFrame
{
	private JMenuBar menuMB = new JMenuBar();
	private JMenu fileM, helpM;
	private JTextField searchTF1, searchTF2, searchTF3;
	private JButton searchB, clearB, specificationB, contactB, viewB;
	private JLabel imageL, yearSL, makeSL, modelSL, yearL, makeL, modelL, costL, askPriceL, minPriceL, dataL1, dataL2, dataL3, dataL4, dataL5, dataL6, tableL, table2L, table3L;
	private BufferedImage image;
	private String str1, str2, str3, str4, str5, str6, str7, str8, str9, str10;
	private Font newFont = new Font("serif", Font.BOLD, 15);
	
	public Screenshot3()
	{
		setTitle("Customer Screen");
		//setJMenuBar(menuMB);
		setFileMenu();
		setHelpMenu();
		ImagePanel();
		Container pane = getContentPane(), carInfo = getContentPane();
		carInfo.setLayout(new GridLayout(6, 2));
		carInfo.setLocation(100, 300);
		pane.setLayout(null);
		
		str1 = "<html><B>Year:</B></html>";
		str2 = "<html><B>Make:</B></html>";
		str3 = "<html><B>Model:</B></html>";
		str4 = "<html><B>Cost:</B></html>";
		str5 = "<html><B>Asking Price:</B></html>";
		str6 = "<html><B>Minimum Price:</B></html>";
		str7 = "<html><B>Year :</B></html>";
		str8 = "<html><B>Make :</B></html>";
		str9 = "<html><B>Model :</B></html>";
		str10 = "<html><table border><tr><td width = '850' height = '150'></td></tr></table></html>";
		
		imageL = new JLabel(new ImageIcon(image));
		tableL = new JLabel(str10);
		table2L = new JLabel("<html><table border><tr><td width = '620' height = '410'></td></tr></table></html>");
		table3L = new JLabel("<html><table border><tr><td width = '250' height = '450'></td></tr></table></html>");
		yearSL = new JLabel(str7);
		makeSL = new JLabel(str8);
		modelSL = new JLabel(str9);
		searchTF1 = new JTextField(4);
		searchTF2 = new JTextField(20);
		searchTF3 = new JTextField(20);
		searchB = new JButton("Search");
		clearB = new JButton("Clear");
		specificationB = new JButton("Specifications");
		contactB = new JButton("Contact MCM");
		viewB = new JButton("View Similar Vehicles");
		yearL = new JLabel(str1);
		makeL = new JLabel(str2);
		modelL = new JLabel(str3);
		costL = new JLabel(str4);
		askPriceL = new JLabel(str5);
		minPriceL = new JLabel(str6);
		dataL1 = new JLabel("1968");
		dataL2 = new JLabel("Dodge");
		dataL3 = new JLabel("Dart");
		dataL4 = new JLabel("$250,000");
		dataL5 = new JLabel("$100,000");
		dataL6 = new JLabel("$275,000");
		
		searchTF1.setText("1968");
		searchTF2.setText("Dodge");
		searchTF3.setText("Dart");
		
		yearSL.setFont(newFont);
		makeSL.setFont(newFont);
		modelSL.setFont(newFont);
		searchB.setFont(newFont);
		clearB.setFont(newFont);
		specificationB.setFont(newFont);
		contactB.setFont(newFont);
		yearL.setFont(newFont);
		makeL.setFont(newFont);
		modelL.setFont(newFont);
		costL.setFont(newFont);
		askPriceL.setFont(newFont);
		minPriceL.setFont(newFont);
		viewB.setFont(newFont);
		
		imageL.setBounds(301, 305, 600, 400);
		tableL.setBounds(30, 15, 850, 150);
		table2L.setBounds(290, 300, 620, 410);
		table3L.setBounds(30, 250, 250, 450);
		yearSL.setBounds(50, 50, 100, 25);
		searchTF1.setBounds(100, 50, 100, 25);
		makeSL.setBounds(245, 50, 100, 25);
		searchTF2.setBounds(300, 50, 100, 25);
		modelSL.setBounds(440, 50, 100, 25);
		searchTF3.setBounds(500, 50, 100, 25);
		searchB.setBounds(700, 50, 100, 25);
		clearB.setBounds(700, 100, 100, 25);
		specificationB.setBounds(75, 550, 150, 25);
		contactB.setBounds(75, 600, 150, 25);
		viewB.setBounds(500, 250, 225, 25);
		yearL.setBounds(50, 250, 250, 50);
		makeL.setBounds(50, 300, 250, 50);
		modelL.setBounds(50, 350, 250, 50);
		costL.setBounds(50, 400, 250, 50);
		askPriceL.setBounds(50, 400, 250, 50);
		minPriceL.setBounds(50, 500, 250, 50);
		dataL1.setBounds(170, 250, 250, 50);
		dataL2.setBounds(170, 300, 250, 50);
		dataL3.setBounds(170, 350, 250, 50);
		dataL4.setBounds(170, 400, 250, 50);
		dataL5.setBounds(170, 400, 250, 50);
		dataL6.setBounds(170, 500, 250, 50);
		
		pane.add(imageL);
		pane.add(tableL);
		pane.add(table2L);
		pane.add(table3L);
		pane.add(yearSL);
		pane.add(searchTF1);
		pane.add(makeSL);
		pane.add(searchTF2);
		pane.add(modelSL);
		pane.add(searchTF3);
		pane.add(searchB);
		pane.add(clearB);
		pane.add(specificationB);
		pane.add(contactB);
		pane.add(viewB);
		pane.add(yearL);
		pane.add(makeL);
		pane.add(modelL);
		//pane.add(costL);
		pane.add(askPriceL);
		//pane.add(minPriceL);
		pane.add(dataL1);
		pane.add(dataL2);
		pane.add(dataL3);
		//pane.add(dataL4);
		pane.add(dataL5);
		//pane.add(dataL6);
		
		setSize(950, 800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void setFileMenu()
	{
		fileM = new JMenu("File");
		menuMB.add(fileM);
	}
	
	public void setHelpMenu()
	{
		helpM = new JMenu("Help");
		menuMB.add(helpM);
	}
	
	public void ImagePanel()
	{
		try{
		image = ImageIO.read(new File("car.jpg"));
		} catch (IOException ex){
		}
	}
	
	public static void main(String[] args)
	{
		Screenshot3 zach = new Screenshot3();
	}
}