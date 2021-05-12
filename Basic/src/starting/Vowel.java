package starting;

public class Vowel {
public static void main(String[ ] arg) {
char ch;
String str = "OjasTech";
for(int i=0;i<str.length();i++)
{
ch=str.charAt(i);	
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
System.out.println(ch); 		 
}
}
}
}
