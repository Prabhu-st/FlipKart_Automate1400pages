package JAVAPAKAGE;


		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;

		import java.time.Duration;
		import java.util.ArrayList;
		import java.util.List;

		public class flipkarttest {

			public static void main(String[] args) {
		        // Set up WebDriver

		        WebDriver driver = new ChromeDriver();
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        try {
		            // Open Flipkart
		        	
		            driver.get("https://www.flipkart.com");
		            driver.manage().window().maximize();

		            // Close login popup if appears
		            
		            try {
		            	
		                WebElement closeLogin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'✕')]")));
		                closeLogin.click();
		                
		            } catch (Exception e) {
		                System.out.println("Login popup not found.");
		            }

		            // Navigate to Men's Footwear
		            
		            driver.get("https://www.flipkart.com/mens-footwear/pr?sid=osp,cil");

		            // List to store all products
		            
		            List<String> allProducts = new ArrayList<>();

		            // Loop through all pages
		            
		            while (true) {
		            	
		                // Get all product names
		            	
		                List<WebElement> productElements = driver.findElements(By.cssSelector("a.IRpwTa")); // Product title class

		                for (WebElement product : productElements) {
		                    String productName = product.getText();
		                    allProducts.add(productName);
		                }

		                // Check if "Next" button is available
		                
		                List<WebElement> nextButtons = driver.findElements(By.xpath("//span[text()='Next']"));
		                if (nextButtons.size() > 0) {
		                    nextButtons.get(0).click();
		                    Thread.sleep(3000); // Wait for the next page to load
		                } else {
		                    break; // No more pages
		                }
		            }

		            // Filter Black Shoes
		            
		            System.out.println("Black Shoes Found:");
		            for (String product : allProducts) {
		                if (product.toLowerCase().contains("black")) {
		                    System.out.println(product);
		                }
		            }

		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            driver.quit(); // Close browser
		        }
		    }
		


	}


