package devdojo.curso.error;

public class CustomErrorType extends RuntimeException {
    public CustomErrorType(String msgStudentError) {
        super(msgStudentError);
    }
}
