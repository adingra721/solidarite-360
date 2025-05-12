package sn.afrik.tech.solidarite_360.exceptions;

public class EntityNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public EntityNotFoundException() {
        super("El registro solicitado no existe");
    }

    public EntityNotFoundException(String mensaje) {
        super(mensaje);
    }

}