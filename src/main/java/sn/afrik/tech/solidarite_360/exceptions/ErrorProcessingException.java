package sn.afrik.tech.solidarite_360.exceptions;

public class ErrorProcessingException extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public ErrorProcessingException() {
        super("Se produjo un error inesperado al intentar procesar su solicitud");
    }

    public ErrorProcessingException(String mensaje) {
        super(mensaje);
    }

    public ErrorProcessingException(String mensaje, Throwable root) {
        super(mensaje, root);
    }
}