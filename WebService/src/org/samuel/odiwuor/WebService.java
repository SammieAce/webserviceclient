package org.samuel.odiwuor;


import com.safaricom.psd.ws.TestWS;
import com.safaricom.psd.ws.TestWS_Service;
import com.safaricom.psd.ws.TransactionResult;


public class WebService {

	public static void hello(){
		String name = "name";
		
		String wakanda = "Wakanda";
		String arsenal = "Arsenal";
		String sgr = "SGR";
		String sudan = "Sudan";
		String safaricom = "Safaricom";


		

		
		TestWS_Service testWS_Service = new TestWS_Service();
		TestWS testWS = testWS_Service.getTestWSPort();
		
		//name
		TransactionResult nameTransactionResult = testWS.hello(name);
		System.out.println(nameTransactionResult.getResponseCode());
		System.out.println(nameTransactionResult.getResponseDesc());
		
		//wakanda
		TransactionResult wakandaTransactionResult = testWS.hello(wakanda);
		System.out.println(wakandaTransactionResult.getResponseCode());
		System.out.println(wakandaTransactionResult.getResponseDesc());
		
		//arsenal
		TransactionResult arsenalTransactionResult = testWS.hello(arsenal);
		System.out.println(arsenalTransactionResult.getResponseCode());
		System.out.println(arsenalTransactionResult.getResponseDesc());
		
		//sgr
		TransactionResult sgrTransactionResult = testWS.hello(sgr);
		System.out.println(sgrTransactionResult.getResponseCode());
		System.out.println(sgrTransactionResult.getResponseDesc());
		
		//sudan
		TransactionResult sudanTransactionResult = testWS.hello(sudan);
		System.out.println(sudanTransactionResult.getResponseCode());
		System.out.println(sudanTransactionResult.getResponseDesc());
		
		//safaricom
		TransactionResult safaricomTransactionResult = testWS.hello(safaricom);
		System.out.println(safaricomTransactionResult.getResponseCode());
		System.out.println(safaricomTransactionResult.getResponseDesc());
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebService.hello();
	}

}
