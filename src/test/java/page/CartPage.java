package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Objects;

public class CartPage extends BasePage {
    @FindBy(id = "continue-shopping")
    public WebElement btnContinueShopping;

    @FindBy(css = ".cart_item .cart_button")
    public WebElement btnRemoveProduct;

    public CartPage() {
        super(driver);
    }

    public void removeProduct()  {
        clickElement(btnRemoveProduct);
        clickElement(btnContinueShopping);
    }


}
