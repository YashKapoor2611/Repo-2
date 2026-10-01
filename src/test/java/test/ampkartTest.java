package test;

import org.testng.annotations.Test;

import Base.baseclass;
import page.pageclass;

public class ampkartTest extends baseclass {


    // =========================
    // 1. LOGO
    // =========================

    @Test(priority = 1)
    public void verifyLogo() {

        pageclass pg = new pageclass(driver);

        pg.clicklogo();
        
        driver.getPageSource().contains("Why buy from us");
    }


    // =========================
    // 2. SEARCH
    // =========================

    @Test(priority = 2)
    public void verifySearch() {

        pageclass pg = new pageclass(driver);

        pg.clickbar("Honeywell");

        pg.clicksearch();
        
        driver.getPageSource().contains("Honeywell"); 

    }


    // =========================
    // 3. DELIVERY
    // =========================

    @Test(priority = 3)
    public void verifyDelivery() {

        pageclass pg = new pageclass(driver);

        pg.deliver();
        
        driver.getPageSource().contains("Choose delivery location");
    }


    // =========================
    // 4. TOP LOGIN
    // =========================

    @Test(priority = 4)
    public void verifyTopLogin() {

        pageclass pg = new pageclass(driver);

        pg.login();
        
        driver.getPageSource().contains("Login or Signup");
    }


    // =========================
    // 5. WISHLIST
    // =========================

    @Test(priority = 5)
    public void verifyWishlist() {

        pageclass pg = new pageclass(driver);

        pg.wishlist();
        driver.getPageSource().contains("My Wishlist");
    }


    // =========================
    // 6. TOP CART
    // =========================

    @Test(priority = 6)
    public void verifyTopCart() {

        pageclass pg = new pageclass(driver);

        pg.cart();
        driver.getPageSource().contains("My Cart");
    }


    // =========================
    // 7. HOME
    // =========================

    @Test(priority = 7)
    public void verifyHome() {

        pageclass pg = new pageclass(driver);

        pg.clickHome();
        driver.getPageSource().contains("Why buy from us");
    }


    // =========================
    // 8. SHOP
    // =========================

    @Test(priority = 8)
    public void verifyShop() {

        pageclass pg = new pageclass(driver);

        pg.clickShop();
        driver.getPageSource().contains("All Products");
    }


    // =========================
    // 9. BLOG
    // =========================

    @Test(priority = 9)
    public void verifyBlog() {

        pageclass pg = new pageclass(driver);

        pg.clickBlog();
        driver.getPageSource().contains("Blog");
    }


    // =========================
    // 10. QUOTE MAKER
    // =========================

    @Test(priority = 10)
    public void verifyQuoteMaker() {

        pageclass pg = new pageclass(driver);

        pg.clickQuoteMaker();
        driver.getPageSource().contains("Build Your Customer Quote");
    }


    // =========================
    // 11. LOWER LOGIN
    // =========================

    @Test(priority = 11)
    public void verifyLowerLogin() {

        pageclass pg = new pageclass(driver);

        pg.clickLogin();
        driver.getPageSource().contains("Login or Signup");
    }


    // =========================
    // 12. PRICE LIST - ITEM 2
    // =========================

    @Test(priority = 12)
    public void verifyPriceListItem2() {

        pageclass pg = new pageclass(driver);

        pg.clickPriceListItem2();
        driver.getPageSource().contains("Electron Price List PDF 2026");
    }


    // =========================
    // 13. BRANDS - ITEM 2
    // =========================

    @Test(priority = 13)
    public void verifyBrandsItem2() {

        pageclass pg = new pageclass(driver);

        pg.clickBrandsItem2();
        driver.getPageSource().contains("Anchor");
    }


    // =========================
    // 14. CATEGORIES
    // =========================

    @Test(priority = 14)
    public void verifyCategories() {

        pageclass pg = new pageclass(driver);

        pg.catagory();
        driver.getPageSource().contains("Product Categories");
    }


    // =========================
    // 15. START SHOPPING
    // =========================

    @Test(priority = 15)
    public void verifyStartShopping() {

        pageclass pg = new pageclass(driver);

        pg.shopping();
        driver.getPageSource().contains("All Products");
    }


    // =========================
    // 16. EXPLORE CATEGORIES
    // =========================

    @Test(priority = 16)
    public void verifyExploreCategories() {

        pageclass pg = new pageclass(driver);

        pg.explore();
        driver.getPageSource().contains("Product Categories");
    }


    // =========================
    // 17. VIEW ALL CATEGORIES
    // =========================

    @Test(priority = 17)
    public void verifyViewAllCategories() {

        pageclass pg = new pageclass(driver);

        pg.viewcatagories();
        driver.getPageSource().contains("Product Categories");
    }


    // =========================
    // 18. RFL
    // =========================

    @Test(priority = 18)
    public void verifyRFL() {

        pageclass pg = new pageclass(driver);

        pg.rfl();
        driver.getPageSource().contains("RLF");
    }


    // =========================
    // 19. HONEYWELL
    // =========================

    @Test(priority = 19)
    public void verifyHoneywell() {

        pageclass pg = new pageclass(driver);

        pg.honeywell();
        driver.getPageSource().contains("Honeywell");
    }


    // =========================
    // 20. LEGRAND
    // =========================

    @Test(priority = 20)
    public void verifyLegrand() {

        pageclass pg = new pageclass(driver);

        pg.legrand();
        driver.getPageSource().contains("Legrand");
    }


    // =========================
    // 21. BEST SELLERS SLIDER
    // AHEAD → PREVIOUS
    // =========================

    @Test(priority = 21)
    public void verifyBestSellerSlider() {

        pageclass pg = new pageclass(driver);

        pg.bestSellerAhead();

        pg.bestSellerPrevious();
    }


    // =========================
    // 22. BEST SELLER PRODUCT 1
    // =========================

    @Test(priority = 22)
    public void verifyBestSellerProduct1() {

        pageclass pg = new pageclass(driver);

        pg.product1();
        driver.getPageSource().contains("Honeywell MK EVO Modular False Blank Plate 1M White EW441WHI");
    }


    // =========================
    // 23. BEST SELLER PRODUCT 2
    // =========================

    @Test(priority = 23)
    public void verifyBestSellerProduct2() {

        pageclass pg = new pageclass(driver);

        pg.product2();
        driver.getPageSource().contains("Legrand Mylinc Modular False Blank Plate 1M White 6755 90");
    }


    // =========================
    // 24. NEW ARRIVALS SLIDER
    // AHEAD → PREVIOUS
    // =========================

    @Test(priority = 24)
    public void verifyNewArrivalsSlider() {

        pageclass pg = new pageclass(driver);

        pg.newArrivalsAhead();

        pg.newArrivalsPrevious();
    }


    // =========================
    // 25. NEW ARRIVALS PRODUCT 1
    // =========================

    @Test(priority = 25)
    public void verifyNewProduct1() {

        pageclass pg = new pageclass(driver);

        pg.newproduct1();
        driver.getPageSource().contains("Honeywell MK Citric 2.1A Modular USB Socket 1M White CW586WHI");
    }


    // =========================
    // 26. NEW ARRIVALS PRODUCT 2
    // =========================

    @Test(priority = 26)
    public void verifyNewProduct2() {

        pageclass pg = new pageclass(driver);

        pg.newproject2();
        driver.getPageSource().contains("Honeywell MK Blenze Plus 1A Modular USB Socket 1M Synthetic Chalk White DW583SCW");
    }


    // =========================
    // 27. COMPLETE ADD TO CART
    // ADD → INCREASE → DECREASE → EMPTY
    // =========================

    @Test(priority = 27)
    public void verifyAddToCart() {

        pageclass pg = new pageclass(driver);

        pg.addtocart();

        pg.increasecart();

        pg.decreasecart();
        
        pg.decreasecart();

    }
}