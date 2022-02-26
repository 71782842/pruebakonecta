package com.conecta.inventario.tools;


public class Error {


    public Error() {
    }


    private String mensaje = "Cantidad del producto es mayor a la que esta en stock";

    public Error(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return this.mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Error mensaje(String mensaje) {
        setMensaje(mensaje);
        return this;
    }

   


    @Override
    public String toString() {
        return "{" +
            " mensaje='" + getMensaje() + "'" +
            "}";
    }

    
}
