import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CasaInteligente {
    private Map<String, SmartDevice> devices;
    private Map<String, Set<String>> devicesPorDivisao;

    public CasaInteligente(Collection<SmartDevice> devices) {
        this.devices = new HashMap<>();
        this.devicesPorDivisao = new HashMap<>();
        for (SmartDevice device :devices) {
            this.devices.put(device.getId(), device.clone());
        }
    }

    public void remove(String id) throws DeviceNotFoundException {
        if (!this.devices.containsKey(id)) {
            throw new DeviceNotFoundException("Device not found: " + id);
        }
        
        this.devices.remove(id);
        for (Set<String> devices : this.devicesPorDivisao.values()) {
            devices.remove(id);
        }
    }

    public Iterator<SmartDevice> devicesPorConsumoCrescente(){
        return this.devices.values().stream()
            .map(SmartDevice::clone)
            .sorted()
            .Iterator();
    }

    public String divisaoMaisEconomica() {
        return this.devicesPorDivisao.entrySet().stream()
            .map(entry -> Map.Entry(entry.getKey(),
                entry.getValue().stream()
                    .map(this.devices::get)
                    .mapToDouble(SmartDevice::totalConsumo)
                    .sum()))
            .min(Comparator.comparingDouble(Map.Entry::getValue))
            .map(Map.Entry::getKey)
            .orElse(null);
    }
}


public Hotel (IteratorQuarto quartos){
    this.quartos = new HashMap<>();
    while (quartos.hasNext()) {
        Quarto q = quartos.next();
        this.quartos.put(q.getId(), q);
    }
}

public void adicionaRegisto (LocalDate entrada, LocalDate saida, String numQuarto){
    if (this.quartos.containsKey(numQuarto)) {
        Quarto q = this.quartos.get(numQuarto);
        Registo r = new Registo(entrada, saida, q);
        q.adicionaRegisto(r);
    } else {
        throw new QuartoInexistenteException("Quarto não existe: " + numQuarto);
        
    }
}

public List<String> hoteisMaisOcupados() {
    int count = 0;
    boolean flag = true;
    while (flag &&) {
        count++;
        if (count == 3) {
            flag = false;
        }

        
        
    }
}