package qsp;

import java.io.IOException;

public class DemoGeneric {

	public static void main(String[] args) throws IOException {
		FileLib f=new FileLib();
		System.out.println(f.getPropertyData("password"));
		System.out.println(f.getPropertyData("username"));
		System.out.println(f.getPropertyData("url"));
		System.out.println(f.getExcelData("createcustomer", 1, 2));
		f.setExcelData("createcustomer", 1, 1, "skipped");
		

	}

}
