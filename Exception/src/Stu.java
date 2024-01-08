public class Stu {
    private int id;
    private String name;

    public Stu(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Stu find(int id) throws StuException {
        if (id == 123) {
            return new Stu(123, "Mustafa Çetindağ");
        } else {
            throw new StuException("Öğrenci Bulunamadı");
        }
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
}

public class StuException extends Exception {
    public StuException(String msg) {
        super(msg);
    }

}
