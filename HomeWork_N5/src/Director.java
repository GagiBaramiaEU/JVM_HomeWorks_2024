public class Director extends Worker{
    int additionalPercent;
    Director(String s, int g, int a) {
        super(s, g);
        additionalPercent = a;
    }

    @Override
    int getsalary() {
        return salary + (salary * (additionalPercent / 100));
    }
}
