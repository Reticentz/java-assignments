public class LinkList
{
	private Node first;

   public LinkList()
	{
   	first = null;
   }

   //Returns true if list is empty
   public boolean isEmpty()
	{
   	return first == null;
   }

   //Inserts a new Link at the first of the list
   public void insert(int d)
	{
   	Node link = new Node(d);
      link.next = first;
      first = link;
   }

   //Deletes the link at the first of the list
   public Node delete()
	{
   	Node temp = first;
      first = first.next;
      return temp;
   }
}