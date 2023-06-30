package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

//import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
		String path=".\\test-data\\Opencart_LoginData.xlsx";//taking xl file from testData
		///EvolvingLove/test-data/Opencart_LoginData.xlsx
		// ./ represent current project directory
		
	Excelutility xlutil=new Excelutility(path);//creating an object for XLUtility
		
	int totalrows=xlutil.getRowCount("Sheet1");	 // to find no of rows
	int totalcols=xlutil.getCellCount("Sheet1",1); // here to find cell number we have to pass sheet name along with the row 
				
String logindata[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
		
		for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
// here we start from row - 1, becuase in excel zero row is for header part 
		{		
		for(int j=0;j<totalcols;j++)  //0    i is rows j is col
		{
		logindata[i-1][j]= xlutil.getCellData("Sheet1",i, j);  //1,0
// here we give i-1 because to avoid memory loss [ in 2-d array we are nt capturing header part , we just avoid the header part in excel sheet 
		//but columns we not need to do
			
			}
		}
	return logindata;//returning two dimension array
				
	}
	
	//DataProvider 2
	
	//DataProvider 3
	
	//DataProvider 4
}

