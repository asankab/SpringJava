package test.com;

public enum PublishingEnviorenments {
	
	PROD("PROD"),
    PAFPRDO("PAF PRDO");
    
	private final String value;
	
	PublishingEnviorenments(String val){
		value = val;
	}
	
	public String getValue() {
		return value;
	}
}
