package com.rule.main;

import com.rule.runner.RuleRunner;
import com.test.model.DecisionString;

public class MainApp {

	public static void main(String[] args) throws Exception{

		//Number[] number = new Number[]{wrap(3), wrap(1), wrap(4), wrap(1), wrap(5)};
		//new RuleRunner().runRules(new String[]{"Example.drl"}, new Object[0]);
		//new RuleRunner().runRules(new String[]{"Example.drl"}, number);
		/*Object[] cashFlow = {
				new CashFlow(new SimpleDate("01/01/2007"), 300),
				new CashFlow(new SimpleDate("01/05/2007"), 100),
				new CashFlow(new SimpleDate("06/01/2007"), 3000),
				new CashFlow(new SimpleDate("06/07/2007"), 3),
				new CashFlow(new SimpleDate("02/06/2007"), 30),
				new CashFlow(new SimpleDate("03/08/2007"), 38)
		};*/
		/*Object[] typedCashFlow = {
				new TypedCashFlow(new SimpleDate("01/01/2007"),TypedCashFlow.CREDIT, 300),
				new TypedCashFlow(new SimpleDate("01/05/2007"),TypedCashFlow.CREDIT, 100),
				new TypedCashFlow(new SimpleDate("06/01/2007"),TypedCashFlow.CREDIT, 3000),
				new TypedCashFlow(new SimpleDate("06/07/2007"),TypedCashFlow.CREDIT, 3),
				new TypedCashFlow(new SimpleDate("02/06/2007"),TypedCashFlow.DEBIT, 30),
				new TypedCashFlow(new SimpleDate("03/08/2007"),TypedCashFlow.DEBIT, 38)
		};*/
		
		/*Account ac1 = new Account(1);
		Account ac2 = new Account(2);
		
		Object[] allocatedCashFlow = {
				new AllocatedCashFlow(ac1,new SimpleDate("01/01/2007"),TypedCashFlow.CREDIT, 300),
				new AllocatedCashFlow(ac1, new SimpleDate("01/05/2007"),TypedCashFlow.CREDIT, 100),
				new AllocatedCashFlow(ac2, new SimpleDate("06/01/2007"),TypedCashFlow.CREDIT, 3000),
				new AllocatedCashFlow(ac1, new SimpleDate("06/07/2007"),TypedCashFlow.CREDIT, 3),
				new AllocatedCashFlow(ac2, new SimpleDate("02/06/2007"),TypedCashFlow.DEBIT, 30),
				new AllocatedCashFlow(ac2, new SimpleDate("03/08/2007"),TypedCashFlow.DEBIT, 38)
		};*/
		DecisionString decisionString = new DecisionString(66, 10, 66, 5, 70);
		
		/*decisionString.setClientAge(60);
		decisionString.setGreaterThreshold(66);
		decisionString.setGreaterThresholdValue(5);
		decisionString.setLessThreshold(68);
		decisionString.setLessThresholdValue(10);*/
		
		Object[] facts = {decisionString};
		new RuleRunner().runRules(new String[]{"Example.drl"}, facts);
		System.out.println(decisionString.getReturnAge());
	}
	
	
	private static Integer wrap(int i){
		return new Integer(i);
	}

}
