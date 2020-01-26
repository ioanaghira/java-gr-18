public class Album extends Book {
    private String quality;

    //metode
    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Album{" +
                "quality='" + quality + '\'' +
                '}';
    }
}