public class CalculatorServiceImplements implements CalculatorService {

    @Override
    public void sum(int x, int y) {
        float jami = x + y;
        System.out.println("შემოტანილი რიცხვებია: " + x + "," + y);
        System.out.println("რიცხვების ჯამი: " + jami);
    }

    @Override
    public void prod(int x, int y) {
        float jami = x * y;
        System.out.println("რიცხვების ნამრავლი: " + jami);
    }
}
