package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultiFuncional mix = new EquipamentoMultiFuncional();

        Impressora impressora = mix;
        impressora.imprimir();
        
        Copiadora copiadora = mix;
        copiadora.copiar();
        
        Digitalizadora digitalizadora = mix;
        digitalizadora.digitalizar();
    }
}
