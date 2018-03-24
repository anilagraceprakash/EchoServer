import java.io.*;
import java.net.*;

public class ClientEcho
{
public static void main(String args[]) throws Exception
{
 try 
  {
   int Port;
   BufferedReader Buf =new BufferedReader(newInputStreamReader(System.in));
   System.out.print(" Enter the Port Address : " );
   Port=Integer.parseInt(Buf.readLine());
   Socket sok=new Socket("localhost",Port);
   if(sok.isConnected()==true)
    System.out.println(" Server Socket connected Successfully");
