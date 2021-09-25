import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;

class Aspirante{
	private int folio;
	private String Nombre;
	private byte edad;
	private String redesSociales[];
	
	public Aspirante(int folio, String nombre, byte edad, String[] redesSociales) {
		this.folio = folio;
		Nombre = nombre;
		this.edad = edad;
		this.redesSociales = redesSociales;
	}
	
	
	public int getFolio() {
		return folio;
	}
	public void setFolio(int folio) {
		this.folio = folio;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public String[] getRedesSociales() {
		return redesSociales;
	}
	public void setRedesSociales(String[] redesSociales) {
		this.redesSociales = redesSociales;
	}


	
	@Override
	public String toString() {
		return "Aspirante [folio=" + folio + ", Nombre=" + Nombre + ", edad=" + edad + ", redesSociales="
				+ Arrays.toString(redesSociales) + "]";
	}
	
	
}


class RegistroAspirantes {
	
	ArrayList listaAspirantes;
	private int nFolio=1;
	
	public int getnFolio() {
		return nFolio;
	}
	public void setnFolio(int nFolio) {
		this.nFolio = nFolio;
	}
	
	public RegistroAspirantes() {
		listaAspirantes = new ArrayList();
	}
	public void agregarAspirante(Aspirante a) {
		this.setnFolio(this.getnFolio()+1);
		listaAspirantes.add(a);
	}
	public Object eliminarAspirante(String folio) {
		this.setnFolio(this.getnFolio()-1);
		return listaAspirantes.remove(listaAspirantes.size()-1);
	}
	public void mostrarAspirantes() {
		Iterator i = listaAspirantes.iterator();
		while(i.hasNext()) {
			Aspirante a = (Aspirante) i.next();
			System.out.println(a);
		}
	}	
}



public class PruebaMemoriaDinamica {

	public static void main(String[] args) {
		

	}

}
