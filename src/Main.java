import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // 尝试创建一个Character对象。我们将它赋值给一个叫做monster的变量。
        Character monster = new Character("Chuchu", 100, 20);

        Hero link = new Hero("Link", 100, 20, 1);
        Hero zelda = new Hero("Zelda", 120, 30,1);

        Monster monster = new Monster("Chuchu", 100, 20, "一枚金币");

        // 创建一个Hero对象。我们将它赋值给一个叫做hero的变量。
        Hero hero = new Hero("Link", 100, 25, 2);

        // 让hero说一句话
        hero.talk("变成我的经验值吧！");

        // 当怪物还活着的时候，让英雄攻击怪物
        while (monster.isAlive()) {
            hero.talk("看招!");
            hero.attack(monster);
//            TimeUnit.SECONDS.sleep(1);
            // 如果怪物还活着，怪物回击英雄
            if (monster.isAlive()) {
                monster.attack(hero);
            }

            // 如果英雄的健康值小于等于50，并且还有药剂，那么使用药剂
            if (hero.getHealth() <= 50 && hero.hasPotion()) {
                hero.usePotion();
                hero.talk("HP回满啦!");
            }
        }

        if (!monster.isAlive()) {
            // 如果怪物已经死了，那么输出英雄赢了
            monster.dropItem();
            hero.talk("赢啦！");
        } else {
            // 否则，输出怪物赢了
            monster.talk("胜败乃兵家常事，大侠请重新来过");
        }
    }
}
