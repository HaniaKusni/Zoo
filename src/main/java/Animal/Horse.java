package Animal;


import pl.sda.zookeeper.IAnimal;

public class Horse implements IAnimal {

    public String getName() {
        return "Koń Wiesiek";
    }

    public String getNoise() {
        return null;
    }
}
