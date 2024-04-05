public abstract class Persona {
    private String nombre;
    private Boolean ocupado = false;

    public Persona (String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * @return String Devuelve el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Asigna un nombre a la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract void mostrarInfoPersona();

    /**
     * @return Boolean Retorna si la persona está ocupada
     */
    public Boolean isOcupado() {
        return ocupado;
    }

    /**
     * @param ocupado Asigna si la persona está ocupada
     */
    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }
}
