import java.util.*;

enum Operation
{
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}
public class Test1 {

    public static double basicCalculator(final Operation operation, final int num1, final int num2){
        double result = 0;
	
	if ( operation == Operation.ADD ) {
		result = num1 + num2;
	} 
	
	if ( operation == Operation.SUBTRACT ) {
		result = num1 - num2;
	}

	if ( operation == Operation.MULTIPLY ) {
		result = num1 * num2;
	}

	if ( operation == Operation.DIVIDE ) {
		if ( num2 == 0 ) {
			System.out.println("can't divide by 0");
		} else {
			result = ((double)num1) / num2;
		}
	}


        return result;
    }

    public static void main(final String[] args) {
        System.out.println(basicCalculator(Operation.DIVIDE, 1, 2));
    }
}
