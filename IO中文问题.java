package how2j;
import java.io.*;
import java.nio.charset.Charset;
public class IO中文问题 { // TODO 练习-数字对应的中文 

	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[]all=new byte[3];
		all[0]=(byte)0xE5;
		all[1]=(byte)0xB1;
		all[2]=(byte)0x8C;
		String str=new String(all,"UTF-8");
		System.out.println("对应字符是:"+str);
	}

}
