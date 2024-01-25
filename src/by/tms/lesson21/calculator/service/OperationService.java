package by.tms.lesson21.calculator.service;

import by.tms.lesson21.calculator.model.Operation;
public class OperationService {
	public Operation calculate(Operation operation) {
		switch (operation.getOperation()) {
			case "sum":
				double result = operation.getNum1() + operation.getNum2();
				operation.setResult(result);
				return operation;

			case "sub":
				result = operation.getNum1() - operation.getNum2();
				operation.setResult(result);
				return operation;

			case "mul":
				result = operation.getNum1() * operation.getNum2();
				operation.setResult(result);
				return operation;

			case "div":
				if (operation.getNum2() != 0){
					result = operation.getNum1() / operation.getNum2();
					operation.setResult(result);
					return  operation;
				}else{
					System.out.println("You cannot divide by 0");
					throw new ArithmeticException();
				}

			default:
				throw new IllegalArgumentException();
		}
	}
}
