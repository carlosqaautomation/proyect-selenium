package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Objects;

public class InventoryPage extends BasePage{
    @FindBy(css = ".inventory_list .inventory_item")
    public List<WebElement> listInventory;

    @FindBy(css = ".inventory_list .inventory_item .inventory_item_name")
    public List<WebElement> lblNameProduct;

    @FindBy(css = ".inventory_list .inventory_item .btn_inventory")
    public List<WebElement> btnAddCart;

    @FindBy(css = "#shopping_cart_container .shopping_cart_link")
    public WebElement btnCart;
    @FindBy(css = ".shopping_cart_badge")
    public List<WebElement> countProductCart;
    public InventoryPage() {
        super(driver);
    }

    public void addProductCart(String nameProduct){
        for (int i = 0; i < listInventory.size(); i++) {
            if (Objects.equals(lblNameProduct.get(i).getText(), nameProduct)) {
                clickElement(btnAddCart.get(i));
            }
        }
    }
    public void goToCart() {
        clickElement(btnCart);
    }

    public Integer getLengthListProduct(){
        return listInventory.size();
    }
    public void countDisplayed(){
       elementIsDisplayed(countProductCart.get(0));
    }
    public boolean cartEmpty(){
       return countProductCart.isEmpty();
    }

}
