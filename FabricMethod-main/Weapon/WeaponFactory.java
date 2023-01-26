package Weapon;
public abstract class WeaponFactory {

  public Weapon orderWeapon(WeaponType type) {
    Weapon weapon = createWeapon(type);
    weapon.makeWeapon();
    weapon.sendWeapon();

    System.out.println("Ваш заказ оружия - " + weapon.getClass().getName() + "! Спасибо, приходите еще!");

    return weapon;
  }

  // fabric method
  protected abstract Weapon createWeapon(WeaponType type);
}