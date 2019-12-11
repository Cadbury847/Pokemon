package data;

public class DataHandler {

	public static String[] concatenate(String[] list1, String[] list2) {
		
		int newLen = list1.length + list2.length;
		int tempLen = 0;
		String[] tempList = new String[newLen];
		
		for (int i = 0; i < list1.length; i++) {
			tempList[i] = list1[i];
			tempLen += 1;
		}
		
		for (int i = 0; i < list2.length; i++) {
			tempList[i+tempLen] = list2[i];
		}
		
		return tempList;
	}
}
