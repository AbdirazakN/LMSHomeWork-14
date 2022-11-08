public class Main {
    public static void main(String[] args) {

        //БУЛ ТАПШЫРМАДА PERSON ДЕГЕН КЛАСС ТУЗОСУЗДОР.ПОЛЕЛЕРИН ЖАНА МЕТОДТОРУН СУРОТТО КОРСОТУЛГОНДОЙ
        //КЫЛЫП  ТУЗОСУЗДОР.АЛ КЛАССТЫ 3 БАШКА КЛАСС МУРАСТАШЫ  КЕРЕК.АЛ 3 КЛАССТЫН ОЗДОРУНУН УНИКАЛДУУ ПОЛЕЛЕРИ ЖАНА
        //МЕТОДТОРУ БАР СУРОТТОГУДОЙ.КОНСТРУКТОР ТУЗОСУЗДОР ЖАНА ОЗДОРУНУН УНИКАЛДУУ МЕТОДТОРУН ДА ТУЗОСУЗДОР.
        //МЕЙН МЕТОДКО 3 КЛАССТЫН ОБЪЕКТИЛЕРИН ТУЗОСУЗДОР, ПОЛЕЛЕРИНЕ КОНСТРУКТОР МЕНЕН МААНИ БЕРИП,
        //КОНСОЛГО TOSTRING() МЕТОДУН КОЛДОНУП МААЛЫМАТТАРЫН  ЧЫГАРЫНЫЗДАР.

        Programmer programmer = new Programmer("Asylbek","Student","Apple");
        Dancer dancer = new Dancer("Dima","Dancer","Dance-3");
        Singer singer = new Singer("Niyaz","Singer","Niyaz Abdrazakov");

        System.out.println(programmer.toString());
        System.out.println(dancer.toString());
        System.out.println(singer.toString());


    }



    }