class functions{
    public static void main(String args[]){
        functions b= new functions();
        b.greetings();  // To call non static function from static function object needed
    }

    void greetings(){
        System.out.println("Welcome");
        dummy();  // To call non static function from a non static function, object not needed
    }  // function syntax : void name()

    void dummy(){
        System.out.println("IAM A DUMMY");
    }
}