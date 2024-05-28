package Emoji;

public class UltraEmoji {
    public static void main(String[] args) {
       Lutador l[ ] = new Lutador[6];
       l[0] = new Lutador(" Pretty Boy ", 31, 1.75f, "França", 68.9f, 11, 2, 1);
       l[1] = new Lutador(" PutScript ", 29, 1.68f, "Brasil", 57.8f, 14, 2, 3);
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[1], l[1]);
        UEC01.lutar();
        l[0].apresentar();
    }
}