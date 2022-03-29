package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC_2_4_1_PressRoom {
    WebDriver driver;

 public TC_2_4_1_PressRoom(WebDriver driver){
     this.driver=driver;
 }

 public void scrollDown1() {
  JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,300)");
 }

//Xpath of clickable Sub menu
 public By pressroom = By.xpath("/html/body/header/nav[2]/section/section[4]/ul/li[2]/a");
 //This function helps us to find the submenu of main menu. if main menu already click. Then, this function will be implemented to find sub menu.
 public void PressRoom(){
  JavascriptExecutor js = (JavascriptExecutor) driver;
  WebElement PressRoom = driver.findElement(pressroom);
  js.executeScript("arguments[0].scrollIntoView();", PressRoom);
 }

 public void pressRoomClick(){
  driver.findElement(pressroom).click();
 }


 public By post = By.xpath("/html/body/main/div/section[1]/div[2]/div[1]/a/div[2]/h2");
 public void postClick(){
  driver.findElement(post).click();
 }

}


