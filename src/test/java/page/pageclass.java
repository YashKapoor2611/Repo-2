package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageclass {

    WebDriver driver;

    // =========================
    // NAVIGATION BAR
    // =========================

    By logo = By.xpath("//img[@class='brand-lockup__logo']");

    By bar = By.xpath("//input[@type='search']");

    By search = By.xpath("//button[@type='submit']");

    By deliver = By.xpath("//button[@class='shop-action-link shop-action-link--location']");

    By login = By.xpath("//a[@class='shop-action-link shop-action-link--account']");

    By wishlist = By.xpath("//a[@class='shop-action-link shop-action-link--wishlist']");

    By cart = By.xpath("//a[@class='shop-action-link shop-action-link--cart']");


    // LOWER NAVIGATION BAR

    List<WebElement> navItems;

    List<WebElement> dropdownMenus;

    List<WebElement> dropdownItems;


    // CATEGORIES

    By catagories = By.xpath(
            "//li[@class='shop-nav-tree__item shop-nav-tree__item--top  shop-nav-tree__item--mega']"
    );


    // =========================
    // MIDDLE SHOPPING BOX
    // =========================

    By shopping = By.xpath("//a[@class='btn btn-shop-secondary']");

    By explore = By.xpath("//a[@class='btn btn-shop-light shop-hero-secondary-cta']");


    // =========================
    // VIEW ALL CATEGORIES
    // =========================

    By viewcatagories = By.xpath("//a[@class='shop-link-inline']");


    // =========================
    // TRUSTED BRANDS
    // =========================

    By rfl = By.xpath("//*[@id=\"shop-main-content\"]/div/section[4]/div[2]/a[1]");

    By honeywell = By.xpath("//*[@id=\"shop-main-content\"]/div/section[4]/div[2]/a[2]");

    By legrand = By.xpath("//*[@id=\"shop-main-content\"]/div/section[4]/div[2]/a[3]");


    // =========================
    // BEST SELLERS
    // =========================

    By bestSellerAhead = By.xpath(
            "//div[@aria-label='Best sellers scroll controls']//button[@data-rail-direction='1']"
    );

    By bestSellerPrevious = By.xpath(
            "//div[@aria-label='Best sellers scroll controls']//button[@data-rail-direction='-1']"
    );

    By product1 = By.xpath(
            "//img[@data-seo-entity-name='Honeywell MK EVO Modular False Blank Plate 1M White EW441WHI']"
    );

    By product2 = By.xpath(
            "//img[@alt='Legrand Mylinc Modular False Blank Plate 1M White 6755 90']"
    );


    // =========================
    // NEW ARRIVALS
    // =========================

    By newArrivalsAhead = By.xpath(
            "//div[@aria-label='New arrivals scroll controls']//button[@data-rail-direction='1']"
    );

    By newArrivalsPrevious = By.xpath(
            "//div[@aria-label='New arrivals scroll controls']//button[@data-rail-direction='-1']"
    );

    By newproduct1 = By.xpath(
            "//img[@data-seo-entity-name='Honeywell MK Citric 2.1A Modular USB Socket 1M White CW586WHI']"
    );

    By newproduct2 = By.xpath(
            "//img[@data-seo-entity-name='Honeywell MK Blenze Plus 1A Modular USB Socket 1M Synthetic Chalk White DW583SCW']"
    );


    // =========================
    // CART
    // =========================

    By addtocart = By.xpath(
            "//button[@class='btn btn-sm js-cart-add-btn js-product-cart-add-btn shop-product-cart-add-btn']"
    );

    By increasecart = By.xpath(
            "//button[@aria-label='Increase quantity']"
    );

    By decreasecart = By.xpath(
            "//button[@aria-label='Decrease quantity']"
    );


    // =========================
    // CONSTRUCTOR
    // =========================

    public pageclass(WebDriver driver) {

        this.driver = driver;

        navItems = driver.findElements(
                By.xpath("//li[@class='shop-nav-tree__item shop-nav-tree__item--top  ']")
        );

        dropdownMenus = driver.findElements(
                By.xpath("//button[@class='shop-nav-pill shop-nav-tree__top-trigger']")
        );

        dropdownItems = driver.findElements(
                By.xpath("//a[@class='shop-nav-tree__link']")
        );
    }


    // =========================
    // NAVIGATION BAR ACTIONS
    // =========================

    public void clicklogo() {

        driver.findElement(logo).click();
    }

    public void clickbar(String text) {

        driver.findElement(bar).sendKeys(text);
    }

    public void clicksearch() {

        driver.findElement(search).click();
    }

    public void deliver() {

        driver.findElement(deliver).click();
    }

    public void login() {

        driver.findElement(login).click();
    }

    public void wishlist() {

        driver.findElement(wishlist).click();
    }

    public void cart() {

        driver.findElement(cart).click();
    }


    // =========================
    // LOWER NAVIGATION BAR
    // =========================

    public void clickHome() {

        navItems.get(0).click();
    }

    public void clickShop() {

        navItems.get(1).click();
    }

    public void clickBlog() {

        navItems.get(2).click();
    }

    public void clickQuoteMaker() {

        navItems.get(3).click();
    }

    public void clickLogin() {

        navItems.get(4).click();
    }


    // =========================
    // DROPDOWN MENUS
    // =========================

    public void clickPriceListItem2() {

        dropdownMenus.get(0).click();

        dropdownItems.get(2).click();
    }

    public void clickBrandsItem2() {

        dropdownMenus.get(1).click();

        dropdownItems.get(12).click();
    }


    // =========================
    // CATEGORIES
    // =========================

    public void catagory() {

        driver.findElement(catagories).click();
    }


    // =========================
    // MIDDLE SHOPPING BOX
    // =========================

    public void shopping() {

        driver.findElement(shopping).click();
    }

    public void explore() {

        driver.findElement(explore).click();
    }


    // =========================
    // VIEW ALL CATEGORIES
    // =========================

    public void viewcatagories() {

        driver.findElement(viewcatagories).click();
    }


    // =========================
    // TRUSTED BRANDS
    // =========================

    public void rfl() {

        driver.findElement(rfl).click();
    }

    public void honeywell() {

        driver.findElement(honeywell).click();
    }

    public void legrand() {

        driver.findElement(legrand).click();
    }


    // =========================
    // BEST SELLERS
    // =========================

    public void bestSellerAhead() {

        driver.findElement(bestSellerAhead).click();
    }

    public void bestSellerPrevious() {

        driver.findElement(bestSellerPrevious).click();
    }

    public void product1() {

        driver.findElement(product1).click();
    }

    public void product2() {

        driver.findElement(product2).click();
    }


    // =========================
    // NEW ARRIVALS
    // =========================

    public void newArrivalsAhead() {

        driver.findElement(newArrivalsAhead).click();
    }

    public void newArrivalsPrevious() {

        driver.findElement(newArrivalsPrevious).click();
    }

    public void newproduct1() {

        driver.findElement(newproduct1).click();
    }

    public void newproject2() {

        driver.findElement(newproduct2).click();
    }


    // =========================
    // CART
    // =========================

    public void addtocart() {

        driver.findElement(addtocart).click();
    }

    public void increasecart() {

        driver.findElement(increasecart).click();
    }

    public void decreasecart() {

        driver.findElement(decreasecart).click();
    }

    public void emptycart() {

        while (driver.findElements(decreasecart).size() > 0) {

            driver.findElement(decreasecart).click();
        }
    }
}