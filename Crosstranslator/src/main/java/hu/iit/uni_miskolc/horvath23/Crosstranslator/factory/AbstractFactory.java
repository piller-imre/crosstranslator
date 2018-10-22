package hu.iit.uni_miskolc.horvath23.Crosstranslator.factory;

import hu.iit.uni_miskolc.horvath23.Crosstranslator.expressions.ClassExpression;

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
	
	public abstract NewClass createCass();
}
