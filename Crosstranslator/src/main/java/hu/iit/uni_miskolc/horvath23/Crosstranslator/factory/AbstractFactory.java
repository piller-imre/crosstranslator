package hu.iit.uni_miskolc.horvath23.Crosstranslator.factory;

import hu.iit.uni_miskolc.horvath23.Crosstranslator.factory.model.*;

public abstract class AbstractFactory {
	private static final JavaFactory JAVA_CLASS = new JavaFactory();
	private static final PythonFactory PYTHON_CLASS = new PythonFactory();
	
	public static AbstractFactory getFactory(Languages language) {
		AbstractFactory factory = null;
		switch (language) {
			case JAVA:
				factory = JAVA_CLASS;
				break;
			case PYTHON:
				factory = PYTHON_CLASS;
		}
		return factory;
	}
	
	public abstract NewAssignmentExpression createAssignmentExpression();
	public abstract NewBinaryOperator createBinaryOperator();
	public abstract NewBlock createBlock();
	public abstract NewBoolExpression createBoolExpression();
	public abstract NewClassExpression createClassExpression();
	public abstract NewDictionaryElementExpression createDictionaryElementExpression();
	public abstract NewDictionaryExpression createDictionaryExpression();
	public abstract NewDoubleExpression createDoubleExpression();
	public abstract NewFor createFor();
	public abstract NewFunctExpression createFunctExpression();
	public abstract NewFunction createFunction();
	public abstract NewFunctionCallExpression createFunctionCallExpression();
	public abstract NewIf createIf();
	public abstract NewIntExpression createIntExpression();
	public abstract NewModifierType createModifierType();
	public abstract NewProgram createProgram();
	public abstract NewSequenceExpression createSequenceExpression();
	public abstract NewStringExpression createStringExpression();
	public abstract NewSwitch createSwitch();
	public abstract NewUnaryOperator createUnaryOperator();
	public abstract NewVarExpression createvarExpression();
	public abstract NewVariableType createVariableType();
	public abstract NewWhile createWhile();	
}
