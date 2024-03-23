package br.com.marcos.api.services.exeptions;

public class ObjectFoundException extends RuntimeException{

    public ObjectFoundException(String message) {
        super(message);
    }
}
