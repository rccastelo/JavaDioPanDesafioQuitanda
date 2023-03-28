import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangoPeso = input.nextInt();
        int macaPeso = input.nextInt();

        double morangoSubTotal;
        double macaSubTotal;
        double pesoTotal;
        double valorTotal;
        //NumberFormat fmt = DecimalFormat.getNumberInstance(new Locale("en", "US"));

        if (morangoPeso > 5) {
            morangoSubTotal = morangoPeso * 2.2;
        } else {
            morangoSubTotal = morangoPeso * 2.5;
        }

        if (macaPeso > 5) {
            macaSubTotal = macaPeso * 1.5;
        } else {
            macaSubTotal = macaPeso * 1.8;
        }

        pesoTotal = morangoPeso + macaPeso;
        valorTotal = morangoSubTotal + macaSubTotal;
        double valorTotalComDesconto = valorTotal;

        if ((pesoTotal > 8) || (valorTotal > 25)) {
            double valorDesconto = valorTotal * 0.1;

            valorTotalComDesconto = valorTotal - valorDesconto;
        }

        //System.out.println(fmt.format(valorTotalComDesconto));
        System.out.println(valorTotalComDesconto);

        input.close();
    }
}
