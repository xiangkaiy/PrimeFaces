package primefaces.tutorial.view;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "editor")
public class Test {
	private String value = "This editor is provided by PrimeFaces";
	 
	public String getValue() {
		return value;
	}
 
	public void setValue(String value) {
		this.value = value;
	}
}
