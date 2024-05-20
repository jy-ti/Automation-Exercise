package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register_page_object {
    WebDriver driver;
    WebDriverWait wait;

    public Register_page_object(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10); // Initialize WebDriverWait
        PageFactory.initElements(driver, this);
    }
                             //SignUP
    @FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    WebElement signUP;

    public void clickOnsignUPOrLogin() {

        wait.until(ExpectedConditions.elementToBeClickable(signUP)).click();
    }
    @FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
    WebElement name;
    public void enterName(String value){
        wait.until(ExpectedConditions.elementToBeClickable(name)).sendKeys(value);
    }
    @FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
    WebElement email;

    public void enterEmail(String value){
        wait.until(ExpectedConditions.elementToBeClickable(email)).sendKeys(value);
    }

    @FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/button")
    WebElement SignUpButton;
    public void clickOnSignUpButton(){
        wait.until(ExpectedConditions.elementToBeClickable(SignUpButton)).click();
    }
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement Password;

    public void EnterPassword(String value){
        wait.until(ExpectedConditions.elementToBeClickable(Password)).sendKeys(value);
    }

    @FindBy(xpath = "//*[@id=\"days\"]")
    WebElement dayDropdown;
    @FindBy(xpath = "//*[@id=\"months\"]")
    WebElement monthDropdown;
    @FindBy(xpath = "//*[@id=\"years\"]")
    WebElement yearDropdown;
    public void selectDateOfBirth(String day, String month, String year){
        wait.until(ExpectedConditions.elementToBeClickable(dayDropdown)).sendKeys(day);
        wait.until(ExpectedConditions.elementToBeClickable(monthDropdown)).sendKeys(month);
        wait.until(ExpectedConditions.elementToBeClickable(yearDropdown)).sendKeys(year);
    }

    @FindBy(xpath="//*[@id=\"newsletter\"]")
    WebElement newsletter;
    public void selectnewsletter(){
        wait.until(ExpectedConditions.elementToBeClickable(newsletter)).click();

    }
    @FindBy(xpath="//*[@id=\"optin\"]")
    WebElement offers;
    public void selectOffers(){
        wait.until(ExpectedConditions.elementToBeClickable(offers)).click();

    }
   @FindBy(id="first_name")
    WebElement fname;

    public void enterFName(String value){
        wait.until(ExpectedConditions.elementToBeClickable(fname)).sendKeys(value);
    }
    @FindBy(id="last_name")
    WebElement lname;
    public void enterLName(String value){
        wait.until(ExpectedConditions.elementToBeClickable(lname)).sendKeys(value);
    }
    @FindBy(id="company")
    WebElement company;
    public void enterCompany(String value){
        wait.until(ExpectedConditions.elementToBeClickable(company)).sendKeys(value);
    }
    @FindBy(id="address1")
    WebElement address1;
    public void enteraddress1(String value){
        wait.until(ExpectedConditions.elementToBeClickable(address1)).sendKeys(value);
    }
    @FindBy(id="address2")
    WebElement address2;
    public void enteraddress2(String value){
        wait.until(ExpectedConditions.elementToBeClickable(address2)).sendKeys(value);
    }
    @FindBy(id="country")
    WebElement country;
    public void selectOnCountry(String value) {
        wait.until(ExpectedConditions.elementToBeClickable(country)).sendKeys(value);
    }
    @FindBy(id="state")
    WebElement state;
    public void enterstate(String value){
        wait.until(ExpectedConditions.elementToBeClickable(state)).sendKeys(value);
    }
    @FindBy(id="city")
    WebElement city;
    public void entercity(String value){
        wait.until(ExpectedConditions.elementToBeClickable(city)).sendKeys(value);
    }
    @FindBy(id="zipcode")
    WebElement zipcode;

    public void enterzipcode(String value){
        wait.until(ExpectedConditions.elementToBeClickable(zipcode)).sendKeys(value);
    }
    @FindBy(id="mobile_number")
    WebElement mobile_number;

    public void enterMobileNumber(String value){
        wait.until(ExpectedConditions.elementToBeClickable(mobile_number)).sendKeys(value);
    }

    @FindBy(xpath="//*[@id=\"form\"]/div/div/div/div[1]/form/button")
    WebElement CreateAccount;
    public void clickOnCreateAccount(){
        wait.until(ExpectedConditions.elementToBeClickable(CreateAccount)).click();
    }

    @FindBy(xpath="//*[@id=\"form\"]/div/div/div/div/a")
    WebElement Continue;
    public void clickOncontinue(){
        wait.until(ExpectedConditions.elementToBeClickable(Continue)).click();
    }
    @FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    WebElement Delete;
    public void clickOnDelete(){
        wait.until(ExpectedConditions.elementToBeClickable(Delete)).click();
    }
    @FindBy(xpath="//*[@id=\"form\"]/div/div/div/div/a")
    WebElement Continue1;
    public void clickOnContinue1(){
        wait.until(ExpectedConditions.elementToBeClickable(Continue1)).click();
    }
                  //Login and logout

    @FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")
    WebElement enterEmail;

    public void EnterEmail(String value){
        wait.until(ExpectedConditions.elementToBeClickable(enterEmail)).sendKeys(value);
    }
    @FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")
    WebElement EnterPassword;

    public void Enterpassword(String value){
        wait.until(ExpectedConditions.elementToBeClickable(EnterPassword)).sendKeys(value);
    }

    @FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/button")
    WebElement Login;
    public void clickOnLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(Login)).click();
    }
    @FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    WebElement Delete1;
    public void clickOnDelete1(){
        wait.until(ExpectedConditions.elementToBeClickable(Delete1)).click();
    }

    @FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    WebElement Logout;
    public void clickOnLogout(){
        wait.until(ExpectedConditions.elementToBeClickable(Logout)).click();
    }

                             // ContactUS

    @FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a")
    WebElement ContactUs;
    public void clickOnContactUs(){
        wait.until(ExpectedConditions.elementToBeClickable(ContactUs)).click();
    }
    @FindBy(xpath="//*[@id=\"contact-us-form\"]/div[1]/input")
    WebElement name1;

    public void EnterName1(String value){
        wait.until(ExpectedConditions.elementToBeClickable(name1)).sendKeys(value);
    }
    @FindBy(xpath="//*[@id=\"contact-us-form\"]/div[2]/input")
    WebElement Email1;

    public void EnterEmail1(String value){
        wait.until(ExpectedConditions.elementToBeClickable(Email1)).sendKeys(value);
    }
    @FindBy(xpath="//*[@id=\"contact-us-form\"]/div[3]/input")
    WebElement Subject;

    public void EnterSubject(String value){
        wait.until(ExpectedConditions.elementToBeClickable(Subject)).sendKeys(value);
    }
    @FindBy(xpath="//*[@id=\"message\"]")
    WebElement Message;

    public void EnterMessage(String value){
        wait.until(ExpectedConditions.elementToBeClickable(Message)).sendKeys(value);
    }
    @FindBy(xpath="//*[@id=\"contact-us-form\"]/div[5]/input")
    WebElement ChoosePhoto;
    public void ChoosePhoto(String filePath){
        wait.until(ExpectedConditions.elementToBeClickable(ChoosePhoto)).sendKeys(filePath);
    }
    @FindBy(xpath="//*[@id=\"contact-us-form\"]/div[6]/input")
    WebElement Submit;
    public void clickOnSubmit(){
        wait.until(ExpectedConditions.elementToBeClickable(Submit)).click();
    }
    @FindBy(xpath="//*[@id=\"form-section\"]/a")
    WebElement OkButton;
    public void clickOnOKButton(){
        wait.until(ExpectedConditions.elementToBeClickable(OkButton)).click();
    }
    @FindBy(xpath="//*[@id=\"form-section\"]/a/span")
    WebElement HomeButton;
    public void clickOnHome(){
        wait.until(ExpectedConditions.elementToBeClickable(HomeButton)).click();
    }
    @FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    WebElement TestCases;
    public void clickOnTestCases(){
        wait.until(ExpectedConditions.elementToBeClickable(TestCases)).click();
    }
    @FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
    WebElement Products;
    public void clickOnProducts(){
        wait.until(ExpectedConditions.elementToBeClickable(Products)).click();
    }
    @FindBy(xpath="/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")
    WebElement ViewProducts;
    public void clickOnViewProduct(){
        wait.until(ExpectedConditions.elementToBeClickable(ViewProducts)).click();
    }
    @FindBy(xpath="//*[@id=\"search_product\"]")
    WebElement Search;
    public void clickOnSearchBar(){
        wait.until(ExpectedConditions.elementToBeClickable(Search)).click();
    }
    public void EnterSearch(String value){
        wait.until(ExpectedConditions.elementToBeClickable(Search)).sendKeys(value);
    }
    @FindBy(xpath="//*[@id=\"submit_search\"]")
    WebElement SearchButton;
    public void clickOnSearchButton(){
        wait.until(ExpectedConditions.elementToBeClickable(SearchButton)).click();
    }
              //Subscription Home

    @FindBy(xpath="//*[@id=\"susbscribe_email\"]")
    WebElement Subscription;
    public void EnterSubscriptionEmail(String value){
        wait.until(ExpectedConditions.elementToBeClickable(Subscription)).sendKeys(value);
    }
    @FindBy(xpath="//*[@id=\"subscribe\"]/i")
    WebElement SubscriptionArrow;
    public void clickOnArrow(){
        wait.until(ExpectedConditions.elementToBeClickable(SubscriptionArrow)).click();
    }
               //subscription Cart
    @FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
    WebElement Cart;
    public void clickOnCartButton(){
        wait.until(ExpectedConditions.elementToBeClickable(Cart)).click();
    }
    //Add to Cart
    //click on product same
    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
    }
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollDownSmooth() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");

        while (true) {
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {
                Thread.sleep(2000); // Wait for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long newHeight = (Long) js.executeScript("return document.body.scrollHeight");
            if (newHeight == lastHeight) {
                break;
            }
            lastHeight = newHeight;
        }
    }

    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/img")
     WebElement productsSection;
    public void scrollToProductsSection() {
        Actions actions = new Actions(driver);
        actions.moveToElement(productsSection);
        actions.perform();
    }
    public void hoverOverProductAndClickAddToCart1() {
        Actions actions = new Actions(driver);
        actions.moveToElement(productsSection).perform();
        WebElement addToCartButton = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a"));
        addToCartButton.click();
    }

    @FindBy(xpath="//*[@id=\"cartModal\"]/div/div/div[3]/button")
    WebElement ContinueShopping;
    public void clickOnContinueShopping(){
        wait.until(ExpectedConditions.elementToBeClickable(ContinueShopping)).click();
    }
    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[1]/img")
    WebElement productsSection2;
    public void scrollToProductsSection2() {
        Actions actions = new Actions(driver);
        actions.moveToElement(productsSection2);
        actions.perform();
    }
    public void hoverOverProductAndClickAddToCart2() {
        Actions actions = new Actions(driver);
        actions.moveToElement(productsSection2).perform();
        WebElement addToCartButton = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[2]/div/a"));
        addToCartButton.click();
    }
                //continue shoppoing same
                //click on cart same

                                   //Verify Product quantity in Cart
   @FindBy(xpath ="/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a" )
   WebElement ViewProduct;
    public void ClickOnViewProduct(){
        wait.until(ExpectedConditions.elementToBeClickable(ViewProduct)).click();

    }
    @FindBy(xpath = "//*[@id=\"quantity\"]")
    WebElement AddQuantity;
    public void EnterQuantity(String value) {
        wait.until(ExpectedConditions.elementToBeClickable(AddQuantity)) ;
        AddQuantity.clear(); // Clear the input field
        AddQuantity.sendKeys(value);
    }
    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")
    WebElement addTocart;
    public void ClickOnaddTocart(){
        wait.until(ExpectedConditions.elementToBeClickable(addTocart)).click();

    }
                               //PlaceOrder
    @FindBy(xpath = "//*[@id=\"do_action\"]/div[1]/div/div/a")
    WebElement CheckOut;

    public void ClickOnCheckOut(){
        wait.until(ExpectedConditions.elementToBeClickable(CheckOut)).click();
    }
    @FindBy(xpath = "//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u")
    WebElement RegisterOrLogin;
    public void ClickOnRegisterOrLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(RegisterOrLogin)).click();
    }

    @FindBy(xpath = "//*[@id=\"ordermsg\"]/textarea")
    WebElement Textarea;
    public void EnterIntoTextArea(String value){
        wait.until(ExpectedConditions.elementToBeClickable(Textarea)).sendKeys(value);
    }
    @FindBy(xpath = "//*[@id=\"cart_items\"]/div/div[7]/a")
    WebElement PlaceOrder;
    public void ClickOnPlaceOrder(){
        wait.until(ExpectedConditions.elementToBeClickable(PlaceOrder)).click();
    }
    @FindBy(xpath = "//*[@id=\"payment-form\"]/div[1]/div/input")
    WebElement NameOncard;
    public void EnterNameOnCard(String value){
        wait.until(ExpectedConditions.elementToBeClickable(NameOncard)).sendKeys(value);
    }

    @FindBy(xpath = "//*[@id=\"payment-form\"]/div[2]/div/input")
    WebElement CardNumber;
    public void EnterCardNumber(String value){
        wait.until(ExpectedConditions.elementToBeClickable(CardNumber)).sendKeys(value);
    }
    @FindBy(xpath = "//*[@id=\"payment-form\"]/div[3]/div[1]/input")
    WebElement CVC;
    public void EnterCVC(String value){
        wait.until(ExpectedConditions.elementToBeClickable(CVC)).sendKeys(value);
    }
    @FindBy(xpath = "//*[@id=\"payment-form\"]/div[3]/div[2]/input")
    WebElement ExpirationDate;
    public void EnterExpirationDate(String value){
        wait.until(ExpectedConditions.elementToBeClickable(ExpirationDate)).sendKeys(value);
    }
    @FindBy(xpath = "//*[@id=\"payment-form\"]/div[3]/div[3]/input")
    WebElement ExpirationYear;
    public void EnterExpirationYear(String value){
        wait.until(ExpectedConditions.elementToBeClickable(ExpirationYear)).sendKeys(value);
    }
    @FindBy(xpath = "//*[@id=\"submit\"]")
    WebElement PayAndConfirmOrder;
    public void ClickPayAndConfirmOrder(){
        wait.until(ExpectedConditions.elementToBeClickable(PayAndConfirmOrder)).click();
    }

                      //PlaceOrderRegisterBeforeCheckout same all methods.........15
                      // PlaceOrderLoginbeforeCheckout  same....................16
                       //RemoveProductsFromCart.......17
    @FindBy(xpath = "//*[@id=\"product-2\"]/td[6]/a")
    WebElement XButton;
    public void ClickOnXbutton(){
        wait.until(ExpectedConditions.elementToBeClickable(XButton)).click();
    }

                        //ViewCategoryProducts........18
    @FindBy(xpath = "//*[@id=\"accordian\"]/div[1]/div[1]/h4/a")
    WebElement WomenCategory;
    public void ClickOnWomenCategory(){
        wait.until(ExpectedConditions.elementToBeClickable(WomenCategory)).click();
    }
    @FindBy(xpath = "//*[@id=\"Women\"]/div/ul/li[1]/a")
    WebElement Dress;
    public void ClickOnDress(){
        wait.until(ExpectedConditions.elementToBeClickable(Dress)).click();
    }

                            // ViewAndCartBrandProducts........19
    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[1]/div[1]/div[3]/div/ul/li[1]/a")
    WebElement BrandName;
    public void ClickOnBrandName(){
        wait.until(ExpectedConditions.elementToBeClickable(BrandName)).click();
    }
    @FindBy(xpath = "/html/body/section/div/div[2]/div[1]/div/div[2]/div/ul/li[2]/a")
    WebElement BrandName1;
    public void ClickOnBrandName1(){
        wait.until(ExpectedConditions.elementToBeClickable(BrandName1)).click();
    }

    ////////////////SearchProductsandVerifyCartAfterLogin..............20
    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/img")
    WebElement productsSection3;
    public void scrollToProductsSection3() {
        Actions actions = new Actions(driver);
        actions.moveToElement(productsSection3);
        actions.perform();
    }
    public void hoverOverProductAndClickAddToCart3() {
        Actions actions = new Actions(driver);
        actions.moveToElement(productsSection3).perform();
        WebElement addToCartButton = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a"));
        addToCartButton.click();
    }
    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/img")
    WebElement productsSection4;
    public void scrollToProductsSection4() {
        Actions actions = new Actions(driver);
        actions.moveToElement(productsSection4);
        actions.perform();
    }
    public void hoverOverProductAndClickAddToCart4() {
        Actions actions = new Actions(driver);
        actions.moveToElement(productsSection4).perform();
        WebElement addToCartButton = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[2]/div/a"));
        addToCartButton.click();
    }
     //////////////////////AddReviewOnProduct.......21
    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement YourName;
    public void EnterYourName(String value){
        wait.until(ExpectedConditions.elementToBeClickable(YourName)).sendKeys(value);
    }
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement Emailaddress;
    public void EnterEmailaddress(String value){
        wait.until(ExpectedConditions.elementToBeClickable(Emailaddress)).sendKeys(value);
    }
    @FindBy(xpath = "//*[@id=\"review\"]")
    WebElement AddReview;
    public void EnterAddReview(String value){
        wait.until(ExpectedConditions.elementToBeClickable(AddReview)).sendKeys(value);
    }
    @FindBy(xpath = "//*[@id=\"button-review\"]")
    WebElement SubmitButton;
    public void ClickSubmitButton(){
        wait.until(ExpectedConditions.elementToBeClickable(SubmitButton)).click();
    }
    //////////////////////RecomendedAddToCart......22

    @FindBy(xpath = "//*[@id=\"recommended-item-carousel\"]/div/div[2]/div[1]/div/div/div/a")
    WebElement RecommendAddToCart;
    public void ClickOnRecommendAddToCart(){
        wait.until(ExpectedConditions.elementToBeClickable(RecommendAddToCart)).click();
    }
    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")
    WebElement ViewCart;
    public void ClickOnViewCart(){
        wait.until(ExpectedConditions.elementToBeClickable(ViewCart)).click();
    }
    ////////////////////////Verify address details in checkout page...23
   /////////////////// Download Invoice after purchase order.........24
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/a")
    WebElement DownloadInvoice;
    public void ClickOnDownloadInvoice(){
        wait.until(ExpectedConditions.elementToBeClickable(DownloadInvoice)).click();
    }
    /////////////////////...........Verify Scroll Up using 'Arrow' button and Scroll Down functionality..25
    @FindBy(xpath = "//*[@id=\"scrollUp\"]")
    WebElement ScrollUp;
    public void ClickOnScrollUp(){
        wait.until(ExpectedConditions.elementToBeClickable(ScrollUp)).click();
    }






}
