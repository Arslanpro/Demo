public class Main {
    public static void main(String[] args) {
        // 创建一个Character对象。我们将它赋值给一个叫做monster的变量。
        Character monster = new Character("Monster", 100, 20);

        // 创建一个Hero对象。我们将它赋值给一个叫做hero的变量。
        Hero hero = new Hero("Hero", 100, 25, 2);

        // 让hero说一句话
        hero.talk("Let's start the battle!");

        // 当怪物还活着的时候，让英雄攻击怪物
        while (monster.isAlive()) {
            hero.attack(monster);
            // 如果怪物还活着，怪物回击英雄
            if (monster.isAlive()) {
                monster.attack(hero);
            }

            // 如果英雄的健康值小于等于50，并且还有药剂，那么使用药剂
            if (hero.getHealth() <= 50 && hero.hasPotion()) {
                hero.usePotion();
            }
        }

        if (!monster.isAlive()) {
            // 如果怪物已经死了，那么输出英雄赢了
            hero.talk("I won the battle!");
        } else {
            // 否则，输出怪物赢了
            monster.talk("I won the battle!");
        }
    }
}
