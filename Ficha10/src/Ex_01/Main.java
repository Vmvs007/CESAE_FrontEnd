package Ex_01;

public class Main {
    public static void main(String[] args) {

        Carro mercedes = new Carro("Mercedes","A45",2022,420,2000,TipoCombustivel.GASOLINA,15.5);
        Carro bmw= new Carro("BMW","M2",2022,400,2000,TipoCombustivel.GASOLINA,16);
        Carro datsun = new Carro("Datsun","1200", 1970,420,2000,TipoCombustivel.GASOLINA,25);
        Carro bugatti = new Carro("Bugatti", "Chiron", 2023, 1500,5000,TipoCombustivel.GASOLINA,30);
        Carro ferrari = new Carro("Ferrari", "812 - Superfast", 2023, 1500, 5500, TipoCombustivel.GASOLINA,28);


        /* Código para ligar carros
        mercedes.ligar();

        System.out.println();

        datsun.ligar();

         */

        /* Código para fazer uma corrida
        Carro vencedor=mercedes.corrida(datsun);

        if(vencedor==null){
            System.out.println("\nEmpate");
        }else{
            System.out.println("\nVencedor: ");
            vencedor.exibirDetalhes();
        }
*/

        // 1º Semifinal
        System.out.println("Corrida 1: ");
        Carro vencedorCorrida1=mercedes.corrida(ferrari);
        vencedorCorrida1.exibirDetalhes();

        // 2º Semifinal
        System.out.println("\nCorrida 2:");
        Carro vencedorCorrida2 = datsun.corrida(bugatti);
        vencedorCorrida2.exibirDetalhes();

        // Final
        System.out.println("\nCorrida Final: ");
        Carro vencedorTorneio= vencedorCorrida1.corrida(vencedorCorrida2);

        if(vencedorTorneio==null){
            System.out.println("\nEmpate");
        }else{
            System.out.println("\nVencedor: ");
            vencedorTorneio.exibirDetalhes();
        }

    }
}
