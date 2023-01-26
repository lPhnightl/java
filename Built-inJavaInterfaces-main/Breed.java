public abstract class Breed {
    // abstract void Foo();
    // Наименование породы
    // Породы котиков
    public enum CatBreed {
        RUSSIAN("Русская"), ENGLISH("Английская"), SIAM("Сиамская"), ANGOR("Ангорская");

        private String code;

        CatBreed(String code) {
            this.code = code;
        }

        public static String getCatBreed(int i) {
            switch (i) {
                case 0:
                    return CatBreed.RUSSIAN.code;
                case 1:
                    return CatBreed.ENGLISH.code;
                case 2:
                    return CatBreed.SIAM.code;
                default:
                    return CatBreed.ANGOR.code;
            }
        }
    }

    public enum DogBreed {
        SETTER("Сеттер"), BULLDOG("Бульдог"), TERRIER("Терьер"), HUNTER("Охотничья");

        private String code;

        DogBreed(String code) {
            this.code = code;
        }

        public static String getDogBreed(int i) {
            switch (i) {
                case 0:
                    return DogBreed.SETTER.code;
                case 1:
                    return DogBreed.BULLDOG.code;
                case 2:
                    return DogBreed.TERRIER.code;
                default:
                    return DogBreed.HUNTER.code;
            }

        }
    }

}
