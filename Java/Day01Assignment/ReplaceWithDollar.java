package com.sonata;

public class ReplaceWithDollar {
	public static void main(String args[]) {
		String st= "nomula srikanth";
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				ch[i]='$';
			}
		}
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
	}
}








