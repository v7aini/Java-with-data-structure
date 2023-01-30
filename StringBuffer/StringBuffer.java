class strBufferBuilder{
    public static void main(String[] args) {
        StringBuffer sBuffer= new StringBuffer(); // Default capacity is 16
        System.out.println("Capacity of sBuffer: " + sBuffer.capacity());

        sBuffer = new StringBuffer(50); // Set capacity to 50
        System.out.println("Capacity of sBuffer: " + sBuffer.capacity());
        
        //String buffer capacity is now 16 + length of given string
        sBuffer = new StringBuffer("My StringBuffer");
        System.out.println("Capacity of sBuffer: " + sBuffer.capacity());

        System.out.println("String in sBuffer: " + sBuffer);

        //StringBuilder are used same as StringBuilder
        StringBuilder sBuilder = new StringBuilder("My StringBuilder");
        System.out.println("String in sBuffer:  " + sBuilder);

        //apend string after the string buffer and string builder 
        sBuffer.append(".Appended with StringBuffer");
        sBuilder.append(".Appended with sBuilder");
        System.out.println("String in sBuffer: " + sBuffer);
        System.out.println("String in sBuilder: " + sBuilder);
        
        sBuffer = new StringBuffer("AABCABB");
        sBuilder = new StringBuilder("abaabaabc");

        //insert string in between the old string 
        sBuffer.insert(5, "pqrst");
        sBuilder.insert(3, "XYZ");
        System.out.println("String in sBuffer: " + sBuffer);
        System.out.println("String in sBuilder: " + sBuilder);

        //reverse the strings
        System.out.println("Reversed StringBuffer: " + sBuffer.reverse());
        System.out.println("Reveresed StringBuilder: "+ sBuilder.reverse());

    }
}
