class Main {
    public static void main(String[] args){

        Lista l1 = new Lista();

        l1.aggiungiTesta(10);
        l1.aggiungiTesta(17);

        System.out.println(l1);

        //System.out.println(l1.tuttoPari());

        //System.out.println(l1.cerca(10));

        //l1.togliTesta();

        l1.removeIndex(10);

        System.out.println(l1);
    }
}
