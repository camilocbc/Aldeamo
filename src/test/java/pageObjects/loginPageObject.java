package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

@DefaultUrl("https://www.saucedemo.com/")
public class loginPageObject extends PageObject {

    String txt_usuario = "user-name";
    String txt_clave = "password";
    String btn_login = "login-button";
    String lbl_vcorrecta = "//*[@id='header_container']/div[2]/span";
    String lbl_mensajeError = "//*[@id='login_button_container']/div/form/div[3]/h3";
    String btn_menuHamburguesa = "react-burger-menu-btn";
    String btn_logout = "logout_sidebar_link";
    String lbl_credenciales = "login_credentials";
    String btn_agregarCarrito = "add-to-cart-sauce-labs-backpack";
    String btn_carrito = "shopping_cart_container";
    String btn_checkout = "checkout";
    String txt_nombre = "first-name";
    String txt_apellido = "last-name";
    String txt_cPostal = "postal-code";
    String btn_continue = "continue";
    String btn_finish = "finish";
    String lbl_validarCompra = "//*[@id='checkout_complete_container']/h2";

    public void Txt_usuario(String usuario) {

        find(By.id(txt_usuario)).sendKeys(usuario);
    }
    public void Txt_clave(String clave) {

        find(By.id(txt_clave)).sendKeys(clave);
    }
    public void Btn_login() {

        find(By.id(btn_login)).click();
    }
    public void Btn_menuHamburguesa() {

        find(By.id(btn_menuHamburguesa)).click();
    }
    public void Btn_logout() {

        find(By.id(btn_logout)).click();
    }
    public void Lbl_credenciales() {

       boolean home = find(By.id(lbl_credenciales)).isVisible();
        assertEquals(true, home);
    }

    public void atras(){

        getDriver().navigate().back();

    }
    public void Lbl_vcorrecta(String mensaje) {

       String dato =  find(By.xpath(lbl_vcorrecta)).getText();
        assertEquals(mensaje , dato);
    }

    public void Lbl_mensajeError(String mensaje) {

      String dato =  find(By.xpath(lbl_mensajeError)).getText();
        assertEquals(mensaje , dato);
    }

    public void Btn_agregarCarrito(){
        find(By.name(btn_agregarCarrito)).click();
    }

    public void Btn_carrito(){
        find(By.id(btn_carrito)).click();
    }
    public void Btn_checkout(){
        find(By.id(btn_checkout)).click();
    }

    public void Txt_nombre(String nombre) {

        find(By.id(txt_nombre)).sendKeys(nombre);
    }
    public void Txt_apellido(String apellido) {

        find(By.id(txt_apellido)).sendKeys(apellido);
    }
    public void Txt_cPostal(String cPostal) {

        find(By.id(txt_cPostal)).sendKeys(cPostal);
    }
    public void Btn_continue(){
        find(By.id(btn_continue)).click();
    }
    public void Btn_finish(){
        find(By.id(btn_finish)).click();
    }

    public void Lbl_validarCompra(String mensaje) {

        String dato =  find(By.xpath(lbl_validarCompra)).getText();
        assertEquals(mensaje , dato);
    }



}
