package apps.bkh.bootstrapandroid;

/**
 * Created by BKH on 11/01/2017.
 */
public class TodoObject {

    private String value1;
    private String value2;
    private boolean isChecked = false;

    public TodoObject(String value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public String getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public boolean isChecked() {
        return isChecked;
    }
}
