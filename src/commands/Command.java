package commands;

public class Command {
    private String key;
    private Integer index;
    private Integer count;

    public Command(String key, Integer index, Integer count) {
        this.key = key;
        this.index = index;
        this.count = count;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
