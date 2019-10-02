package study.java.testFile;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter URL: ");
		String url = input.nextLine();
		crawler(url);
		
	}
	
	public static void crawler(String startingURL){
		ArrayList<String> listOfPendingURLs = new ArrayList<String>();
		ArrayList<String> listOfTraverseURLs = new ArrayList<String>();
		
		listOfPendingURLs.add(startingURL);
		while (!listOfPendingURLs.isEmpty() && listOfTraverseURLs.size() < 5) {
			String urlString = listOfPendingURLs.remove(0);
			if (!listOfTraverseURLs.contains(urlString)) {
				listOfTraverseURLs.add(urlString);
				System.out.println("Crawl " + urlString);
				for (String s : getSubURLs(urlString)) {
					if (!listOfTraverseURLs.contains(s)) {
						listOfPendingURLs.add(s);
					}
				}
			}
		}
	}
	public static  ArrayList<String> getSubURLs(String urlString) {

		ArrayList<String> list = new ArrayList<String>();
		
		try {
			URL url = new URL(urlString);
			Scanner input = new Scanner(url.openStream());
			int current = 0;
			while(input.hasNext()) {
				String line = input.nextLine();
				current = line.indexOf("http", current);
				while (current>0) {
					int endIndex = line.indexOf("\"", current);
					if(endIndex > 0 ) {
						list.add(line.substring(current,endIndex));
						current = line.indexOf("http:", endIndex);
					}
					else {
						current = -1;
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.getMessage());
		}
		
		return list;
	}
}
