import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*******Kahve cesitlerimiz*******");
        System.out.println(
                        "        1. Americano\n" +
                        "        2. Espresso\n" +
                        "        3. Cappucino\n" +
                        "        4. Latte\n" +
                        "        5. Mocha\n" +
                        "        6. Macchiato\n" +
                        "        7. Affogato\n" +
                        "        8. Buzlu Kahve (Soğuk kahve)\n" +
                        "        9. Frappuccino (Soğuk kahve)\n" +
                        "        10. Irish\n");
        System.out.print("Lütfen kahve numarasi seciniz= ");

        int kahveAdiSecim = scanner.nextInt();

        switch (kahveAdiSecim) {
            case 1:
                BaseCoffee k1 = new Americano("Americano");
                writeConsole(k1);
                boyutSecim(k1);
                sutSekerEkle(k1);
                ozetYaz(k1);
                break;
            case 2:
                BaseCoffee e1 = new Espresso("Espresso");
                writeConsole(e1);
                boyutSecim(e1);
                sutSekerEkle(e1);
                ozetYaz(e1);
                break;
            case 3:
                BaseCoffee c1 = new Cappucino("Cappucino");
                writeConsole(c1);
                boyutSecim(c1);
                sutSekerEkle(c1);
                ozetYaz(c1);
                break;
            case 4:
                BaseCoffee l1 = new Latte("Latte");
                writeConsole(l1);
                boyutSecim(l1);
                sutSekerEkle(l1);
                ozetYaz(l1);
                break;
            case 5:
                BaseCoffee m1 = new Mocha("Mocha");
                writeConsole(m1);
                boyutSecim(m1);
                sutSekerEkle(m1);
                ozetYaz(m1);
                break;
            case 6:
                BaseCoffee m2 = new Macchiato("Machiatto");
                writeConsole(m2);
                boyutSecim(m2);
                sutSekerEkle(m2);
                ozetYaz(m2);
                break;
            case 7:
                BaseCoffee a1 = new Affogato("Affagato");
                writeConsole(a1);
                boyutSecim(a1);
                sutSekerEkle(a1);
                ozetYaz(a1);
                break;
            case 8:
                BaseCoffee ic = new IcedCoffee("IcedCoffee");
                writeConsole(ic);
                boyutSecim(ic);
                sutSekerEkle(ic);
                ozetYaz(ic);
                break;
            case 9:
                BaseCoffee f1 = new Frappuccino("Frappucino");
                writeConsole(f1);
                boyutSecim(f1);
                sutSekerEkle(f1);
                ozetYaz(f1);
                break;
            case 10:
                BaseCoffee ir = new Irish("Irish");
                writeConsole(ir);
                boyutSecim(ir);
                sutSekerEkle(ir);
                ozetYaz(ir);
                break;
            default:
                System.out.println("Geçersiz seçim. Lütfen geçerli bir düğmeye basın!");
        }

    }

    public static void writeConsole(BaseCoffee bc){
        System.out.println(bc.getName() + "'yi seçtiniz...");
        if (bc.getType().equals("soğuk"))
            System.out.println("Sıcak bir yaz gününde serinlemenin en iyi yolu...Mükemmel karar!");
        }
    public static void boyutSecim(BaseCoffee bc){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen aşağıdaki menüden kahvenizin boyutunu (size) seçiniz…");
        System.out.println(
                        "        1. Small\n" +
                        "        2. Medium\n" +
                        "        3. Large\n" +
                        "        4. XLarge\n" );
        System.out.print("Lütfen numarayi seciniz= ");

        int kahveBoyutSecim = scanner.nextInt();

        switch (kahveBoyutSecim){
            case 1:
                bc.setSize(String.valueOf(CoffeeSizes.Small));
                break;
            case 2:
                bc.setSize(String.valueOf(CoffeeSizes.Medium));
                break;
            case 3:
                bc.setSize(String.valueOf(CoffeeSizes.Large));
                break;
            case 4:
                bc.setSize(String.valueOf(CoffeeSizes.XLarge));
                break;
        }
        System.out.println(bc.getSize() + " " + bc.getName() + "'niz hazırlanıyor...");
    }
    public static void sutSekerEkle(BaseCoffee bc){
        Scanner scanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        System.out.println(bc.getName() + " süt eklemek ister misiniz? Lütfen " + bc.getName() +
                            " yanında süt istiyorsanız Evet, istemiyorsanız Hayır yazın.");
        System.out.print("seçiminiz = ");
        String sut = scanner.nextLine();
        if (sut.equalsIgnoreCase("evet")){
            bc.setSutVarmi(true);
            System.out.println(bc.getName() + " süt ekleniyor... Lütfen bekleyin...");
        } else
            if (sut.equalsIgnoreCase("hayır")){
                bc.setSutVarmi(false);
                System.out.println(bc.getName() + " sütsüz hazırlanıyor...");
            }

        System.out.println(bc.getName() + " şeker ister misiniz? Lütfen şeker istiyorsanız Evet, istemiyorsanız Hayır yazın.");
        System.out.print("seçiminiz = ");
        String seker = scanner.nextLine();
        if (seker.equalsIgnoreCase("evet")){
            System.out.print("kaç şeker istersiniz = ");
            int sekerSayisi = scannerInt.nextInt();
            bc.setSekerSayisi(sekerSayisi);
        } else
            if (seker.equalsIgnoreCase("hayır")){
                bc.setSekerSayisi(0);
                System.out.println(bc.getName() + " Kahveniz şekersiz hazırlanıyor…");
            }

    }

    public static void ozetYaz(BaseCoffee bc){
        if (!bc.isSutVarmi() && bc.getSekerSayisi() > 0)
            System.out.println(bc.getSize() + bc.getName() + " sütsüz ve " + bc.getSekerSayisi() + " küp şekerle hazırlanıyor.");
        else
            if (!bc.isSutVarmi() && bc.getSekerSayisi() == 0)
                System.out.println(bc.getSize() + bc.getName() + " sütsüz ve şekersiz hazırlanıyor.");
            else
                if (bc.isSutVarmi() && bc.getSekerSayisi() > 0)
                    System.out.println(bc.getSize() + bc.getName() + " süt ve " + bc.getSekerSayisi() + " küp şekerle hazırlanıyor.");
                else
                    System.out.println(bc.getSize() + bc.getName() + " sütle hazırlanıyor, şeker ilave edilmeyecek.");
    }
}
