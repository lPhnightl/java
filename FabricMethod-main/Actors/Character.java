package Actors;
import Weapon.Armor;
import Weapon.Weapon;

public class Character {
  protected Integer id;
  protected Integer hp;
  protected Weapon weapon;
  protected Armor armor;

  public Character(Weapon weapon, Armor armor) {
    this.weapon = weapon;
    this.armor = armor;
  }

  public void attack() {

  }

  public void takedamage() {

  }
}
