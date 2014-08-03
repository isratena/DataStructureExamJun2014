package ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


public class UseStructure {


	LinkedList<String> list = new LinkedList<String>();
	ArrayList<String> arrayList = new ArrayList<String>();
	Stack<String> stack = new Stack<String>();
	Queue<String> queue = new LinkedList<String>();

	//add data into the LinkedList
		public void addByLinkedList(String name){
	 
		
         list.add(name);
         System.out.println("list: " + name);
         
         

		}
		//Retrieve data and return the LinkedList
		public List<String> returnByLinkedList(LinkedList<String> name){
			LinkedList<String> ls=name;
			Iterator it = ls.listIterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
					
			 return list;
    }
          //add data into the ArrayList
		public void addByArrayList(String name){
			arrayList.add(name);
			System.out.println("ArrayList: "+ name);
			
}
		//Retrieve data and return the ArrayList
		public ArrayList<String> returnByArrayList(ArrayList<String> name){
			
			ArrayList<String> ls=name;
			Iterator it = ls.listIterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
	        
return arrayList;


		}
		//add data into the Stack
		public void addByStack(String name){
			stack.push(name);
		    
			System.out.println("stack: "+name);}
		
		//Retrieve data and return as Stack order
		public Stack<String> returnByStack(Stack<String> name){

       while(!stack.isEmpty()){
    	   Iterator it = stack.iterator();
		if(it.hasNext())
			System.out.println(it.next());
       }


		//return name;
	return name;}


		
		//add data in Queue order
		public void addByQueue(String name){
			queue.add(name);
			System.out.println("Queue: "+ name);
       }
		//Retrieve data and return in Queue order
		public List<String> returnByQueue(Queue<String> name){
			
			Queue<String> list = name;	

			Iterator<String> itr = queue.iterator();

			while(itr.hasNext())
             {
              System.out.println(itr.next());
           
             return list;
             }



			}

		}
