public class Buffer_string {
    public static void main(String[] args) {

        // string buffer helps to mutate the data in a string where as string class
        // doesnot allow it to mutate as its constant into string constant pool in
        // string class either you create new data inpool or use the old data but no
        // mutation
        StringBuffer sb = new StringBuffer("Dayasagar");
        System.out.println(sb);
        System.out.println(sb.insert(4, " hi there   "));
        System.out.println(sb.length());
        System.out.println(sb.append(" hi there! "));
        sb.deleteCharAt(14);
        System.out.println(sb);
        System.out.println(sb.capacity());
        String str = sb.toString();
        System.out.println(str);
        // str.append() trying to append to converted data into string buffer but its
        // not possible .
    }
}
