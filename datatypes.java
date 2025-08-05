class datatypes{
    public static void main(String args[]){
        //primitive data types
        //1.byte,short,int,long for integers
        byte a = 127 ;// min : -128 , max : 127
        short b = 31111 ;// min : -32768 , max : 32767
        int c = 1111111111 ;// min : -2147483648 , max : 2147483647  This takes 4 bytes
        long d = 111111 ;// min : -9223372036854775808 , max : 9223372036854775807 This takes 8 bytes
        //2.float,double for decimals
        float e = 1.123456f; // 6 numbers after point can be added not more than that
        double f = 1.123456789012345; // upto 15 numbers
        //3.char for single character
        char g = 'a'; // single quotation for char and only one letter can be used for char datatype,more than 1 letter means string
        //4.boolean for this or that
        boolean h = true ;
        boolean i = false ;

        //data object types
        //1.string,array,class objects
        String  j = "Hello World";
    }
}