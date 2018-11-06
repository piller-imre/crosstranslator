package hu.iit.uni_miskolc.horvath23.Crosstranslator.expressions;

public enum VariableType {
	STRING("string"), INT("int"), DOUBLE("double"), BOOLEAN("boolean"), ARRAY("array"), DICTIONARY("dictionary"), VOID("void");
	
	private String dataType; 
    private VariableType(String dataType) { 
        this.dataType = dataType; 
    } 
    
    @Override 
    public String toString(){ 
        return dataType; 
    } 
}
