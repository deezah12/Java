package femi_assign;

public class Complex {
        private float realNumber;
        private float imaginaryNumber;

        public Complex(float realNumber, float imaginaryNumber) {
            this.realNumber = realNumber;
            this.imaginaryNumber = imaginaryNumber;
        }

        public Complex() {

        }

        public Complex addComplexNumber(Complex c1, Complex c2) {
            Complex complex = new Complex();
            complex.realNumber = c1.realNumber + c2.realNumber;
            complex.imaginaryNumber = c1.imaginaryNumber + c2.imaginaryNumber;
            return complex;
        }

        public Complex subtractComplexNumber(Complex c1, Complex c2) {
            Complex complex = new Complex();
            complex.realNumber = c1.realNumber - c2.realNumber;
            complex.imaginaryNumber = c1.imaginaryNumber - c2.imaginaryNumber;
            return complex;
        }

        public String printComplexNumber() {
            return String.format("%s%.0f%s%s", "Complex Number: ", realNumber, " + ", (int) imaginaryNumber + "i");
        }

}

