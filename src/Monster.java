public class Monster extends Character {
    // 增加一个专有的实例变量
    private String dropItem; // 掉落物品

    // 构造函数
    public Monster(String name, int health, int attackPower, String dropItem) {
        super(name, health, attackPower);
        this.dropItem = dropItem;
    }

    // 实现从Character类继承的抽象攻击方法
    @Override
    public void attack(Character target) {
        target.receiveDamage(this.attackPower);
        System.out.println(this.getName() + " attacks " + target.getName() + " for " + this.attackPower + " damage!");
    }

    // 为Monster类添加专有的方法，例如在怪物死亡后掉落物品
    public void dropItem() {
        if (!this.isAlive()) {
            System.out.println(this.getName() + " died and dropped a " + this.dropItem + "!");
        }
    }
}
