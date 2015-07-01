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
	}
}