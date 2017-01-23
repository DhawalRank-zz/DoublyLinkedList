/*
 * Created By: Dhawal Rank
 * Date: January 23, 2017
 */
import java.util.Arrays;

public class LinkedList {
	
	private Node header;
	private Node lastnode;
	private int size;
	
	public LinkedList(){
		header = new Node(null);
		lastnode = header;
	}
	
	public void prepend(Integer data){
		Node n = new Node(data);
		if(size == 0){
			n.next = header;
			header.previous = n;
			header = n;
			lastnode.previous = header;
			size++;
		}
		else{
			n.next = header;
			header.previous = n;
			header = n;
			size++;
		}
	}
	
	public void append(Integer data){
		Node n = new Node(data);
		if(size == 0){
			n.next = header;
			header.previous = n;
			header = n;
			lastnode.previous = header;
			size++;
		}
		else{
			n.previous = lastnode.previous;
			lastnode.previous.next = n;
			lastnode.previous = n;
			n.next = lastnode;
			size++;
		}
	}
	
	public int removeFirst(){
		int deletedNode = header.data;
		header = header.next;
		header.previous = null;
		size--;
		return deletedNode;
	}
	
	public int removeLast(){
		int deletedNode = lastnode.previous.data;
		lastnode.previous.previous.next = lastnode;
		lastnode.previous = lastnode.previous.previous;
		size--;
		return deletedNode;
	}
	
	public void insertAt(int index, Integer data){
		if(index == 1)
			prepend(data);
		else if(index == size+1)
			append(data);
		else if(index > size+1 || index == 0){
			throw new NullPointerException("Unable to insert: Index "+index+" Not Found");
		}
		else{
			int count = 1;
			Node n = new Node(data);
			Node temp = header;
			while(count != index-1){
				temp = temp.next;
				count++;
			}
			n.next = temp.next;
			n.previous = temp;
			temp.next.previous = n;
			temp.next = n;
			size++;
		}
	}
	
	public int deleteAt(int index){
		int deletedNode = 0;
		if(index == 1)
			deletedNode = removeFirst();
		else if(index == size)
			deletedNode = removeLast();
		else if(index > size || index == 0)
			throw new NullPointerException("Unable to delete: Index "+index+" Not Found");
		else{
			int count = 1;
			Node temp = header;
			while(count < index){
				temp = temp.next;
				count++;
			}
			deletedNode = temp.data;
			temp.previous.next = temp.next;
			temp.next.previous = temp.previous;
			size--;
		}
		return deletedNode;
	}
	
	public LinkedList getSortedList(){
		LinkedList sortedList = new LinkedList();
		Node n = header;
		int i = 0;
		Integer a[] = new Integer[size];
		while(i != size){
			a[i] = n.data;
			i++;
			n = n.next;
		}
		Arrays.sort(a);
		i = 0;
		while(i < a.length){
			sortedList.append(a[i]);
			i++;
		}
		return sortedList;
	}
	
	public String toString(){
		String temp = "";
		Node n = header;
		while(n != null){
			temp = temp + n.data + " ";
			n = n.next;
		}
		return temp;
	}
	public int getSize(){
		return size;
	}
}
