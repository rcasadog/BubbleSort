package BubleSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BubleSort
 */
@WebServlet("/BubleSort")
public class BubleSort extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BubleSort() {
        super();
        // TODO Auto-generated constructor stub
    }
    
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**	
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		
        String ordenar = request.getParameter("ordenar") ;
        String cadenaNumeros = request.getParameter("cadenaNumeros") ;
        
        
        String[] arrOfStr = cadenaNumeros.split(",");
        int[] arr = new int[arrOfStr.length]; 
       
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(arrOfStr[i]); 
        }

        if ("CREC".equals(ordenar))
        	
        {  int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                }
              }
          else {
               int n = arr.length; 
               for (int i = 0; i < n-1; i++) 
                   for (int j = 0; j < n-i-1; j++) 
                        if (arr[j] < arr[j+1]) 
                            { 
                                // swap arr[j+1] and arr[i] 
                                int temp = arr[j]; 
                                arr[j] = arr[j+1]; 
                                arr[j+1] = temp; 
                            }
        
                	}	
         	
    	String strArray[] = new String[arr.length];
		
		for (int ai = 0; ai < arr.length; ai++)
			
		  strArray[ai] = String.valueOf(arr[ai]);
    	  PrintWriter out =response.getWriter();	
    	  out.println(Arrays.toString(strArray)); 
    	  out.close(); 
		
	}
	}

