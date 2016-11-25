import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.io.*;

public class Screenshot2 extends JFrame
{
	private JMenuBar menuMB = new JMenuBar();
	private JMenu fileM, helpM, functionM;
	private JMenuItem custI, payI;
	private JTextField searchTF1, searchTF2, searchTF3, dataL1, dataL2, dataL3, dataL4, dataL5, dataL6, purchaseTF, finderTF, repairTF, transportTF, uploadTF, idTF;
	private JButton searchB, clearB, specificationB, retrieveB, addB, uploadB, miscB, refreshB;
	private JRadioButton oneRB, twoRB;
	private JLabel imageL, yearSL, makeSL, modelSL, yearL, makeL, modelL, costL, askPriceL, minPriceL, sortL, tableL, table1L, purchaseL, finderL, repairL, transportL, idL;
	private BufferedImage image;
	private String str1, str2, str3, str4, str5, str6, str7, str8, str9, str12;
	private Font newFont = new Font("serif", Font.BOLD, 15);
	private JList carJList, car2JList;
   private JScrollPane selectionJS, selection2JS;
   private String[] str10 = {"All",
									  "Acura",
                             "Audi",
                             "BMW",
                             "Buick",
                             "Cadillac",
									  "Chevrolet",
									  "Chrysler",
									  "Dodge",
									  "Eagle",
									  "Ferrari",
									  "Ford",
									  "GMC",
									  "Honda",
									  "Hummer",
									  "a",
									  "b",
									  "c",
									  "b",
									  "c",
									  "b",
									  "c",
									  "b",
									  "c",
									  "b",
									  "c",
									  "b",};
									  
  private String[] str11 = {"1957 Ford Thunderbird (02345)",
  						 "1964 Chevrolet Impala (05748)",
  						 "1966 Corvette Coupe Survivor (03654)",
  						 "1968 Dodge Dart (03827)",
						 "1969 Chevrolet Camaro (02456)",
						 "1970 Chevrolet Chevelle (09345)",
  						 "1970 Hemi Challenger (05834)",
  						 "1971 Ford Mustang Mach 1 (06584)",
						 "1972 Chevrolet El Camino (02375)",
						 "1972 Ford Ranchero (07546)",
						 };
	
	public Screenshot2()
	{
		setTitle("Office Staff Screen");
		setJMenuBar(menuMB);
		setFileMenu();
		setFuncMenu();
		setHelpMenu();
		//ImagePanel();
		Container pane = getContentPane(), carInfo = getContentPane();
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
		str12 = "<html><B>Sort by :</B></html>";
		
		//imageL = new JLabel(new ImageIcon(image));
		yearSL = new JLabel(str7);
		makeSL = new JLabel(str8);
		modelSL = new JLabel(str9);
		searchTF1 = new JTextField(4);
		searchTF2 = new JTextField(20);
		searchTF3 = new JTextField(20);
		searchB = new JButton("Search");
		clearB = new JButton("Retrieve Information");
		specificationB = new JButton("Update");
		addB = new JButton("Add New Vehicle");
		uploadB = new JButton("Upload Image");
		miscB = new JButton("...");
		uploadTF = new JTextField(20);
		yearL = new JLabel(str1);
		makeL = new JLabel(str2);
		modelL = new JLabel(str3);
		costL = new JLabel(str4);
		askPriceL = new JLabel(str5);
		minPriceL = new JLabel(str6);
		dataL1 = new JTextField(20);
		dataL2 = new JTextField(20);
		dataL3 = new JTextField(20);
		dataL4 = new JTextField(20);
		dataL5 = new JTextField(20);
		dataL6 = new JTextField(20);
		carJList = new JList(str10);
		car2JList = new JList(str11);
		selectionJS = new JScrollPane(carJList);
		selection2JS = new JScrollPane(car2JList);
		oneRB = new JRadioButton("ID");
		twoRB = new JRadioButton("Year");
		sortL = new JLabel(str12);
		purchaseL = new JLabel("<html><B>Purchase Date:</B></html>");
		finderL = new JLabel("<html><B>Finder Fee:</B></html>");
		repairL = new JLabel("<html><B>Repair Cost:</B></html>");
		transportL = new JLabel("<html><B>Transportation Cost:</B></html>");
		purchaseTF = new JTextField(20);
		finderTF = new JTextField(20);
		repairTF = new JTextField(20);
		transportTF = new JTextField(20);
		tableL = new JLabel("<html><table border><tr><td width = '850' height = '250'></td></tr></table></html>");
		table1L = new JLabel("<html><table border><tr><td width = '850' height = '125'></td></tr></table></html>");
		idL = new JLabel("<html><B>ID:</B></html>");
		idTF = new JTextField(20);
		refreshB = new JButton("Refresh List");
		
		yearSL.setFont(newFont);
		makeSL.setFont(newFont);
		modelSL.setFont(newFont);
		searchB.setFont(newFont);
		clearB.setFont(newFont);
		specificationB.setFont(newFont);
		addB.setFont(newFont);
		yearL.setFont(newFont);
		makeL.setFont(newFont);
		modelL.setFont(newFont);
		costL.setFont(newFont);
		askPriceL.setFont(newFont);
		minPriceL.setFont(newFont);
		sortL.setFont(newFont);
		purchaseL.setFont(newFont);
		finderL.setFont(newFont);
		repairL.setFont(newFont);
		transportL.setFont(newFont);
		uploadB.setFont(newFont);
		miscB.setFont(newFont);
		idL.setFont(newFont);
		refreshB.setFont(newFont);
		
		transportTF.setHorizontalAlignment(JTextField.RIGHT);
		repairTF.setHorizontalAlignment(JTextField.RIGHT);
		dataL4.setHorizontalAlignment(JTextField.RIGHT);
		dataL5.setHorizontalAlignment(JTextField.RIGHT);
		dataL6.setHorizontalAlignment(JTextField.RIGHT);
		finderTF.setHorizontalAlignment(JTextField.RIGHT);
		
		//imageL.setBounds(300, 300, 600, 400);
		selectionJS.setBounds(100, 35, 130, 130);
		selection2JS.setBounds(250, 35, 250, 130);
		yearSL.setBounds(50, 50, 100, 25);
		searchTF1.setBounds(100, 50, 100, 25);
		makeSL.setBounds(245, 50, 100, 25);
		searchTF2.setBounds(300, 50, 100, 25);
		modelSL.setBounds(440, 50, 100, 25);
		searchTF3.setBounds(500, 50, 100, 25);
		searchB.setBounds(700, 50, 100, 25);
		clearB.setBounds(610, 100, 230, 25);
		specificationB.setBounds(90, 635, 150, 25);
		addB.setBounds(290, 635, 150, 25);
		uploadB.setBounds(720, 680, 125, 25);
		yearL.setBounds(50, 330, 250, 50);
		makeL.setBounds(50, 380, 250, 50);
		modelL.setBounds(50, 430, 250, 50);
		costL.setBounds(525, 530, 250, 50);
		askPriceL.setBounds(50, 480, 250, 50);
		minPriceL.setBounds(50, 530, 250, 50);
		dataL1.setBounds(195, 346, 200, 25);
		dataL2.setBounds(195, 396, 200, 25);
		dataL3.setBounds(195, 446, 200, 25);
		dataL4.setBounds(680, 546, 200, 25);
		dataL5.setBounds(195, 496, 200, 25);
		dataL6.setBounds(195, 546, 200, 25);
		sortL.setBounds(275, 175, 250, 50);
		oneRB.setBounds(350, 175, 250, 50);
		twoRB.setBounds(350, 210, 250, 50);
		purchaseL.setBounds(525, 330, 250, 50);
		finderL.setBounds(525, 380, 250, 50);
		repairL.setBounds(525, 430, 250, 50);
		transportL.setBounds(525, 480, 250, 50);
		purchaseTF.setBounds(680, 346, 200, 25);
		finderTF.setBounds(680, 396, 200, 25);
		repairTF.setBounds(680, 446, 200, 25);
		transportTF.setBounds(680, 496, 200, 25);
		tableL.setBounds(40, 15, 850, 250);
		table1L.setBounds(40, 600, 850, 125);
		miscB.setBounds(520, 680, 30, 25);
		uploadTF.setBounds(560, 680, 150, 25);
		idL.setBounds(325, 280, 250, 50);
		idTF.setBounds(395, 296, 200, 25);
		refreshB.setBounds(75, 200, 150, 25);
		
		/*pane.add(imageL);
		pane.add(yearSL);
		pane.add(searchTF1);
		pane.add(makeSL);
		pane.add(searchTF2);
		pane.add(modelSL);
		pane.add(searchTF3);
		pane.add(searchB);*/
		pane.add(clearB);
		pane.add(specificationB);
		pane.add(yearL);
		pane.add(makeL);
		pane.add(modelL);
		pane.add(costL);
		pane.add(askPriceL);
		pane.add(minPriceL);
		pane.add(dataL1);
		pane.add(dataL2);
		pane.add(dataL3);
		pane.add(dataL4);
		pane.add(dataL5);
		pane.add(dataL6);
		pane.add(selectionJS);
		pane.add(selection2JS);
		pane.add(sortL);
		pane.add(oneRB);
		pane.add(twoRB);
		pane.add(purchaseL);
		pane.add(finderL);
		pane.add(repairL);
		pane.add(transportL);
		pane.add(purchaseTF);
		pane.add(finderTF);
		pane.add(repairTF);
		pane.add(transportTF);
		pane.add(tableL);
		pane.add(addB);
		pane.add(table1L);
		pane.add(uploadB);
		pane.add(uploadTF);
		pane.add(miscB);
		pane.add(idL);
		pane.add(idTF);
		pane.add(refreshB);
		
		setSize(950, 800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void setFileMenu()
	{
		fileM = new JMenu("File");
		menuMB.add(fileM);
	}
	
	public void setFuncMenu()
	{
		functionM = new JMenu("Function");
		menuMB.add(functionM);
		custI = new JMenuItem("Customer Lookup");
		payI = new JMenuItem("Payroll");
		functionM.add(custI);
		functionM.add(payI);
	}
	
	public void setHelpMenu()
	{
		helpM = new JMenu("Help");
		menuMB.add(helpM);
	}
	
	/*public void ImagePanel()
	{
		try{
		image = ImageIO.read(new File("CAR.jpg"));
		} catch (IOException ex){
		}
	}*/
	
	public static void main(String[] args)
	{
		Screenshot2 zach = new Screenshot2();
	}
}