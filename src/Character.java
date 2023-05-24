// 使用public访问修饰符，这意味着这个类可以被任何其他类访问
public class Character {
    // 这些是实例变量。每个Character对象都有自己的一份拷贝。
    // 它们使用private访问修饰符，这意味着只有Character类自己的方法可以直接访问它们。
    private String name; // 名字
    private int health; // 健康值
    private int attackPower; // 攻击力

    // 构造函数用于创建和初始化对象。
    // 这是一个public的构造函数，这意味着任何其他类都可以创建一个Character对象。
    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    // 这是一个public的实例方法，这意味着任何其他类都可以调用它。
    // 使用实例方法，我们可以让一个角色攻击另一个角色。
    public void attack(Character target) {
        target.receiveDamage(this.attackPower);
        System.out.println(this.name + " attacks " + target.getName() + " for " + this.attackPower + " damage!");
    }

    // 这是另一个实例方法的例子。使用此方法，角色可以接受伤害，这会降低它们的健康值
    private void receiveDamage(int damage) {
        this.health -= damage;
    }

    // 这是一个getter方法的例子。它允许我们访问私有字段name的值
    public String getName() {
        return this.name;
    }

    // 这是一个getter方法的例子。它允许我们访问私有字段health的值
    public int getHealth() {
        return this.health;
    }

    // 这是一个setter方法的例子。它允许我们改变私有字段health的值
    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    // 这是一个public的实例方法，这意味着任何其他类都可以调用它。
    // 使用实例方法，我们可以让一个角色说话。
    public void talk(String words) {
        System.out.println(this.name + " says: " + words);
    }

    // 这是一个public的实例方法，这意味着任何其他类都可以调用它。
    // 使用实例方法，我们可以检查一个角色是否还有足够的健康值。
    public boolean isAlive() {
        return this.health > 0;
    }
}
