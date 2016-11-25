//Zachary Price
//Single Linked List
//Longest: MMMDCCCLXXXVIII
//Largest: MMMCMXCIX = 3999
//Invalid: DM, VL, VC, CCD, CCM, IIX, IIV, XXC, XXL

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SingleLinkedList extends JFrame implements ActionListener
{
	 JMenuBar menuMB;
	 JMenu actionM, printM;
	 JMenuItem insertI, deleteI, printFI, printRI, clearI, exitI;
    JTextArea listTA = new JTextArea();
	 LinkList list = new LinkList();
	 KeyAdapter keyadapt;
	 Node currentLink;
	 
	 public SingleLinkedList()
	 {
		Container pane = getContentPane();
		setSize(200, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		listTA.setText("");
		listTA.setBounds(100, 100, 200, 50);
		
		pane.add(listTA);
	 }
	 
	 public void setActionMenu()
	 {
	 	 menuMB = new JMenuBar();
		 actionM = new JMenu("Action");
		 printM = new JMenu("Print List");
		 insertI = new JMenuItem("Insert Node");
		 deleteI = new JMenuItem("Delete Node");
		 printFI = new JMenuItem("Forward");
		 printRI = new JMenuItem("Reverse");
		 clearI = new JMenuItem("Clear");
		 exitI = new JMenuItem("Exit");
		 
		 menuMB.add(actionM);
		 actionM.add(insertI);
		 actionM.add(deleteI);
		 actionM.add(printM);
		 actionM.add(clearI);
		 printM.add(printFI);
		 //printM.add(printRI);
		 actionM.add(exitI);
		 
		 insertI.addActionListener(this);
		 deleteI.addActionListener(this);
		 printFI.addActionListener(this);
		 printRI.addActionListener(this);
		 clearI.addActionListener(this);
		 exitI.addActionListener(this);
	 }
	 
	 public void actionPerformed(ActionEvent e)
	 {
	 	JMenuItem mItem = (JMenuItem) e.getSource();
		int input;

		if (mItem == printFI)
		{	
			listTA.append(list.printForward());
		}
			
			/*else if (mItem == printRI)
			{
				//currentLink = list.getFirst();
			
				while (currentLink != null)
					currentLink = currentLink.next;
			
				if (currentLink == null)
					list.setLast(currentLink);
			}*/
		
				else if (mItem == insertI)
				{
					try
					{
						input = Integer.parseInt(JOptionPane.showInputDialog(null, "What number would you like to insert into the list?", "Insert Node", JOptionPane.INFORMATION_MESSAGE));
						list.insert(input);
					}
					catch (NumberFormatException ex)
					{
						JOptionPane.showMessageDialog(null, "Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
		
					else if (mItem == deleteI)
					{
						try
						{
							input = Integer.parseInt(JOptionPane.showInputDialog(null, "What number would you like to delete from the list?", "Delete Node", JOptionPane.INFORMATION_MESSAGE));
							list.delete(input);
						}
						catch (NumberFormatException ex)
						{
							JOptionPane.showMessageDialog(null, "Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}
						else if (mItem == clearI)
						{
							listTA.setText("");
						}
							else if (mItem == exitI)
							{
								System.exit(0);
							}
	 }
}

class Node
{
   public int info;
   public Node next, prev;

   public Node(int i)
	{
   	info = i;
   }
}

class LinkList
{
	private Node first, last, current;

   public LinkList()
	{
   	first = null;
		last = null;
		current = null;
   }
	
	public Node getCurrent()
	{
		return current;
	}
	
	public Node getFirst()
	{
		return first;
	}
	
	public Node getLast()
	{
		return last;
	}
	
	public void setFirst(Node f)
	{
		first = f;
	}
	
	public void setLast(Node l)
	{
		last = l;
	}
	
	public void setCurrent(Node c)
	{
		current = c;
	}

   public void insert(int d)
	{	
		Node newNode = new Node(d);
		
		if (first == null)
		{
			first = newNode;
			last = newNode;
			current = newNode;
			JOptionPane.showMessageDialog(null, d + " has successfully been added to the list.", "Success", JOptionPane.PLAIN_MESSAGE);
		}
			else if (newNode.info <= first.info)
			{
				newNode.next = first;
				first = newNode;
				current = first;
				JOptionPane.showMessageDialog(null, d + " has successfully been added to the list.", "Success", JOptionPane.PLAIN_MESSAGE);
			}
				else if (newNode.info >= last.info)
				{
					last.next = newNode;
					last = newNode;
					JOptionPane.showMessageDialog(null, d + " has successfully been added to the list.", "Success", JOptionPane.PLAIN_MESSAGE);
				}
					else
					{
						while (newNode.info >= current.next.info)
							current = current.next;
							
						if (current.next.info >= newNode.info && current.info <= newNode.info)
						{
							newNode.next = current.next;
							current.next = newNode;
							current = first;
							JOptionPane.showMessageDialog(null, d + " has successfully been added to the list.", "Success", JOptionPane.PLAIN_MESSAGE);
						}	
					}
   }

   public void delete(int d)
	{	
		Node newNode = new Node(d);
		
		if (first != null && newNode.info == first.info)
		{
			if (first.next == null)
			{
				first = null;
				JOptionPane.showMessageDialog(null, d + " has successfully been removed from the list.", "Success", JOptionPane.PLAIN_MESSAGE);
			}
				else if (newNode.info == first.info && first.next != null)
				{
					first = first.next;
					JOptionPane.showMessageDialog(null, d + " has successfully been removed from the list.", "Success", JOptionPane.PLAIN_MESSAGE);
				}
					else
						JOptionPane.showMessageDialog(null, "There is no list to delete.", "Error", JOptionPane.ERROR_MESSAGE);
		}
			else if (newNode.info == last.info)
			{
				while (current.next != last && newNode.info >= current.next.info)
					current = current.next;
				
				if (current.next.info == last.info)
				{
					current.next = null;
					last = current;
					current = first;
					JOptionPane.showMessageDialog(null, d + " has successfully been removed from the list.", "Success", JOptionPane.PLAIN_MESSAGE);
				}
			}
				else
				{
					while (current.next != null && newNode.info > current.next.info)
						current = current.next;
						
					if (current.next == null && newNode.info != current.info)
							JOptionPane.showMessageDialog(null, d + " does not exist in the linked list.", "Error", JOptionPane.PLAIN_MESSAGE);
					
					if (current.next != null && newNode.info <= current.next.info)
					{
						current.next = current.next.next;
						JOptionPane.showMessageDialog(null, d + " has successfully been removed from the list.1", "Success", JOptionPane.PLAIN_MESSAGE);
					}
				}
			current = first;
   }
	
	public String printForward()
	{	
		String print = "";
		
		while (current != null)
		{
			print = print + current.info + " ";
			current = current.next;
		}
		
		print = print + "\n";
		
		if (first == null)
		{
			JOptionPane.showMessageDialog(null, "There is nothing to print.", "Error", JOptionPane.ERROR_MESSAGE);
			print = print + "\b";
		}
		
		current = first;
		
		return print;
	}

	public static void main(String[] args)
	{
		SingleLinkedList zach = new SingleLinkedList();
		zach.setActionMenu();
		zach.setJMenuBar(zach.menuMB);
   }
}