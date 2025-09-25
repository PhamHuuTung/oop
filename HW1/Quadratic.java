public class Quadratic {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println(" nhập b và c");
            return;
        }

        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);

        double discriminant = b*b - 4.0*c;
        if (discriminant < 0) {
            System.out.println("Phương trình vô nghiệm thực.");
            return;
        }

        double sqroot = Math.sqrt(discriminant);

        double root1 = (-b + sqroot) / 2.0;
        double root2 = (-b - sqroot) / 2.0;

        System.out.println("Nghiệm 1: " + root1);
        System.out.println("Nghiệm 2: " + root2);
    }
}
