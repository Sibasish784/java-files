package assignmenttillFebJavaEkIS.FIVEprogramsForMethodOverLoading;
class Fixing {
    void fix(String item) {
        System.out.println("Fixing the " + item);
    }

    void fix(String item, int numberOfPanes) {
        System.out.println("Fixing " + numberOfPanes + " panes of the " + item);
    }

    void fix(String item, String issue) {
        System.out.println("Fixing the " + item + " with issue: " + issue);
    }

    public static void main(String[] args) {
        Fixing fixing = new Fixing();
        fixing.fix("chair");
        fixing.fix("window", 2);
        fixing.fix("refrigerator", "not cooling");
    }
}
