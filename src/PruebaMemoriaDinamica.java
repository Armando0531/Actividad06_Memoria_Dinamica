import java.util.Arrays;


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

public class PruebaMemoriaDinamica {

	public static void main(String[] args) {
		

	}

}
