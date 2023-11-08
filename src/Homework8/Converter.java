package Homework8;
   /*Необходимо создать класс конвертер, который будет иметь методы конвертации примитивных типов данных:
   метод convertToInt; (конвертирует byte, short, int, long, char, float, double, String).
   При вводе boolean выводитсообщение, что введен тип boolean.

        convertToDouble;    (конвертирует byte, short, int, long, char, float, double, String).
        При вводе boolean выводит сообщение, что введен тип boolean.

        converToString;     (конвертирует byte, short, int, long, char, boolean, float, double, String).

        У данного класса должен быть только один конструктор, в параметрах которого можно указать его имя.
        А также только один метод геттер для получения информации о названии данного конвертра.*/
public class Converter {
      private String name;
      public Converter(String name){
         this.name = name;
      }
      public String getName() {
         return name;
      }

      public int convertToInt(Object value) {
         if (value instanceof Integer) {
            return (Integer) value;
         } else if (value instanceof Byte) {
            return ((Byte) value).intValue();
         } else if (value instanceof Short) {
            return ((Short) value).intValue();
         } else if (value instanceof Long) {
            return ((Long) value).intValue();
         } else if (value instanceof Character) {
            return ((Character) value).charValue();
         } else if (value instanceof Float) {
            return ((Float) value).intValue();
         } else if (value instanceof Double) {
            return ((Double) value).intValue();
         } else if (value instanceof String) {
            return Integer.parseInt((String) value);
         } else if (value instanceof Boolean) {
            System.out.println("Введен тип boolean");
         }
         return 0;
      }

      public double convertToDouble(Object value) {
         if (value instanceof Double) {
            return (Double) value;
         } else if (value instanceof Byte) {
            return ((Byte) value).doubleValue();
         } else if (value instanceof Short) {
            return ((Short) value).doubleValue();
         } else if (value instanceof Long) {
            return ((Long) value).doubleValue();
         } else if (value instanceof Character) {
            return ((Character) value).charValue();
         } else if (value instanceof Float) {
            return ((Float) value).doubleValue();
         } else if (value instanceof Integer) {
            return ((Integer) value).doubleValue();
         } else if (value instanceof String) {
            return Double.parseDouble((String) value);
         } else if (value instanceof Boolean) {
            System.out.println("Введен тип boolean");
         }
         return 0;
      }

      public String convertToString(Object value) {
         if (value instanceof String) {
            return (String) value;
         } else if (value instanceof Byte) {
            return Byte.toString((Byte) value);
         } else if (value instanceof Short) {
            return Short.toString((Short) value);
         } else if (value instanceof Long) {
            return Long.toString((Long) value);
         } else if (value instanceof Character) {
            return Character.toString((Character) value);
         } else if (value instanceof Float) {
            return Float.toString((Float) value);
         } else if (value instanceof Integer) {
            return Integer.toString((Integer) value);
         } else if (value instanceof Double) {
            return Double.toString((Double) value);
         } else if (value instanceof Boolean) {
            return Boolean.toString((Boolean) value);
         }
         return "-" ;
      }

   }
