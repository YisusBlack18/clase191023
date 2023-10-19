// Paso 1: Crear la interfaz del producto
interface Cafe {
    String getDescripcion();
    double getCosto();
}
// Paso 2: Implementar productos concretos
class CafeSimple implements Cafe {
    @Override
    public String getDescripcion() {
        return "Café simple";
    }
    @Override
    public double getCosto() {
        return 50;
    }
}

class CafeConLeche implements Cafe {
    @Override
    public String getDescripcion() {
        return "Café con leche";
    }
    @Override
    public double getCosto() {
        return 60;
    }
}

class CafeMocha implements Cafe {
    @Override
    public String getDescripcion() {
        return "Café mocha";
    }
    @Override
    public double getCosto() {
        return 70;
    }
}

class CafeCaramelo implements Cafe {
    @Override
    public String getDescripcion() {
        return "Café caramelo";
    }
    @Override
    public double getCosto() {
        return 80;
    }
}

// Paso 3: Crear la interfaz Factory
interface CafeFactory {
    Cafe crearCafe();
}

// Paso 4: Implementar factories concretos
class CafeSimp1eFactory implements CafeFactory {
    @Override
    public Cafe crearCafe() {
        return new CafeSimple();
    }
}

class CafeConLecheFactory implements CafeFactory {
    @Override
    public Cafe crearCafe() {
        return new CafeConLeche();
    }
}

class CafeMochaFactory implements CafeFactory {
    @Override
    public Cafe crearCafe() {
        return new CafeMocha();
    }
}

class CafeCarameloFactory implements CafeFactory {
    @Override
    public Cafe crearCafe() {
        return new CafeCaramelo();
    }
}


public class Cafeteria {
    public static void main(String[] args) throws Exception {
        CafeFactory factory = new CafeCarameloFactory();
        Cafe cafe = factory.crearCafe();
        System.out.println(cafe.getDescripcion() + " - Precio: $" + cafe.getCosto());
        
    }
}
