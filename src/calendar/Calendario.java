package calendar;

import java.util.Calendar;

public class Calendario {
    public static void main(String[] args) {

        Calendar vencimento = Calendar.getInstance();
        vencimento.set(2021,04,3);
        System.out.println(vencimento.getTime());
        vencimento.add(Calendar.DATE, +10);
        System.out.println("Data de vencimento: " + vencimento.getTime() + "\n");

        Calendar pagamento = Calendar.getInstance();
        pagamento.set(2021,04, 13);
        System.out.println("Data de pagamento: " + pagamento.getTime() + "\n");

        pagamento.setMinimalDaysInFirstWeek(5);

        if(vencimento.compareTo(pagamento) < 0 && vencimento.get(Calendar.DATE) != 13) {
            System.out.println("Paga juros!\n");
        }
        if(pagamento.get(Calendar.DAY_OF_WEEK) == 1 || pagamento.get(Calendar.DAY_OF_WEEK) == 7){
            System.out.println(pagamento.getTime());
            pagamento.add(Calendar.DATE, 1);
            System.out.println("Pagamento poderá ser feito na Segunda-Feira!");
            System.out.println(pagamento.getTime());
        }

    }
}
