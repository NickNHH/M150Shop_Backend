package ch.bbw.shop.article;

public class Size {
    private int id;
    private String name;
    private int sortOrder;

    public Size(int id, String name, int sortOrder) {
        this.id = id;
        this.name = name;
        this.sortOrder = sortOrder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }
}
