package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Register {

    WebDriver driver;
    Register_page_object Register;

    @BeforeMethod
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eastpoint\\Desktop\\QA\\Chrome driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        Register = new Register_page_object(driver);
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();

    }

    @Test
    public void Verify_SignUP() {

        Register.clickOnsignUPOrLogin();
        Register.enterName("Jyoti");
        Register.enterEmail("jyotisah357@gmail.com");
        Register.clickOnSignUpButton();
        Register.EnterPassword("Jyoti@7868");
        Register.selectDateOfBirth("20", "June", "2000");
        Register.selectnewsletter();
        Register.selectOffers();
        Register.enterFName("Jyoti");
        Register.enterLName("Sah");
        Register.enterCompany("OIC");
        Register.enteraddress1("Kathmandu");
        Register.enteraddress2("Lalitpur");

        Register.selectOnCountry("Canada");
        Register.enterstate("KTM");
        Register.entercity("PKR");
        Register.enterzipcode("0044");
        Register.enterMobileNumber("9862361366");
        Register.clickOnCreateAccount();
        Register.clickOncontinue();
        /*Register.clickOnDelete();
        Register.clickOnContinue1();*/

    }

    @Test
    public void Verify_Login() {
        Register.clickOnsignUPOrLogin();
        Register.EnterEmail("jyotisah357@gmail.com");
        Register.Enterpassword("Jyoti@7868");
        Register.clickOnLogin();
        //Register.clickOnDelete1();
    }

    @Test
    public void IncorrectLogin() {
        Register.clickOnsignUPOrLogin();
        Register.EnterEmail("jyotisah123@gmail.com");
        Register.Enterpassword("hajhhja");
        Register.clickOnLogin();
    }

    @Test
    public void Verify_Logout() {
        Register.clickOnsignUPOrLogin();
        Register.EnterEmail("jyotisah357@gmail.com");
        Register.Enterpassword("Jyoti@7868");
        Register.clickOnLogin();
        Register.clickOnLogout();
    }

    @Test
    public void SignUp_ExistingEmail() {
        Register.clickOnsignUPOrLogin();
        Register.enterName("Jyoti");
        Register.enterEmail("jyotisah357@gmail.com");
        Register.clickOnSignUpButton();
    }

    @Test
    public void ContactUs() {
        Register.clickOnContactUs();
        Register.EnterName1("Jyoti");
        Register.EnterEmail1("jyotisah357@gmail.com");
        Register.EnterSubject("Refund");
        Register.EnterMessage("I want to refund");
        Register.ChoosePhoto("C:/Users/Eastpoint/Pictures/goldstar-shoes-company-1-320.webp");
        Register.clickOnSubmit();
        Register.clickOnOKButton();
        Register.clickOnHome();
    }

    @Test
    public void TestCase() {
        Register.clickOnTestCases();
    }

    @Test
    public void Verify_Product() {
        Register.clickOnProducts();
        Register.clickOnViewProduct();
    }

    @Test
    public void Search_Product() {
        Register.clickOnProducts();
        Register.clickOnSearchBar();
        Register.EnterSearch("top");
        Register.clickOnSearchButton();
    }

    @Test
    public void Verify_SubscriptionHome() {
        Register.scrollDown();
        Register.scrollDownSmooth();
        Register.EnterSubscriptionEmail("jyotisah357@gmail.com");
        Register.clickOnArrow();


    }

    @Test
    public void Verify_SubscriptionCart() {
        Register.clickOnCartButton();
        Register.EnterSubscriptionEmail("jyotisah357@gmail.com");
        Register.clickOnArrow();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div[1]/div[2]/div/h2"));
        String actualText = element.getText();
        String expectedText = "SUBSCRIPTION";
        Assert.assertEquals(actualText, expectedText, "Text is not present as expected");


    }

    @Test
    public void AddToCart() {
        Register.clickOnProducts();
        Register.scrollDown();
        // Perform more actions
        Register.scrollDownSmooth();
        Register.scrollToProductsSection();
        Register.hoverOverProductAndClickAddToCart1();
        Register.clickOnContinueShopping();
        Register.scrollToProductsSection2();
        Register.hoverOverProductAndClickAddToCart2();
        Register.clickOnContinueShopping();
        Register.clickOnCartButton();
    }

    @Test
    public void VerifyProductquantityinCart() {
        Register.clickOnProducts();
        Register.scrollDown();
        // Perform more actions
        Register.scrollDownSmooth();
        Register.ClickOnViewProduct();
        Register.EnterQuantity("4");
        Register.ClickOnaddTocart();
        Register.clickOnContinueShopping();
        Register.clickOnCartButton();
    }

    @Test
    public void PlaceOrderRegisterwhileCheckout() {
        //same add to cart
        Register.clickOnProducts();
        Register.scrollDown();
        // Perform more actions
        Register.scrollDownSmooth();
        Register.scrollToProductsSection();
        Register.hoverOverProductAndClickAddToCart1();
        Register.clickOnContinueShopping();
        Register.scrollToProductsSection2();
        Register.hoverOverProductAndClickAddToCart2();
        Register.clickOnContinueShopping();
        Register.clickOnCartButton();
        //checkout
        Register.ClickOnCheckOut();
        Register.ClickOnRegisterOrLogin();
        //same register
        Register.enterName("Jyoti");
        Register.enterEmail("jyotisah357@gmail.com");
        Register.clickOnSignUpButton();
        Register.EnterPassword("Jyoti@7868");
        Register.selectDateOfBirth("20", "June", "2000");
        Register.selectnewsletter();
        Register.selectOffers();
        Register.enterFName("Jyoti");
        Register.enterLName("Sah");
        Register.enteraddress1("Kathmandu");
        Register.enteraddress2("Lalitpur");
        Register.enterCompany("OIC");
        Register.selectOnCountry("Canada");
        Register.enterstate("KTM");
        Register.entercity("PKR");
        Register.enterzipcode("0044");
        Register.enterMobileNumber("9862361366");
        Register.clickOnCreateAccount();
        Register.clickOncontinue();

        Register.clickOnCartButton();
        Register.ClickOnCheckOut();
        Register.EnterIntoTextArea("abdjhdsj");
        Register.ClickOnPlaceOrder();

        Register.EnterNameOnCard("Jyoti");
        Register.EnterCardNumber("0202988765448778");
        Register.EnterCVC("123");
        Register.EnterExpirationDate("12");
        Register.EnterExpirationYear("2024");
        Register.ClickPayAndConfirmOrder();
        Register.clickOnDelete();
        Register.clickOncontinue();
    }

    @Test
    public void PlaceOrderRegisterBeforeCheckout() {
        Register.clickOnsignUPOrLogin();
        Register.enterName("Jyoti");
        Register.enterEmail("jyotisah357@gmail.com");
        Register.clickOnSignUpButton();
        Register.EnterPassword("Jyoti@7868");
        Register.selectDateOfBirth("20", "June", "2000");
        Register.selectnewsletter();
        Register.selectOffers();
        Register.enterFName("Jyoti");
        Register.enterLName("Sah");
        Register.enteraddress1("Kathmandu");
        Register.enteraddress2("Lalitpur");
        Register.enterCompany("OIC");
        Register.selectOnCountry("Canada");
        Register.enterstate("KTM");
        Register.entercity("PKR");
        Register.enterzipcode("0044");
        Register.enterMobileNumber("9862361366");
        Register.clickOnCreateAccount();
        Register.clickOncontinue();

        Register.clickOnProducts();
        Register.scrollDown();
        // Perform more actions
        Register.scrollDownSmooth();
        Register.scrollToProductsSection();
        Register.hoverOverProductAndClickAddToCart1();
        Register.clickOnContinueShopping();
        Register.scrollToProductsSection2();
        Register.hoverOverProductAndClickAddToCart2();
        Register.clickOnContinueShopping();
        Register.clickOnCartButton();

        Register.ClickOnCheckOut();
        Register.EnterIntoTextArea("abdjhdsj");
        Register.ClickOnPlaceOrder();

        Register.EnterNameOnCard("Jyoti");
        Register.EnterCardNumber("0202988765448778");
        Register.EnterCVC("123");
        Register.EnterExpirationDate("12");
        Register.EnterExpirationYear("2024");
        Register.ClickPayAndConfirmOrder();
        Register.clickOnDelete();
        Register.clickOncontinue();
    }

    @Test
    public void PlaceOrderLoginbeforeCheckout() {
        Register.clickOnsignUPOrLogin();
        Register.EnterEmail("jyotisah357@gmail.com");
        Register.Enterpassword("Jyoti@7868");
        Register.clickOnLogin();
        Register.clickOnProducts();
        Register.scrollDown();
        // Perform more actions
        Register.scrollDownSmooth();
        Register.scrollToProductsSection();
        Register.hoverOverProductAndClickAddToCart1();
        Register.clickOnContinueShopping();
        Register.scrollToProductsSection2();
        Register.hoverOverProductAndClickAddToCart2();
        Register.clickOnContinueShopping();
        Register.clickOnCartButton();

        Register.ClickOnCheckOut();
        Register.EnterIntoTextArea("abdjhdsj");
        Register.ClickOnPlaceOrder();

        Register.EnterNameOnCard("Jyoti");
        Register.EnterCardNumber("0202988765448778");
        Register.EnterCVC("123");
        Register.EnterExpirationDate("12");
        Register.EnterExpirationYear("2024");
        Register.ClickPayAndConfirmOrder();
        Register.clickOnDelete();
        Register.clickOncontinue();


    }

    @Test
    public void RemoveProductsFromCart() {

        Register.clickOnProducts();
        Register.scrollDown();
        // Perform more actions
        Register.scrollDownSmooth();
        Register.scrollToProductsSection();
        Register.hoverOverProductAndClickAddToCart1();
        Register.clickOnContinueShopping();
        Register.scrollToProductsSection2();
        Register.hoverOverProductAndClickAddToCart2();
        Register.clickOnContinueShopping();
        Register.clickOnCartButton();
        Register.ClickOnXbutton();
        Register.ClickOnXbutton();
    }

    @Test
    public void ViewCategoryProducts() {

        Register.ClickOnWomenCategory();
        Register.ClickOnDress();
        WebElement element = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2"));
        String actualText = element.getText();
        String expectedText = "WOMEN - DRESS PRODUCTS";
        Assert.assertEquals(actualText, expectedText, "Text is not present as expected");
    }

    @Test
    public void ViewAndCartBrandProducts() {
        Register.clickOnProducts();
       /* Register.scrollDown();
        // Perform more actions
        Register.scrollDownSmooth();*/
        Register.ClickOnBrandName();
        Register.ClickOnBrandName1();
    }

    @Test
    public void SearchProductsandVerifyCartAfterLogin() {
        Register.clickOnProducts();
        Register.scrollDown();
        // Perform more actions
        Register.scrollDownSmooth();
        Register.clickOnSearchBar();
        Register.EnterSearch("top");
        Register.clickOnSearchButton();
        Register.scrollDown();
        // Perform more actions
        Register.scrollDownSmooth();
        Register.scrollToProductsSection3();
        Register.hoverOverProductAndClickAddToCart3();
        Register.clickOnContinueShopping();
        Register.scrollToProductsSection4();
        Register.hoverOverProductAndClickAddToCart4();
        Register.clickOnContinueShopping();
        Register.clickOnCartButton();
        Register.clickOnsignUPOrLogin();
        Register.EnterEmail("jyotisah357@gmail.com");
        Register.Enterpassword("Jyoti@7868");
        Register.clickOnLogin();
        Register.clickOnCartButton();
    }

    @Test
    public void AddReviewOnProduct() {
        Register.clickOnProducts();
        Register.clickOnViewProduct();
        Register.scrollDown();
        // Perform more actions
        Register.scrollDownSmooth();
        Register.EnterYourName("Jyoti");
        Register.EnterEmailaddress("jyotisah357@gmail.com");
        Register.EnterAddReview("lovely");
        Register.ClickSubmitButton();
    }

    @Test
    public void AddtoCartfromRecommendedItems() {
        Register.scrollDown();
        // Perform more actions
        Register.scrollDownSmooth();

        WebElement element = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[2]/h2"));
        String actualText = element.getText();
        String expectedText = "RECOMMENDED ITEMS";
        Assert.assertEquals(actualText, expectedText, "Text is not present as expected");

        Register.ClickOnRecommendAddToCart();
        Register.ClickOnViewCart();
    }

    @Test
    public void VerifyAddressDetailsInCheckoutPage() {
        Register.clickOnsignUPOrLogin();
        Register.enterName("Jyoti");
        Register.enterEmail("jyotisah357@gmail.com");
        Register.clickOnSignUpButton();
        Register.EnterPassword("Jyoti@7868");
        Register.selectDateOfBirth("20", "June", "2000");
        Register.selectnewsletter();
        Register.selectOffers();
        Register.enterFName("Jyoti");
        Register.enterLName("Sah");
        Register.enteraddress1("Kathmandu");
        Register.enteraddress2("Lalitpur");
        Register.enterCompany("OIC");
        Register.selectOnCountry("Canada");
        Register.enterstate("KTM");
        Register.entercity("PKR");
        Register.enterzipcode("0044");
        Register.enterMobileNumber("9862361366");
        Register.clickOnCreateAccount();
        Register.clickOncontinue();

        Register.clickOnProducts();
        Register.scrollDown();
        // Perform more actions
        Register.scrollDownSmooth();
        Register.scrollToProductsSection();
        Register.hoverOverProductAndClickAddToCart1();
        Register.clickOnContinueShopping();
        Register.scrollToProductsSection2();
        Register.hoverOverProductAndClickAddToCart2();
        Register.clickOnContinueShopping();
        Register.clickOnCartButton();

        Register.ClickOnCheckOut();
        Register.clickOnDelete();
        Register.clickOncontinue();
    }

    @Test
    public void DownloadInvoiceAfterPurchaseOrder() {
        Register.clickOnProducts();
        Register.scrollDown();
        // Perform more actions
        Register.scrollDownSmooth();
        Register.scrollToProductsSection();
        Register.hoverOverProductAndClickAddToCart1();
        Register.clickOnContinueShopping();
        Register.scrollToProductsSection2();
        Register.hoverOverProductAndClickAddToCart2();
        Register.clickOnContinueShopping();
        Register.clickOnCartButton();
        //checkout
        Register.ClickOnCheckOut();
        Register.ClickOnRegisterOrLogin();
        //same register
        Register.enterName("Jyoti");
        Register.enterEmail("jyotisah357@gmail.com");
        Register.clickOnSignUpButton();
        Register.EnterPassword("Jyoti@7868");
        Register.selectDateOfBirth("20", "June", "2000");
        Register.selectnewsletter();
        Register.selectOffers();
        Register.enterFName("Jyoti");
        Register.enterLName("Sah");
        Register.enteraddress1("Kathmandu");
        Register.enteraddress2("Lalitpur");
        Register.enterCompany("OIC");
        Register.selectOnCountry("Canada");
        Register.enterstate("KTM");
        Register.entercity("PKR");
        Register.enterzipcode("0044");
        Register.enterMobileNumber("9862361366");
        Register.clickOnCreateAccount();
        Register.clickOncontinue();

        Register.clickOnCartButton();
        Register.ClickOnCheckOut();
        Register.EnterIntoTextArea("abdjhdsj");
        Register.ClickOnPlaceOrder();

        Register.EnterNameOnCard("Jyoti");
        Register.EnterCardNumber("0202988765448778");
        Register.EnterCVC("123");
        Register.EnterExpirationDate("12");
        Register.EnterExpirationYear("2024");
        Register.ClickPayAndConfirmOrder();
        Register.ClickOnDownloadInvoice();
        Register.clickOnDelete();
        Register.clickOncontinue();
    }

    @Test
    public void ScrollUpUsingArrow() {
        Register.scrollDown();
        // Perform more actions
        Register.scrollDownSmooth();
        Register.ClickOnScrollUp();
    }

    @Test
    public void ScrollUpWithoutArrow() {
        Register.scrollDown();
        // Perform more actions
        Register.scrollDownSmooth();
        Register.scrollUp();

        try {
            System.out.println("Test Passed");
        } catch (Exception e) {

        }

    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}





