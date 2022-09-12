public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.name = "Мёртвые";
        b1.author = "Кладбище";
        Book b2 = new Book();
        b2.name = "Сухие";
        b2.author = "Крематорий";
        Book b3 = new Book();
        b3.name = "Рассеянные";
        b3.author = "Ветер";
        Magazine m1 = new Magazine();
        m1.name = "Тайны жизни";
        Magazine m2 = new Magazine();
        m2.name = "Тайны смерти";
        Magazine m3 = new Magazine();
        m3.name = "Тайны небытия";
        Printable[] p = {b1, b2, b3, m1, m2, m3};
        for(int i = 0; i<p.length; i++){
            p[i].print();
            if (p[i] instanceof Book){
                ((Book) p[i]).printBooks(p);
            }
            if (p[i] instanceof Magazine){
                ((Magazine) p[i]).printMagazines(p);
            }
        }
    }

}
