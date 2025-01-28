public class falsePosition {
    double func(double x){
        return x*x + 4*x -4;
    }

    double false_position(double a, double b){
        if(func(a)*func(b)>=0){
            throw new IllegalArgumentException("No root found in the given interval");
        }
        double c = ((a*func(b) - b*func(a))/(func(b)-func(a)));
        double t = 0.00000000001;

        while (Math.abs(func(c))>t){
            if(func(a)*func(c)<0){
                b=c;
            }
            else a=c;
            c = ((a*func(b) - b*func(a))/(func(b)-func(a)));
        }
        return c;
    }

    public static void main(String[] args) {
        falsePosition obj = new falsePosition();
        System.out.println(obj.false_position(0, 2));
    }
}
