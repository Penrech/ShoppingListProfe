package fernandez.pau.shoppinglist;

/**
 * Created by pau_e on 13/03/2018.
 */

public class ShoppingItem {
    private String text;
    private boolean checked;

    public ShoppingItem(String text) {
        this.text = text;
        this.checked = false;
    }

    public ShoppingItem(String text, Boolean checked) {
        this.text = text;
        this.checked = checked;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void toggleCheck(){
        this.checked = !this.checked;
    }
}
