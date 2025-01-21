class Complex
{
    
        private double real;
        private double imag;

        public void init(double real, double imag)
        {
            this.real=real;
            this.imag=imag;
        }
        public void Data()
        {
            System.out.println("Complex number "+real+"+"+imag+"i");
        }
}
        public class Program1
        {
            public static void main(String[] args)
            {
            double real=Double.parseDouble(args[0]);
            double imag=Double.parseDouble(args[1]);

            Complex c1 = new Complex();
            c1.init(real,imag);
            c1.Data();
            }
        }
    
