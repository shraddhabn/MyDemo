package com.Ojas;

import java.io.FileInputStream;

public class Example6 {

	public static void main(String[] args) {
	
		try(FileInputStream fis = new FileInputStream("D:\\Seema\\\\Myfile.txt"))
		{
				int k=0;
				while((k=fis.read())!=1)
				{
					System.out.println((char)k);
					
				}
			}
		
			catch(Exception e)
			{
				System.out.println(e);
				
			}
			
			}

}
