package Boolean;

public class Main {
    public static void main(String[] args) {
        // Operadores Booleanos | Tabela Verdade
        boolean fimDeSemana = false;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        // Tabela verdade
        // Operador && (AND)
        // true && true = true
        // true &false = false
        // false && true = false
        // false && false = false

        //Operador || (OR)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        System.out.println(vamosAPraia);

        //Operador ternário
        // 1º item lógico avaliada seguido da interrogação
        // 2º valor, caso o item lógico seja verdade
        // 3º valor/comportamento, caso o item lógico seja falso
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
    }
}
