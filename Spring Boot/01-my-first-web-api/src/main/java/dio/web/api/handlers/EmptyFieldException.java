package dio.web.api.handlers;

public class EmptyFieldException extends BusinessException {
    public EmptyFieldException(String field) {
        super("O campo %s é obrigatório", field);
    }
}
