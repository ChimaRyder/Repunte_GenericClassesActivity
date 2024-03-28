package Arithmetic;

public class Arithmetic<T extends Number> {

       T num_one;
       T num_two;

    public Arithmetic(T num_one, T num_two) {
        if (!(num_one instanceof Number) && !(num_two instanceof Number)) {
            throw new ArithmeticException("Cannot instantiate object due to invalid arguments. Arguments must be a Number.");
        }

        this.num_one = num_one;
        this.num_two = num_two;
    }

   public Number add () {
        return num_one.doubleValue() + num_two.doubleValue();
   }

   public Number subtract () {
        return num_one.doubleValue() - num_two.doubleValue();
   }

   public Number multiply () {
        return num_one.doubleValue() * num_two.doubleValue();
   }

   public Number divide () {
        if (num_two.doubleValue() == 0) {
            throw new ArithmeticException("Cannot perform division due to illegal divisor. Number must not be 0.");
        }
        return num_one.doubleValue() / num_two.doubleValue();
   }

   public Number getMin() {
        return Math.min(num_one.doubleValue(), num_two.doubleValue());
   }

   public Number getMax() {
        return Math.max(num_one.doubleValue(), num_two.doubleValue());
   }
}
