package progSstring;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

public class proj {

	public static void main(String[] args)
	{

		String s1="hi how are shankar kumar";		
		String[] s2 = s1.split(" ");

		for(int i=0;i<s2.length;i++)
		{
			 
			String s3="";
           if(i%2==1)
           {
        	   
        	  for(int j=s2[i].length()-1;j>=0;j--)
        	  {
        		  s3=s3+s2[i].charAt(j);
        		  
        	  }
        	 
        	  System.out.print(" "+s3);
        	   
           }
           else {
          
         System.out.print(s2[i]);
           }
		}



		 



	}

}
