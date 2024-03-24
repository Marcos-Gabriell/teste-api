package br.com.marcos.api.services.exeptions;

public class DataIntegratyViolationException extends RuntimeException {
    public DataIntegratyViolationException(String message) {
        super(message);
    }
}
