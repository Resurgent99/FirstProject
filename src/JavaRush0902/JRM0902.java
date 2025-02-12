package JavaRush0902;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class JRM0902 {
    public static void main(String[] args) {
            /*JRQReturnStackTrace stackTrace = new JRQReturnStackTrace();
            stackTrace.method1();
            */

            /*JRQArethmeticExeption arethmeticExeption = new JRQArethmeticExeption();
            arethmeticExeption.catchExeption();
            */

            /*JRQExeptionString exeptionString = new JRQExeptionString();
            exeptionString.catchExeption();
            */

            /*JRQArrayExeption arrayExeption = new JRQArrayExeption();
            arrayExeption.catchExeption();
            */

            /*JRQListExeption listExeption = new JRQListExeption();
            listExeption.catchExeption();
            */

            /*JRQMapExeption mapExeption = new JRQMapExeption();
            mapExeption.catchExeption();
            */

        /* JRQManyExeption manyExeption = new JRQManyExeption();
      try {
        manyExeption.catchExeption();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }*/

        BEAN bean = new BEAN();
      try {
        bean.processExceptions();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }

    }
}
