import java.util.Scanner;

public class park {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Názov národného parku: ");
        String parkName = scanner.nextLine();

        System.out.println("Rozloha národného parku (km2): ");
        double area = scanner.nextDouble();

        System.out.println("Počet návštevníkov za rok: ");
        int visitors = scanner.nextInt();

        int mountainVisitors = (int) (visitors * 0.75);
        int valleyVisitors = (int) (visitors * 0.25);
        double averageVisitorsPerKm2 = visitors / area;

        System.out.println("Názov národného parku: " + parkName);
        System.out.println("Rozloha národného parku: " + area + " km2");
        System.out.println("Počet návštevníkov za rok: " + visitors);
        System.out.println("Počet návštevníkov podľa typu krajiny:");
        System.out.println("  Hory: " + mountainVisitors);
        System.out.println("  Údolia: " + valleyVisitors);
        System.out.println("Priemerný počet návštevníkov na kilometer štvorcový: " + averageVisitorsPerKm2);

        scanner.close();
    }
}

