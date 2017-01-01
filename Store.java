//*************************************
// Name: Wan Yu Fung (Alice)
// UNI: wf2193
//
// Store (class)
//	
// Description: costumerList is ArrayList of People
//				stores value of the largest purcahse
//				count = count of the largest costumer 
//				BestCostumerName gets the value of getPurchse and compares it to max 
//**************************************

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Store {
	private ArrayList<People> costumerList;
	
	public Store ()
	{
			costumerList = new ArrayList<People>(); //cosList.get
			
	}
	
	
	public String nameOfBestCostumer()
	{
		double max = costumerList.get(0).getPurchase();
		int count = 0;
		for(int i = 0; i < costumerList.size(); i++)
			{
			     if(costumerList.get(i).getPurchase() > max)
			     {
			        max = costumerList.get(i).getPurchase();
			     	count = i;
			     }
			}
		return costumerList.get(count).getName();
	}

	public void addSale(String name1, double money) 
	{
		costumerList.add ( new People(name1, money));
	}
	
	   
}
