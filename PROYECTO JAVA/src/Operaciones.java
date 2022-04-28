
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

class Operaciones {

    public Persona objeto[];
    int borrar, f;
    List<Persona> personas = new ArrayList<Persona>();
    

    public void crear() {
        f = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de personas"));
        objeto = new Persona[f];

    }

    public void llenar() {
        for (int i = 0; i < objeto.length; i++) {
            String Nombre = (JOptionPane.showInputDialog("Ingrese Nombre:"));
            int Documento = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese Documento:")));
            char Sexo = (JOptionPane.showInputDialog("Ingrese Genero:").charAt(0));
            objeto[i] = new Persona(Nombre, Documento, Sexo);
            Persona per = new Persona(Nombre, Documento, Sexo);
            personas.add(per);
            
        }
    }

    public void MostrarDatos() {
        int v = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valor para Recorrer arreglo: \n1.Adelante\n2.Atras"));
        switch (v) {
            case 1:   // recorrer hacia adelante
                for (Persona objeto1 : objeto) {
                    JOptionPane.showMessageDialog(null, "Nombre: " + objeto1.getNombre() + "\nDocumento:" + objeto1.getDocumento() + "\nGenero:" + objeto1.getSexo());
                }
                break;
            case 2: // recorrer hacia atras
                for (int i = objeto.length - 1; i >= 0; i--) {
                    JOptionPane.showMessageDialog(null, "Nombre: " + objeto[i].getNombre() + "\nDocumento:" + objeto[i].getDocumento() + "\nGenero:" + objeto[i].getSexo());
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingrese valor valido");
                break;
        }
    }

    public void primero_ultimo() {
        int pu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valor: \n1.Primero\n2.Ultimo"));
        switch (pu) {
            case 1:
                for (int i = 0; i < 1; i++) {
                    JOptionPane.showMessageDialog(null, "Nombre: " + objeto[i].getNombre());
                }
                break;
            case 2:
                for (int i = objeto.length - 1; i + 1 >= objeto.length; i--) {
                    JOptionPane.showMessageDialog(null, "Nombre: " + objeto[i].getNombre());
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingrese valor valido");
                break;
        }
    }

   
    public void Buscar() {
        int bus;
        boolean encontrado = false;
        bus = Integer.parseInt(JOptionPane.showInputDialog("Ingrese documento que desea buscar"));
        for (int i = 0; i < objeto.length; i++) {
            if (objeto[i].getDocumento() == (bus)) { // LO QUE HACE ES IR A CADA POSICION Y BUSCAR, POSICION POR POSICION Y BUSCAR LA PERSONA, YO QUIERO QUE ME LO BUSQUE DIRECTAMENTE 
                JOptionPane.showMessageDialog(null, "***********ENCONTRADO*********** POSICION (" + i + ")");
                if (i == 0) {
                    
                    JOptionPane.showMessageDialog(null, "no hay nadie atras");
                } else {
                    JOptionPane.showMessageDialog(null, objeto[i - 1].getNombre() + "Esta atras");
                }

                if (i == objeto.length - 1) {
                   
                    JOptionPane.showMessageDialog(null, "no hay nadie adelante");
                } else {
                    JOptionPane.showMessageDialog(null, objeto[i + 1].getNombre() + "Esta adelante");
                }
                encontrado = true;
            }
       
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "***********NO ENCONTRADO*********");
        }
    }

    public Boolean Borrar() {
        int doc = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el documento de la persona que desea eliminar"));
        for (int i = 0; i < objeto.length; i++) {
            if (objeto[i].getDocumento() == doc) {
                JOptionPane.showMessageDialog(null, "La persona que desea eliminar es : " + objeto[i].getNombre() + "\nGenero: " + objeto[i].getSexo());
                objeto[i].setDocumento(0);
                objeto[i].setNombre(null);
                objeto[i].setSexo('0');
                return true;
            }

        }

        return false;

    }
 
    public void ordenar() {
        
        Collections.sort(personas);
      
        for (Persona objeto1 : personas) {
            JOptionPane.showMessageDialog(null,objeto1.getNombre());
          }
          
        }
    
   }

