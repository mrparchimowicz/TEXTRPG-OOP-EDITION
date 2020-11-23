
public class Player {
	int health;
	int maxHealth;
	int mana;
	int maxMana;
	String name;
	public static char initial;
	public Player(int maxHealth, int maxMana, String name) {
		this.health = maxHealth;
		this.maxHealth = maxHealth;
		this.mana = maxMana;
		this.maxMana = maxMana;
		this.name = name;
		initial = (char)name.charAt(0);
	}
	public char getInitial() {
		return this.initial;
	}
}
