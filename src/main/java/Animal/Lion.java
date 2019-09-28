package Animal;

import pl.sda.zookeeper.IAnimal;

public class Lion implements IAnimal {
    public String getName() {
        return "Lew Zbyszek";
    }

    public String getNoise() {
        return null;
    }
}
