package Weapon;
public class ArmorShop {
  protected String name;

  public ArmorShop(String name) {
    this.name = name;
  }

  public Armor create(ArmorType type) {
    Armor armor = null;
    switch (type) {
      case CHAINMAIL:
        armor = new Chainmail(50);
        break;
      case PLATEMAIL:
        armor = new Platemail(80);
        break;

      default:
        break;
    }
    return armor;
  }

}
