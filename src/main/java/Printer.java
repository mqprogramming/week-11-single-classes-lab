public class Printer {

    private int sheetsOfPaper;
    private int copies;
    private int tonerVolume;

    public Printer(int sheets) {
        this.sheetsOfPaper = sheets;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsOfPaper() {
        return sheetsOfPaper;
    }

    public void setSheetsOfPaper(int sheetsOfPaper) {
        this.sheetsOfPaper = sheetsOfPaper;
    }

    public boolean print(int pages, int copies) {
        int result = pages * copies;
        if (sheetsOfPaper - result >= 0) {
            this.sheetsOfPaper -= result;
            this.tonerVolume -= result;
            return true;
        } else {
            return false;
        }
    }
}
