package MiniProjects.GameManagement;

public class Character {
    private int health;
    private String name;
    private int maxHealth;
    private int attackPower;
    private int level;

    public Character(String name, int health, int attackPower){
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.attackPower = attackPower;
        level = 1;
    }

    public void viewCharacter() {
        System.out.println("Name : "+name);
        System.out.println("Health : "+health+ "/"+maxHealth);
        System.out.println("Attack : "+attackPower);
        System.out.println("Level : "+level);
    }

    public int attack(int enemyHealth){
        if(enemyHealth >= attackPower) {
            System.out.println(name+ " attacked enemy with "+ attackPower + " Power");
            return enemyHealth-attackPower;
        }
        return 0;
    }

    public int attackedByEnemy(int enemyAttackPower) {
        if(enemyAttackPower <= health) {
            System.out.println("Enemy Attack : "+ name + " with attack power : "+enemyAttackPower);
            health -= enemyAttackPower;
            return 1;
        }
        return 0;
    }

    public void heal(){
        if(health <= maxHealth-20) {
            health+= 20;
        }
        else{
            health = maxHealth;
        }
    }

    public void increaseLevel(){
        level += 1;
        attackPower += 5;
        maxHealth += 20;
    }
}
