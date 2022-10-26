import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, Integer> telephoneDirectory = new HashMap<String,Integer>();

    public static void main(String[] args) {
        telephoneDirectory.put("Иванов Иван", 147856987);
        telephoneDirectory.put("Петров Петр", 247856987);
        telephoneDirectory.put("Васечкин Вася", 135856987);
        telephoneDirectory.put("Сидоров Коля", 847856987);
        telephoneDirectory.put("Козлов Дима", 667856987);
        telephoneDirectory.put("Иванов Петр", 287856987);
        telephoneDirectory.put("Федоров Коля", 147822987);
        telephoneDirectory.put("Бабкин Данил", 147856923);
        telephoneDirectory.put("Александров Максим", 234856987);
        telephoneDirectory.put("Гаранина Надежда", 117856987);
        telephoneDirectory.put("Гесс София", 321856987);
        telephoneDirectory.put("Давыдов Андрей", 149956987);
        telephoneDirectory.put("Дронов Артём", 947856987);
        telephoneDirectory.put("Ещенко Ангелина", 147816987);
        telephoneDirectory.put("Зинков Александр", 147856917);
        telephoneDirectory.put("Канзеров Арсений", 741856987);
        telephoneDirectory.put("Коробова Кристина", 147859887);
        telephoneDirectory.put("Лаврентьев Денис", 143456987);
        telephoneDirectory.put("Липшина Дарья", 147856911);
        telephoneDirectory.put("Малахов Иван", 227856922);
        System.out.println(telephoneDirectory);
        for (Map.Entry entry:telephoneDirectory.entrySet()) {
            System.out.println(entry);



        }

    }
}