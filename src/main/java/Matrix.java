public class Matrix {
    public static void main(String[] args) {
        int n = 5;
        int[][] Matrix = new int[n][n];
        int i = 1;
        int x = 0;
        int y = n / 2;
        do {
            Matrix[x][y] = i;
            if (i % n == 0) {
                x++;
                if (x == n) x = 0;
            } else {
                x = x - 1;
                if (x < 0) x = n - 1;
                y = y + 1;
                if (y == n) y = 0;
            }
            i++;
        } while (i <= n * n);
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.printf("%3d", Matrix[j][k]);

            }
            System.out.println();
        }

    }

}
//                                 Output
//      65- hardan hesablasaz 65 cavabini alacaqsiniz. If you calculate from where, you will get the answer 65
//
//                             17 24  1  8 15
//                             23  5  7 14 16
//                    65       4  6 13 20 22        65
//                             10 12 19 21  3
//                             11 18 25  2  9
//
//                                   65
//        Ilk once arraylerin elementlerini n veririk sonra n=5; dedik 7 de ola biler 9 da daha cox reqem
//        hesablayacaq o zaman sonra i deyiskeni elan edirik i dolduracagimiz reqemleridir i-1 den basliyacaq
//        sonra kordinat veririk X=0;dan yeni setr 0 dan Stun Y= n/2 den basliyacaq yeni n-5 dirse /2 den
//        cunki elementler 0 dan basliyir 0,1,2 yeni ortadaki element 2 ci element
//        do while edecik burda i-ni dovr etdirecik i <= n*n mudetde dovr edecek.
//        indi gelek 1-i yerlesdirek Matrix-in[x][y]elementine=i-ni i-dir 1 qoyduq ilk elementi qoyduq
//        novbeti kordinat while yuxari cixanda 2 cini yerlesdirsin eger i%n dirse == 0-a alta kec beraberdirse
//        oldugu setrin altina kececek yeni setri artiracaq x++; artiranda ne ola biler ? setirden asagi dusmusem
//        demekdir n e catmisam demekdir 0-dan 4 e qeder gedecek n-5 dirse en uste cixacaq altindaki doludursa
//        if (x==n)-dirse x = 0; x-i basa at yeni en ust setire cix altina duse bilmirse en ustune cixacaq
//        else deyilse bolunmurse sag uste cix x=x-1; y=y+1 y stun saga gedecek artacaq  setr yuxari cixacaq
//        yeni azalacaq indi serhedleri yoxluyaciq x-1 dedik x-0 in altina duse biler x-0 ola biler 0 dan
//        asagi olmaz o zaman en alta dusecekdi if (x<0)-dirse x =n-1 et 5 elementlidirse 0-dan 4 e qeder gedecek
//        y-nin serheddi y+1 demisik arta arta gedecek o zaman y n-e cata biler yeni 0-dan 4 e qeder gedirse
//        y 5 ola biler if(y==n)-dirse y =0; y en basa gedecek ilk stuna donecek ilk stun 0-ci stundur
//        en sonda i++; i-ni artiririq yeni 1-i yox 2-ni artiraciq i-ni ona gore
//        forlar n-e qeder gedecek System.out.printf("%3",Matrix[j][k]); printf deyirik
//        Eger array 5 elementlidirse bu arryin 1,2,3,4,5  3 cu elemetinden basliyaciq yeni 5 in yarisi 2.5 yeni
//        3 cu elementden basliyacaq hesablamaga y matrix -in tam ortasi goturur 3-cu elementi
//        7 elementlidirse 4-cunu goturecek 9 elementlidirse-5 cini goturecik 3-cu elemente 1 elave edir
//        ve daima dovr etdikce sag uste cixir sag ust ozunen sonra gelen elementin ustu onun ustu bosdur
//        bos olduguna gore oldugu yerin en altina dusur hesablayir y deyismedi x-1 dedi  y+1 dedi
//        setirler X-i ifade edir stunlar Y-ni ifade edir stunu +1 yeni y-ni setir-1 dedi bosluga dusdu
//        bosluga dusduyu ucun oldugu yerin en altina gedir geldi 2 ni qoydu yene sag uste yeni 5 ci elemente
//        dogru +1 oldu 3-u qoydu ora yene sag uste dogru bosluqdur bosluq oldugu ucun en basa gedir sola dogru
//        4-u qoydu ora burdan yene sag uste dogru stun+1 ve setir-1 geldi 5-i qoydu ora
//        her defe X=X-1 ve Y=Y+1 olur Qayda budur x de serhedden cixsa x-in basina gedir
//        yeni x-de serhedden cixmaq 0-a dusmek demekdir eger Y-de serhedden cixsa bu defe Y-ni 0 edir
//        5 den geldi sag uste orda 1 var ora doludu doludursa 5 oz altina kecir altina yazir 6-ni
//        yene sag uste 7 sag uste 8 yene sag uste 5 ci elementin bas hissesi bosdur bosdursa 5-ci elementin
//        en altina dusur 9 qoyduq sag ustu bosluqdur bosluqdursa en basha kecir 10 sag uste doludur doludursa
//        alta kecir 11 qoyur ora sag ust 12 sag ust 13 sag ust 14 sag ust 15 sag ust bosluq oldugu yerin altina
//        kecir 5 ci elementin altina 16 qoydu sag ustu bosluq hemin sag ustun setirinin basina gedir 17 qoydu
//        17 sag ust bosluq dusdu en alta 18 sag ust 19 sag ust 20 sag ust doludur doludursa oz altina altina
//        21 sag ust 22 sag ust bosluq ustundeki setrin en basina 23 sag ust 24 sag ust bosluq en asagi dusdu 25
//        doludursa alta kecirin 2-ci varianti ozunen sag ustu doludursa onu N olaraq gotururuk
//        direkt olaraq N den sonra alta kecir geldi 1 -ci 5-tapdi sonra dovr getdi 10-u tapdi 10 N-in 2 qatidir
//        N-e bolune bilen reqemdir kecdi alta dovr getdi tapdi 15-i 15 N-e bolunen reqemdir yeni 5-3 kecdi altina
//        dovr getdi 20 N-e bolunen reqemdir 20/N= 0; dovr getdi en sonda 25
//        Matrix-de Qanun budur hardan hesablasan sagdan soldan asagi yuxari eyni reqemi alirsan cemde
//        ve reqemler tekrarlanmir hec bir halda

