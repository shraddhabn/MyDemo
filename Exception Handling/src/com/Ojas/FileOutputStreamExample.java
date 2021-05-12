package com.Ojas;

import java.io.FileOutputStream;

public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\Seema\\Myfile.txt");    
             fout.write(0);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  