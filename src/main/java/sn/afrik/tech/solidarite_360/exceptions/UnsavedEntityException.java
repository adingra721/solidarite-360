package sn.afrik.tech.solidarite_360.exceptions;

public class UnsavedEntityException extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public UnsavedEntityException() {
        super("Se produjo un error inesperado al intentar guardar el registro");
    }

    public UnsavedEntityException(String mensaje) {
        super(mensaje);
    }

}