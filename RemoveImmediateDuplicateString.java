package com.geekster.tests;

public class RemoveImmediateDuplicateString {
	public static void main(String args[]) {
		System.out.println(removeImmediate("abccc"));
	}
	public static String removeImmediate(String str) {
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]==ch[i+1]) {
				char temp = ch[i];
				for(int j=i;j<ch.length;j++) {
					if(ch[j]==temp) {
						ch[j]='0';
					}else {
						break;
					}
				}
			}
		}
		return String.valueOf(ch).replace("0","");
	}
}
