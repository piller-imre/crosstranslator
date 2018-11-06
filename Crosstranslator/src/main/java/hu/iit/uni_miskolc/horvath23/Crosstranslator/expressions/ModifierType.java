package hu.iit.uni_miskolc.horvath23.Crosstranslator.expressions;

public enum ModifierType {
	PUBLIC("public"), PRIVATE("private");
	
	private String modifier; 
    private ModifierType(String modifier) { 
        this.modifier = modifier; 
    } 
    
    @Override 
    public String toString(){ 
        return modifier; 
    } 
}
