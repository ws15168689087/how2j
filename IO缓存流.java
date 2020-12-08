package how2j;
import java.io.*;
public class IO»º´æÁ÷ {

	public static void removeComments(File javaFile)
	{
		FileReader fr=null;
		BufferedReader br=null;
		FileWriter fw=null;
		PrintWriter pw=null;
		StringBuffer sb=new StringBuffer();
		try
		{
			fr=new FileReader(javaFile);
			br=new BufferedReader(fr);
			while(true)
			{
				String line=br.readLine();
				if(line==null)
				{
					break;
				}
				if(line.trim().length()>0 && !line.trim().startsWith("//"))
				{
					sb.append(line).append("\r\n");
				}
			}
			fw=new FileWriter(javaFile);
			pw=new PrintWriter(fw);
			pw.print(sb);
			pw.flush();
			System.out.println("true!");
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		// TODO Á·Ï°-ÒÆ³ý×¢ÊÍ
		File file=new File("D:\\desktop\\how2j\\IO");
		removeComments(file);
	}
	
}
