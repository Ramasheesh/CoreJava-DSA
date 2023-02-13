public class whileDemo {
    public static void main(String[] args) {
        int count=1;
        while(count<=5){
            System.out.println("I'm Lol");
            count = count + 1;//without this line we see infinite loop 
        }
    }
}
