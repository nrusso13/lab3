package pkgPokerException;

import pkgPokerBLL.Hand;

public class HandException extends Exception {
	private Hand ErrorHand;
	public HandException(Hand ErrorHand){
		this.ErrorHand=ErrorHand;
		
	}
	public Hand getErrorHand(){
		return ErrorHand;
	}
	
	
	

}