/*
 * Created By: Dhawal Rank
 * Date: January 23, 2017
 */
public class Node {
	
	public Integer data;
	public Node previous;
	public Node next;
	
	public Node(Integer data){
		this.data = data;
		next = null;
		previous = null;
	}
}
