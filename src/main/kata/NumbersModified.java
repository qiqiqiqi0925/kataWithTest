package main.kata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class NumbersModified {
	int begin = 1;
	int end=100;
	
	HashMap<Integer, String> toReplace = new HashMap<Integer, String>();;
		
	public NumbersModified(int begin,int end) {
		this.begin=begin;
		this.end=end;
		
		toReplace.put(3, "Foo");
		toReplace.put(5, "Bar");
		toReplace.put(7, "Qix");
	}
	
	public ArrayList<String> printAll(){
		int current = this.begin;
		
		ArrayList<String> listNumbersModified=new ArrayList<String>();
		while(current<=this.end)
		{
			listNumbersModified.add(printNumberModified(current));
			System.out.println(printNumberModified(current));
			current++;
		}	
		
		return listNumbersModified;
	}
	
	public String printNumberModified(int number){
		
		StringBuilder result=new StringBuilder();
		result.append(divisible357(number));
		result.append(contains357(number));
		if(result.length()==0)
			result.append(number);
		return result.toString();			
		
	}		
		
	public String divisible357(int begin){
		Iterator<Entry<Integer, String>> iterToReplace = toReplace.entrySet().iterator();
		String result=new String();
		while (iterToReplace.hasNext()) {
			Map.Entry<Integer, String> entry = iterToReplace.next();
			if(begin%entry.getKey()==0)
				result+=entry.getValue();		
		}
		return result;		
	}
	
	public String contains357(int n){
		String result = new String();
		
		while(n!=0){
			if(toReplace.containsKey(n%10))
				result=toReplace.get(n%10)+result;	
			  n=n/10;
		}	
		return result;		
	}

}
