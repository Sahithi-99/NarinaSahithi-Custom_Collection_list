package com.epam1.custom_list;

public class App 
{
    public static void main( String[] args )
    {
    	Userlist<String> list = new Userlist<>();
    	 
        //adding elements into list
        list.add("honda");
        list.add("yamaha");
        list.add("mahindra");
        System.out.println(list);
         
        //Remove elements from index
        list.remove(2);
        System.out.println(list);
         
        //Get element with index
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
 
        //List Size
        System.out.println(list.size());
    }
}
