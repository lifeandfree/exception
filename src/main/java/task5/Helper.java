package task5;

import java.net.URI;
import java.nio.file.FileSystemException;
import java.nio.file.Paths;
import java.util.List;

public class Helper {

    public static void validateToken(String token) throws InvalidTokenException {
        //валидация доступа
    }

    public static void validateData(String data) throws InvalidDataException {
        //валидация данных
    }

    public static URI createResources(String path) throws FileSystemException {
        return Paths.get(path).toUri();
    }

    public static List<String> parseSomeData() throws ParseException {

        throw new ParseException("some text");
    }


}