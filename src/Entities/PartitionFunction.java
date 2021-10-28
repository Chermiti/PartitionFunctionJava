package Entities;

import java.util.ArrayList;

public class PartitionFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> inputList = new ArrayList<Integer>();
		inputList.add(new Integer(1));
		inputList.add(new Integer(2));
		inputList.add(new Integer(3));
		inputList.add(new Integer(4));
		inputList.add(new Integer(5));
		System.out.println(partition(inputList, 2));
	}
	
	public static ArrayList<ArrayList<Integer>> partition(ArrayList<Integer> liste, Integer taille){
		ArrayList<ArrayList<Integer>> List = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i=0,j=0,k=0;
		while (i<liste.size())
		{
			list.clear();
			for ( j = 0; j < taille; j++) 
			{
				if((j+i)<liste.size())
					list.add(liste.get(i+j));
			}
			List.add((ArrayList<Integer>) list.clone());
			i+=taille;
			k++;
		}
 
		return List;
	}
}
