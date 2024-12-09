public class MethodOverloading {
    public static void main(String[] args) {
        int result = getResult(5);
        System.out.println(result);

        result = getResult(5,4);
        System.out.println(result);

        result = getResult(5,"12");
        System.out.println(result);

        String chain1 = getString();
        System.out.println(chain1);

        String chain2 = getString("Hola ", "Mundo");
        System.out.println(chain2);
    }

    public static int getResult(int num){
        return num * 2;
    }

    public static int getResult(int num1, int num2){
        return num1 * num2;
    }

    public static int getResult(int num1, String value){
        return num1 * Integer.parseInt(value);
    }

    public static String getString(){
        String str1 = "Cadena ", str2 = "uno";
        String concat =  str1.concat(str2);
        return concat;
    }
    public static String getString(String str1, String str2){
        return str1.concat(str2);
    }
}
