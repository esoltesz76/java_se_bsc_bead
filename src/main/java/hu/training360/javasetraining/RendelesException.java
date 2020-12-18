package hu.training360.javasetraining;

public class RendelesException extends Exception {

    private String message;

    public RendelesException(String exceptionMessage) {
        super();
        this.message = "Rendeles hiba: " + exceptionMessage;
    }

}
