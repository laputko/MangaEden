package alexander.readmanga;


public class Manga {
    private String name;
    private String genres;
    private int year;
    private String id;
    private String image;
    private int lastdate;
    private int s;
    private String t;


    Manga(String name, String genres, int year,String id, String image, int lastdate, int s, String t){
        this.name = name;
        this.genres = genres;
        this.year = year;
        this.id = id;
        this.image = image;
        this.lastdate = lastdate;
        this.s = s;
        this.t = t;
    }

    @Override
    public String toString() {
        return "Название: "+name+"\nЖанр: "+genres+"\nГод: "+lastdate+"\nID: "+id+"\nОбложка: "+image+"\nПоследнее: "+lastdate+"\nS: "+s+"\nT: "+t;
    }
}
