package S191220042.proj;

public class AccidentInjure extends Being{
    public static void play(Trident mvp, Human theold, Monster frog){
        System.out.println("爷爷不小心踩到了三叉戟，误伤了在睡觉的蛤蟆");
        mvp.attack(theold,frog);
    }
}
