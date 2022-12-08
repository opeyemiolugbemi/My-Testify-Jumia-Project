import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import javax.enterprise.inject.Stereotype;

public class MyTestifyJumiaProject {

        //Import selenium webdriver
        private WebDriver driver;

        @BeforeTest
        public void start() throws InterruptedException {
//Locate where chrome driver is
                System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

                //Import chrome driver
                driver = new ChromeDriver();
                //Open your selected app URL
                driver.get("https://www.jumia.com.ng/");
                //Maximize the window
                driver.manage().window().maximize();
        }

        @Test (priority = 0)
                public void correctDetails() throws InterruptedException {
                //Click on Account
                driver.findElement(By.xpath("/html/body/div[1]/header/section/div[2]/div[1]/label")).click();
                Thread.sleep(5000);
                //Click on the sign-in/log in button
                driver.findElement(By.xpath("/html/body/div[1]/header/section/div[2]/div[1]/div/div/div/a")).click();
                //Input your email address
                driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[2]/label/input")).sendKeys("akintadeopeyemi05@gmail.com");
                //Click Continue Button
                driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[3]/div/button/span[3]")).click();
                //Input your password
                driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[3]/label/input")).sendKeys("opeyemi1992");
                //Click on the Sign in/login/Continue button
                driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[4]/div/button/span[3]")).click();
                Thread.sleep(1000);
                //Logout from the account, click on User profile
                driver.findElement(By.xpath("/html/body/div[1]/header/section/div[2]/div[1]/label")).click();
                //Then click on Logout
                driver.findElement(By.xpath("/html/body/div[1]/header/section/div[2]/div[1]/div/div/form/button")).click();
        }


        @Test (priority = 1)
                 // Verify that user can not signin with invalid Email
        public void wrongEmail() throws InterruptedException {

                //Click on Account
                driver.findElement(By.xpath("/html/body/div[1]/header/section/div[2]/div[1]/label")).click();

                Thread.sleep(5000);
                //Click on the sign-in/log in button
                driver.findElement(By.xpath("/html/body/div[1]/header/section/div[2]/div[1]/div/div/div/a")).click();
                //Input your email address
                driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[2]/label/input")).sendKeys("lekkimusictutors@gmail.com");
                //Click Continue Button
                driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[3]/div/button/span[3]")).click();
                //Input your password
                driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[3]/label/input")).sendKeys("opeyemi1992");
                //Click on the Sign in/login/Continue button
                driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[4]/div/button/span[3]")).click();
                Thread.sleep(5000);

        }

        @Test (priority = 2)
        // Verify that user can not Signin with wrong password
        public void wrongPassword() throws InterruptedException {
                //Get back to home page
                driver.get("https://www.jumia.com.ng/");
                //Click on Account
                driver.findElement(By.xpath("/html/body/div[1]/header/section/div[2]/div[1]/label")).click();
                Thread.sleep(5000);
                //Click on the sign-in/log in button
                driver.findElement(By.xpath("/html/body/div[1]/header/section/div[2]/div[1]/div/div/div/a")).click();
                //Input your email address
                driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[2]/label/input")).sendKeys("akintadeopeyemi05@gmail.com");
                //Click Continue Button
                driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[3]/div/button/span[3]")).click();
                //Input your password
                driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[3]/label/input")).sendKeys("torpolg1");
                //Click on the Sign in/login/Continue button
                driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[4]/div/button/span[3]")).click();
                Thread.sleep(1000);

        }


        @AfterTest
        public void closeBrowser() {
                //Quit Browser
                driver.quit();
        }


}

