package ch.bbw.shop.article;

import java.util.List;

public class SizeGroup {
    private int id;
    private String name;
    private List<Size> sizeList;

    SizeGroup(int id, String name, List<Size> sizeList) {
        this.id = id;
        this.name = name;
        this.sizeList = sizeList;
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

    public List<Size> getSizeList() {
        return sizeList;
    }

    public void setSizeList(List<Size> sizeList) {
        this.sizeList = sizeList;
    }
}
