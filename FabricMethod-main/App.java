import Weapon.ArmorShop;
import Weapon.ArmorType;
import Weapon.WeaponFactory;
import Weapon.WeaponShop;
import Weapon.WeaponType;

// В игре имеются два типа героев:
// 1. Лучник
// 2. Рыцарь
// Каждый из героев умеет атаковать и получать урон(приватный метод). У каждого героя имеется амуниция: оружие и броня. У рыцаря броня - латы, оружие - меч. У лучника броня - кольчуга, оржие - лук. Разработать по 2 вида каждого из оружий и брони.

public class App {
  public static void main(String[] args) {
    // armor order
    ArmorShop as = new ArmorShop("chainmail");
    var armor = as.create(ArmorType.CHAINMAIL);
    System.out.println("Ваш заказ доспехов - " + armor.getClass().getName() + " Спасибо, приходите еще!");
    // weapon order
    WeaponFactory wf = new WeaponShop();
    wf.orderWeapon(WeaponType.EPICBOW);

  }
}
