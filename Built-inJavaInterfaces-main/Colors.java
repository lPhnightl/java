public abstract class Colors {

  // Цвета
  public enum PetColor {
    BLACK("Чёрный"), WHITE("Белый"), GRAY("Серый"), BROWN("Коричневый");

    private String code;

    PetColor(String code) {
      this.code = code;
    }

    public static String getPetColor(int i) {
      switch (i) {
        case 0:
          return PetColor.BLACK.code;
        case 1:
          return PetColor.WHITE.code;
        case 2:
          return PetColor.GRAY.code;
        default:
          return PetColor.BROWN.code;
      }
    }
  }

}
