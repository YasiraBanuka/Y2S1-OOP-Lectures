public class Student {
    private String name;
    private String ditno;

    private static String batchId; /// static variable

    public Student(String ditno, String name) {
        this.ditno = ditno;
        this.name = name;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public static String getBatchId() {
        return batchId;
    }

    public String getDitno() {
        return ditno;
    }

    public static void setBatchId2(String mbatchId) {
        batchId = mbatchId;
    }

}
