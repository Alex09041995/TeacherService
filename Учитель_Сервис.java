import java.util.ArrayList;
import java.util.List;

public class Учитель_Сервис {
    private List<Учитель> учители;

    public Учитель_Сервис() {
        this.учители = new ArrayList<>();
    }
    
    public void addУчитель(Учитель учитель) {
        учители.add(учитель);
    }

    public void editУчитель(int index, Учитель учитель) {
        учители.set(index, учитель);
}
    public List<Учитель> getAllУчители() {
        return учители;
    }
}




