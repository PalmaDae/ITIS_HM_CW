package dao;

import java.util.*;
import entity.*;
import database.*;

public class MyRunner {
	public static void main(String[] args) {
		Map<String, Integer> myMap = MyFunctions.mapOfCities();
		
		for (String str : myMap.keySet()) {
			System.out.println(myMap.get(str));
		}
	}
}