class Persona implements Comparable<Persona> {
    private String nombre;
    private char sexo;
    private int documento;
  
   
     public Persona (String Nombre,int Documento, char Sexo){
            nombre= Nombre;
            sexo= Sexo;
            documento = Documento;
        }
   
     
   public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }
  

    @Override
    public int compareTo(Persona t) {
         int result = 0;
        if (!this.equals(t)) {
            if (t instanceof Persona) {
                Persona persona = (Persona) t;
                if (this.getNombre().compareTo(persona.getNombre()) < 0) {
                    result = -1;
                } else if (this.getNombre().compareTo(persona.getNombre()) > 0) {
                    result = 1;
                }
            }
        }
        return result;
    }

    
}
