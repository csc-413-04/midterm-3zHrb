/*package midterm2018;

//import com.google.gson.Gson;

public class FromToJson{







        private static FromToJson objFTJson = new FromToJson();
        private static Gson gson = new Gson();

        private FromToJson(){}

        public static String toJson(Object objects){

            String jsonResult = gson.toJson(objects);

            return jsonResult;
        }

        public static <T> T FromJson(String jsonFormat, Class<T> cls){

            T FromJsonToJavaHolder = null;

            FromJsonToJavaHolder = gson.fromJson(jsonFormat, cls);


            return FromJsonToJavaHolder;
        }


    }


*/