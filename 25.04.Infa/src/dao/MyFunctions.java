package dao;

import java.util.*;
import entity.*;
import database.*;

public class MyFunctions {
	private static Database dbase = new Database();
	public static ArrayList<User> listUsers = dbase.getUsers();  
	private static ArrayList<Subscriptions> listSubscriptions = dbase.getSubs();  
	private static ArrayList<Group> listGroups = dbase.getGroups();  
	private static ArrayList<Message> listMessages = dbase.getMessages();
	private static ArrayList<Member> listOfMembers = dbase.getMembers();
	//27 страница
}
