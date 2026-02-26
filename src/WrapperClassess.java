public class WrapperClassess {

    public static void main(String[] args){
        int x = 5;
        Integer xy = 5;  // autoboxing
        Integer xyz = Integer.valueOf(5); // boxing

        int mn = xyz; // auto unboxing
        int mnt = xyz.intValue(); //


           /*
            Primitive   →   Wrapper Class

            double      →   Double
            float       →   Float
            boolean     →   Boolean
            int         →   Integer
            long        →   Long
            byte        →   Byte
            short       →   Short
            char        →   Character
            */


        /*
          🧠 3️⃣ Frameworks (Very Important in Backend)

            Frameworks like:
            Spring Boot
            Hibernate
            JPA

            Prefer wrapper types.
            Example in Entity class:
            private Integer id;
            Why not int?
            Because:
            Wrapper can store null
            Primitive cannot
            🔥 Example:
            If database value is NULL → int cannot handle it
            But Integer can.
         */
    }
}
