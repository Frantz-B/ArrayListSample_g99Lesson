import java.util.ArrayList;

class ArrayListSample{
	public static void main(String[] args){
		ArrayList<String> sampleList = new ArrayList<String>();
		//was recommended to put the argument type '<String>'
		System.out.println("Whats in my Array now :"+sampleList.size());
		sampleList.add("Keep");
		sampleList.add("Moving");
		sampleList.add("Period");
		System.out.println("\n\nUpdate to my list contains :"+sampleList);
		sampleList.add(2 , "Forward");
		System.out.println("\n\nNow for a complete sentance :"+sampleList);
		//I can add a remove() method but concept of this drove home
		//What was very interested was the ArrayList from http://www.dotnetperls.com/arraylist-java
		// where it was parameterized with a custom class 'Philosopher' which was really cool.
	}
}