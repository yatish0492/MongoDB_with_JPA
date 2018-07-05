package com.yatish.pojos;

public class Indian {

	String[] indian;
	
	Indian() {}
	
	Indian(String[] indian) {
		this.indian = indian;
	}

	public String[] getIndian() {
		return indian;
	}

	public void setIndian(String[] indian) {
		this.indian = indian;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Indian) {
			Indian obj1 = (Indian)obj;
			if(obj1.getIndian().equals(this.indian)) {
				return true;
			}
		}
		return false;
	}
}
