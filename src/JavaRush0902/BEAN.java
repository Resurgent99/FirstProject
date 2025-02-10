package JavaRush0902;

import java.io.CharConversionException;
import java.nio.file.FileSystemException;

public class BEAN {
    public void methodThrowExceptions() throws FileSystemException, CharConversionException {
        throw new CharConversionException();
    }
}
