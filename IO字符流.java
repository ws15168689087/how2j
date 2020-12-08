package how2j;
import java.io.*;
public class IO字符流 {     // TODO 文件加密
	public static void decodeFile(File decodingFile, File decodedFile)
	{
		try(FileReader fr=new FileReader(decodingFile);
			FileWriter fw=new FileWriter(decodedFile))
		{
			char[]chars=new char[(int)decodingFile.length()];
			fr.read(chars);
			for(int i=0;i<decodingFile.length();i++)
			{
				char c=chars[i];
				if(c=='9')
				{
					c='0';
				}else if(c=='z'||c=='Z')
				{
					c=(char)(c-25);	
				}
				else if(Character.isDigit(c)&&c!='9')
				{
					c=(char)(c+1);
				}
				else if((Character.isLowerCase(c)&&c!='z')||(Character.isUpperCase(c)&&c!='Z'))
				{
					c=(char)(c+1);
				}
				chars[i]=c;
				System.out.print(c);
			}
			fw.write(chars);		
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		// TODO 文件加密
		File decodingFile=new File("D:\\desktop\\how2j\\IO\\decodingFile.txt");
		File decodedFile=new File("D:\\desktop\\how2j\\IO\\decodedFile.txt");
		decodeFile(decodingFile,decodedFile);
	}

}
