class Application {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.show(); 
        
        Child ch = new Child();
        ch.show(); 
        
        Mother mc = new Child();
        mc.show();
    }
}