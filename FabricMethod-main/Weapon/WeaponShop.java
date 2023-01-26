package Weapon;
public class WeaponShop extends WeaponFactory {

  public WeaponShop() {

  }

  // fabric method
  @Override
  protected Weapon createWeapon(WeaponType type) {
    Weapon weapon = null;
    switch (type) {

      case SIMPLEBOW:

        weapon = new SimpleBow("Простой лук", 50);
        break;
      case EPICBOW:
        weapon = new EpicBow("Простой лук", 90);

        break;
      case SIMPLESWORD:

        weapon = new SimpleSword("Простой меч", 50);
        break;
      case EPICSWORD:
        weapon = new EpicSword("Супер меч", 90);

        break;

      default:
        break;
    }
    return weapon;
  }

}