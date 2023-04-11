package Resource;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethod {
	
public static void forloop(List<WebElement> Elements, String y) {
		
		for(WebElement z:Elements) {
			if(z.getText().equalsIgnoreCase(y)) {
				z.click();
				break;
			}
		}}
public static void select(WebElement Element,String value) {
	Select s=new Select(Element);
	s.selectByValue(value);
}
public static void loop(List<WebElement> elements) {
	for(int i=0;i<elements.size();i++) {
		elements.get(i).click();
	}
}
}
