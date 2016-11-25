import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LinkListTest extends JApplet implements ActionListener
{
	 JMenuBar menuMB;
	 JMenu actionM, printM;
	 JMenuItem insertI, deleteI, printFI, printRI, clearI;
    JTextArea listTA;
	 LinkList list;
	 KeyAdapter keyadapt;
	 Node node;
	 
    public void init()
	 {
	 			Container pane = getContentPane();
				setActionMenu();
				list = new LinkList();
				setJMenuBar(menuMB);
				listTA = new JTextArea();
				
				listTA.setText("");
				listTA.setBounds(100, 100, 200, 50);
				pane.add(listTA);
				listTA.addKeyListener(keyadapt);
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
		 
		 menuMB.add(actionM);
		 actionM.add(insertI);
		 actionM.add(deleteI);
		 actionM.add(printM);
		 actionM.add(clearI);
		 printM.add(printFI);
		 //printM.add(printRI);
		 
		 insertI.addActionListener(this);
		 deleteI.addActionListener(this);
		 printFI.addActionListener(this);
		 printRI.addActionListener(this);
		 clearI.addActionListener(this);
	 }
	 
	 public void actionPerformed(ActionEvent e)
	 {
	 	Node currentLink = list.getFirst();
	 	JMenuItem mItem = (JMenuItem) e.getSource();
		int input;
		
		if (mItem == printFI)
		{
			//currentLink = list.getFirst();
			listTA.setText("");
			
			while (currentLink != null)
			{
				listTA.append(currentLink.info + " ");
				currentLink = currentLink.next;
			}
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
					input = Integer.parseInt(JOptionPane.showInputDialog(null, "What number would you like to insert into the list?", "Insert Node", JOptionPane.INFORMATION_MESSAGE));
					list.insert(input);
				}
		
					else if (mItem == deleteI)
					{
						input = Integer.parseInt(JOptionPane.showInputDialog(null, "What number would you like to delete from the list?", "Delete Node", JOptionPane.INFORMATION_MESSAGE));
						list.delete(input);
					}
						else if (mItem == clearI)
						{
							listTA.setText("");
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

   //Inserts a new Link at the first of the list
   public void insert(int d)
	{	
		Node newNode = new Node(d);
		
		if (first == null)
		{
			first = newNode;
			last = newNode;
			current = newNode;
		}
			else if (newNode.info <= first.info)
			{
				newNode.next = first;
				first = newNode;
				current = first;
				
			}
				else if (newNode.info >= last.info)
				{
					last.next = newNode;
					last = newNode;
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
						}	
					}
   }

   public void delete(int d)
	{
		if (first == null)
		{
			JOptionPane.showMessageDialog(null, "There is no list to delete.", "Error", JOptionPane.ERROR_MESSAGE);
		}
			else if (d == first.info)
			{
				first = first.next;
				JOptionPane.showMessageDialog(null, d + " has successfully been removed from the list.", "Success", JOptionPane.PLAIN_MESSAGE);
			}
				else if (d == last.info)
				{
					while (d >= current.next.info)
					{
						current = current.next;
					
					if (d == current.info)
						current.next = current.next.next;
					}
				}
   }
	
	/*public void printList()
	{
		if (first == null)
			JOptionPane.showMessageDialog(null, "No such list exists.", "Error", JOptionPane.ERROR_MESSAGE);
		else
			
	}*/
}