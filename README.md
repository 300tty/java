字符串实验
========
#实验目的
<br>1.掌握字符串String及其方法的使用\2.掌握异常处理结构<br>
#实验要求
<br>利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：\

1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”\
2.允许提供输入参数，统计古诗中某个字或词出现的次数\
3.考虑操作中可能出现的异常，在程序中设计异常处理程序\<br>
#流程图
![image](https://github.com/300tty/java/blob/master/%E6%8D%95%E8%8E%B711111.jpg)
#实验过程：
<br> 首先让每七个字做一个循环，奇数组后面加逗号，偶数组后面加句号。然后每14个字为一个循环，为换行。然后写、	允许提供输入参数，统计古诗中某个字或词出现的次数。最后计入异常处理<br>
#核心代码：
<br>package Hpp;

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
}\<br>
#实验截图
![image](https://github.com/300tty/java/blob/master/%E6%8D%95%E8%8E%B7234245.jpg)\
#实验心得
<br>我学会了String的使用方法，加强了循环的使用，并且能正确的表达出程序，而且我掌握异常处理结构，能正确的写出程序并且运行。<br>
