public abstract class BaseCoffee {
    private String name;
    private String type;
    private String size;
    private boolean sutVarmi;
    private int sekerSayisi;

    abstract void writeCoffee();

    public BaseCoffee(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isSutVarmi() {
        return sutVarmi;
    }

    public void setSutVarmi(boolean sutVarmi) {
        this.sutVarmi = sutVarmi;
    }

    public int getSekerSayisi() {
        return sekerSayisi;
    }

    public void setSekerSayisi(int sekerSayisi) {
        this.sekerSayisi = sekerSayisi;
    }
}
