import java.sql.*;
import java.io.*;

class testing {
    
    public static void main(String args[]) throws IOException
        {
        	Assignment2 a2 = new Assignment2();
        	if (a2.connectDB("jdbc:postgresql://mcsdb.utm.utoronto.ca:5432/qamarars_343", "qamarars", "69013") == false) {
        		System.out.println("false");
        		
        	}
        	


        	a2.cancelOrder(7);



        }
    }

