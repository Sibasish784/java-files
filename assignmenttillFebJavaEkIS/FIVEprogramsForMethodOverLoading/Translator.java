package assignmenttillFebJavaEkIS.FIVEprogramsForMethodOverLoading;
class Translator {
    String translate(String word) {
        return "Translated '" + word + "' to Spanish: 'Hola'";
    }

    String translate(String sentence, String language) {
        return "Translated '" + sentence + "' to " + language + ": 'Bonjour'";
    }

    String translate(String word, String fromLanguage, String toLanguage) {
        return "Translated '" + word + "' from " + fromLanguage + " to " + toLanguage + ": 'Ciao'";
    }

    public static void main(String[] args) {
        Translator translator = new Translator();
        System.out.println(translator.translate("Hello"));
        System.out.println(translator.translate("Good morning", "French"));
        System.out.println(translator.translate("Goodbye", "English", "Italian"));
    }
}
