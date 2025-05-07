package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperUser extends HelperBase {

    public HelperUser(WebDriver wd) {super(wd);

        }

        public void openLodinRegistrationForm(){
           // WebElement LoginTab = wd.findElement(By.xpath("//a[text()='LOGIN']"));
//            WebElement LoginTab = wd.findElement(By.cssSelector("a[href='/login']"));
//            LoginTab.click();
            click(By.xpath("//a[text()='LOGIN']"));


        }

        public void fillLoginRegistrationForm(String login,String password){
//        WebElement emailInpyt = wd.findElement(By.name("email"));
//        emailInpyt.click();
//        emailInpyt.clear();
//        emailInpyt.sendKeys(email);
//
            type(By.name("email"),email);
//        WebElement passwordInput = wd.findElement(By.xpath("//input[last()]"));
//        passwordInput.click();
//        passwordInput.clear();
//        passwordInput.sendKeys(password);
        type(By.xpath("//input[last()]"),password);

        }
        public void submitLogin(){
        click(By.xpath("//button[text()='Login']"));
        }
}
