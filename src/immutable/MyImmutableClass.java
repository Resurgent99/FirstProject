package immutable;

import java.util.HashMap;
import java.util.Map;

public final class MyImmutableClass {
    private final String field;
    private final Map<String, String> fieldMap;

    public MyImmutableClass(String field, Map<String, String> fieldMap){
      this.field = field;
      this.fieldMap = fieldMap;
    }

    public String getField(){
      return field;
    }

    public Map<String, String> getFieldMap(){
      Map<String, String> deepCopy = new HashMap<String, String>();
      for(String key : fieldMap.keySet()){
        deepCopy.put(key, fieldMap.get(key));
      }
      return deepCopy;
    }
}
