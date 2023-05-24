// Hero类继承自Character类。
// 这意味着Hero类自动获得了Character类的所有属性和方法（除了那些使用private访问修饰符的）。
public class Hero extends Character {
    // 这是Hero类特有的实例变量。
    private int potions; // 药剂数量

    // 这是Hero类特有的构造函数。
    public Hero(String name, int health, int attackPower, int potions) {
        // 使用super关键字调用父类的构造函数。
        super(name, health, attackPower);
        this.potions = potions;
    }

    // 这是Hero类特有的实例方法。
    // 使用实例方法，我们可以让一个英雄使用药剂。
    public void usePotion() {
        if (this.potions > 0) {
            System.out.println(this.getName() + " uses a potion!");
            this.potions -= 1;
            this.heal(50);
        } else {
            System.out.println(this.getName() + " has no potions left!");
        }
    }

    // 这是一个private的实例方法，这意味着只有Hero类自己的其他方法可以调用它。
    // 使用实例方法，我们可以让一个英雄恢复健康值。
    private void heal(int amount) {
        this.setHealth(this.getHealth() + amount);
    }

    public boolean hasPotion() {
        return this.potions > 0;
    }
}

