package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.loginStep;

public class loginDefinition {

    @Steps
    loginStep loginStep;

    @Given("^Abro el navegador$")
    public void abro_el_navegador() throws Exception {
        loginStep.abrirNavegador();
    }
    @When("^ingreso usuario y clave \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingreso_usuario_y_clave(String usuario, String clave) throws Exception {
        loginStep.IniciarSesion(usuario,clave);
    }
    @Then("^Validar login correcto \"([^\"]*)\"$")
    public void validar_login_correcto(String mensaje) throws Exception {
        loginStep.ValidarInicioSesion(mensaje);
    }
    @Then("^Validar login Fallido \"([^\"]*)\"$")
    public void validarLoginFallido(String mensaje) throws Exception {
        loginStep.ValidarMensajeError(mensaje);
    }

    @Then("^Validar login bloqueado \"([^\"]*)\"$")
    public void validarLoginBloqueado(String mensaje) throws Exception {
        loginStep.ValidarMensajeError(mensaje);
    }

    @When("^cierro sesion$")
    public void cierroSesion() throws Exception {
        loginStep.cerrarSesion();
    }

    @Then("^Validar si cerro sesion$")
    public void validarSiCerroSesion() throws Exception {
        loginStep.ValidarHome();
    }

    @When("^cierro sesion y vuelvo a atras$")
    public void cierroSesionYVuelvoAAtras() throws Exception {
                loginStep.cerrarSesion();
                loginStep.volverAtras();
    }

    @When("^agrego al carrito y realizo compra \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void agregoAlCarritoYRealizoCompra(String nombre, String apellido, String cPostal) throws Exception {
        loginStep.realizarCompra(nombre,apellido,cPostal);
    }

    @Then("^Validar compra exitosa \"([^\"]*)\"$")
    public void validarCompraExitosa(String mensaje) throws Exception {
        loginStep.validarCompra(mensaje);
    }
}
