/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Application {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.show();         
        Child ch = new Child();
        ch.show();        
        Mother mc = new Child();
        mc.show(); 
        
        Mother m1 = new Child();
        m1.show();     
}
}