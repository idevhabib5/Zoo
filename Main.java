import java.util.Scanner;

// Interface Definitions
interface Walk {
    void walking();
}

interface Swim {
    void swimming();
}

interface Eat {
    void eatingFood();

    void eatingCompleted();
}

// Abstract Animal Class
abstract class Animal implements Eat {
    private String nameOfAnimal;
    private int weight;
    private int height;
    private int age;

    public Animal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void eatingFood() {
        System.out.println(nameOfAnimal + ": I am eating food.");
    }
}

// Tiger Class
class Tiger extends Animal implements Walk {
    private int numberOfStripes;
    private int speed;
    private int roarLevel;

    public Tiger() {
        super("Tiger");
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRoarLevel() {
        return roarLevel;
    }

    public void setRoarLevel(int roarLevel) {
        this.roarLevel = roarLevel;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat.");
    }

    @Override
    public void walking() {
        System.out.println("Tiger: I am walking at the speed of " + speed + " mph.");
    }
}

// Dolphin Class
class Dolphin extends Animal implements Swim {
    private String color;
    private int swimmingSpeed;

    public Dolphin() {
        super("Dolphin");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I have eaten fish.");
    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of " + swimmingSpeed + " nautical miles per hour.");
    }
}

// Penguin Class
class Penguin extends Animal implements Walk, Swim {
    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    public Penguin() {
        super("Penguin");
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish.");
    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed of " + walkSpeed + " mph.");
    }

    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed of " + swimSpeed + " nautical miles per hour.");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();

        while (true) {
            System.out.println("******* ZOO ANIMAL choice menu ******");
            System.out.println("1. Tiger\n2. Dolphin\n3. Penguin\n4. Exit");
            System.out.print("Enter choice of animal (1-4): ");
            int animalChoice = scanner.nextInt();

            if (animalChoice == 4)
                break;

            Animal selectedAnimal = null;

            switch (animalChoice) {
                case 1 -> selectedAnimal = tigerObject;
                case 2 -> selectedAnimal = dolphinObject;
                case 3 -> selectedAnimal = penguinObject;
                default -> System.out.println("Invalid choice! Try again.");
            }

            if (selectedAnimal != null) {
                System.out.println("The animal chosen is: " + selectedAnimal.getNameOfAnimal());

                boolean continueWithAnimal = true;
                while (continueWithAnimal) {
                    System.out.println(
                            "******* ANIMAL details menu for: " + selectedAnimal.getNameOfAnimal() + " ******");
                    System.out.println(
                            "1. Set properties\n2. Display properties\n3. Display movement\n4. Display eating\n5. Back to main menu");
                    System.out.print("Enter choice (1-5): ");
                    int menuChoice = scanner.nextInt();

                    switch (menuChoice) {
                        case 1 -> {
                            System.out.print("Enter age: ");
                            selectedAnimal.setAge(scanner.nextInt());
                            System.out.print("Enter height: ");
                            selectedAnimal.setHeight(scanner.nextInt());

                            if (selectedAnimal instanceof Tiger tiger) {
                                System.out.print("Enter number of stripes: ");
                                tiger.setNumberOfStripes(scanner.nextInt());
                                System.out.print("Enter speed: ");
                                tiger.setSpeed(scanner.nextInt());
                                System.out.print("Enter roar level: ");
                                tiger.setRoarLevel(scanner.nextInt());
                            } else if (selectedAnimal instanceof Dolphin dolphin) {
                                System.out.print("Enter color: ");
                                dolphin.setColor(scanner.next());
                                System.out.print("Enter swimming speed: ");
                                dolphin.setSwimmingSpeed(scanner.nextInt());
                            } else if (selectedAnimal instanceof Penguin penguin) {
                                System.out.print("Is the penguin swimming (true/false): ");
                                penguin.setSwimming(scanner.nextBoolean());
                                System.out.print("Enter walk speed: ");
                                penguin.setWalkSpeed(scanner.nextInt());
                                System.out.print("Enter swim speed: ");
                                penguin.setSwimSpeed(scanner.nextInt());
                            }
                        }
                        case 2 -> {
                            System.out.println("Age: " + selectedAnimal.getAge());
                            System.out.println("Height: " + selectedAnimal.getHeight());

                            if (selectedAnimal instanceof Tiger tiger) {
                                System.out.println("Number of stripes: " + tiger.getNumberOfStripes());
                                System.out.println("Speed: " + tiger.getSpeed());
                                System.out.println("Roar level: " + tiger.getRoarLevel());
                            } else if (selectedAnimal instanceof Dolphin dolphin) {
                                System.out.println("Color: " + dolphin.getColor());
                                System.out.println("Swimming speed: " + dolphin.getSwimmingSpeed());
                            } else if (selectedAnimal instanceof Penguin penguin) {
                                System.out.println("Swimming: " + (penguin.isSwimming() ? "Yes" : "No"));
                                System.out.println("Walk speed: " + penguin.getWalkSpeed());
                                System.out.println("Swim speed: " + penguin.getSwimSpeed());
                            }
                        }
                        case 3 -> {
                            if (selectedAnimal instanceof Penguin penguin) {
                                if (penguin.isSwimming()) {
                                    penguin.swimming();
                                } else {
                                    penguin.walking();
                                }
                            } else if (selectedAnimal instanceof Walk walkable) {
                                walkable.walking();
                            } else if (selectedAnimal instanceof Swim swimmable) {
                                swimmable.swimming();
                            } else {
                                System.out.println("This animal cannot perform this action.");
                            }
                        }
                        case 4 -> {
                            selectedAnimal.eatingFood();
                            selectedAnimal.eatingCompleted();
                        }
                        case 5 -> continueWithAnimal = false;
                        default -> System.out.println("Invalid choice! Try again.");
                    }
                }
            }
        }

        scanner.close();
        System.out.println("Exiting the program.");
    }
}
