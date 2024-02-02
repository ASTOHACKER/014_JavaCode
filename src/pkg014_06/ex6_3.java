public class ex6_3{
    public static void main(String[] args){
        System.out.println("Im Starting in main");
        deep();
        System.out.println("Im Back in main");
    }
    public static void deep(){
        System.out.println("Im now in Deep");
        deeper();
        System.out.println("Now im back in deep");
    }
    public static void deeper(){
        System.out.println("Im now in Deeper");
    }
}