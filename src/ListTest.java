import static org.junit.Assert.*;

import org.junit.Test;

public class ListTest {

	 @Test
	    public void testNewLinkedList(){
	        LinkedList singly = new LinkedList();
	        assertTrue(singly.isEmpty());       // linked list should be empty
	        assertEquals(0, singly.size());   // length of linked list should be zero
	        singly.addLast("ABC");
	        assertFalse(singly.isEmpty());     // linked list should not be empty
	        assertEquals(1, singly.size());  // length of linked list should be 1
	    }
	 
	 @Test
	    public void tesLinkedListAdd(){
	        LinkedList singly = new LinkedList();
	        singly.addLast("You ");
	        singly.addLast("are ");
	        singly.addLast("awesome!!");
	        assertFalse(singly.isEmpty());     // linked list should not be empty
	        assertEquals("You are awesome!!", singly.toString());  // length of linked list should be 3
	    }
	 
	 @Test
	 	public void testRemove() {
		
		 	LinkedList list = new LinkedList();
		 	list.addLast("A");
		 	list.addLast("B");
		 	list.addLast("C");
		 	list.addLast("D");
		 	list.addLast("E");
		 	
		 	list.remove(1);
		 	assertEquals("ACDE", list.toString());
		
		 	list.remove(0);
		 	assertEquals("CDE", list.toString());
		 	
		 	list.addLast("F");
		 	assertEquals("CDEF", list.toString());
		 	
		 	list.addFirst("A");
		 	assertEquals("ACDEF", list.toString());
		 	
	 	}

	 @Test
	 	public void testAdd() {
		 
			LinkedList list = new LinkedList();
			list.addLast("A");
			list.addLast("B");
			list.addLast("C");
			list.addLast("E");		 
			 
			list.add("D", 3);
			assertEquals("ABCDE", list.toString());
			 
			list.add("Z", 0);
			assertEquals("ZABCDE", list.toString());
			
	 	}
	 
	 @Test
	 	public void testEmpty() {
		
		    LinkedList list = new LinkedList();
		    list.addFirst("A");
		    assertEquals("A", list.toString());
		    list.remove(0);
		    assertTrue(list.isEmpty());
		    
		    list.addLast("A");
		    assertEquals("A", list.toString());
		    list.remove(0);
		    assertTrue(list.isEmpty());
		    
		    list.add("A", 0);
		    assertEquals("A", list.toString());
		 
	 	}
		 
}
