package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.loginPageObject;

public class loginStep {

    loginPageObject loginPageObject;
    @Step
    public void abrirNavegador(){
        loginPageObject.open();
    }
    @Step
    public void IniciarSesion(String usuario, String clave){
        loginPageObject.Txt_usuario(usuario);
        loginPageObject.Txt_clave(clave);
        loginPageObject.Btn_login();

    }

    @Step
    public void ValidarInicioSesion(String mensaje){

        loginPageObject.Lbl_vcorrecta(mensaje);

    }

    @Step
    public void ValidarMensajeError(String mensaje){

        loginPageObject.Lbl_mensajeError(mensaje);

    }

    @Step
    public void ValidarHome(){

        loginPageObject.Lbl_credenciales();

    }
    @Step
    public void cerrarSesion(){

        loginPageObject.Btn_menuHamburguesa();
        loginPageObject.Btn_logout();

    }

    @Step
    public void volverAtras(){

        loginPageObject.atras();

    }

    @Step
    public void realizarCompra(String nombre, String apellido, String cPostal){
        loginPageObject.Btn_agregarCarrito();
        loginPageObject.Btn_carrito();
        loginPageObject.Btn_checkout();
        loginPageObject.Txt_nombre(nombre);
        loginPageObject.Txt_apellido(apellido);
        loginPageObject.Txt_cPostal(cPostal);
        loginPageObject.Btn_continue();
        loginPageObject.Btn_finish();

    }
    @Step
    public void validarCompra(String mensaje){
        loginPageObject.Lbl_validarCompra(mensaje);
    }
}
