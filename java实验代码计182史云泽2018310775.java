package Hpp;

public class hpiv
{
	   public static void main(String args[ ])
    {  	
    
    	String sss=args[0];
    	String ss=args[1];
    	String s1="";
    	for(int c=0;c<ddd.length()/7;c++)
    		if(c%2==0)
    			s1=s1+sss.substring(0+7*c,7+7*c)+",";
    		else
    			S1=s1+sss.substring(0+7*c,7+7*c)+"。";
        for(int d=0;d<s1.length()/16;d++)
        	System.out.print(s1.substring(0+16*d,16+16*d)+"\n");        
    				
    	int count = 0;		
		String s2="";		
		int index;		
		while(sss.contains(dd))
		{			
			count++;
		    index = sss.indexOf(ss);
		    S2 = sss.substring(index + ss.length());		
		    sss= s2;			
		}	
		System.out.println("count:" + count);	
    


    }
}