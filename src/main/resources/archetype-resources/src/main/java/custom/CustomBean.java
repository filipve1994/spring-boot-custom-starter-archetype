package ${package}.custom;

public class CustomBean {

    private final String name;

    public CustomBean(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}