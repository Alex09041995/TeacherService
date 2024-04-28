import java.util.Comparator;

public class Учитель_Контроллер implements Comparator<Учитель> {
    @Override
    public int compare(Учитель учитель1, Учитель учитель2) {
    return учитель1.getAge() - учитель2.getAge(); /** сравниваем по определению - уровню возраста */
    }
}



