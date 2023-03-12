package fp.peliculas;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import fp.utiles.Checkers;
import fp.common.DayOfWeek;

public class pelis implements Comparable<pelis> {

	private String Name;
	private String DirectedBy;
	private String Studio;
	private String TOMATOMETERscore;
	private Integer TOMATOMETERcount;
	private String AUDIENCEscore;
	private Integer AUDIENCEcount;
	private Boolean Gano_oscar;
	private LocalDate Fecha;
	private DayOfWeek dayOfWeek;
	
//Constructor Completo

	public  pelis(String Name, String DirectedBy,
			String Studio, String TOMATOMETERscore, Integer TOMATOMETERcount, 
			String AUDIENCEscore, Integer AUDIENCEcount, Boolean Gano_oscar, LocalDate Fecha) {
		
		

		this.Name = Name;
		this.DirectedBy = DirectedBy;
		this.Studio = Studio;
		this.TOMATOMETERscore = TOMATOMETERscore;
		this.TOMATOMETERcount = TOMATOMETERcount;
		this.AUDIENCEscore = AUDIENCEscore;
		this.AUDIENCEcount = AUDIENCEcount;
		this.Gano_oscar = Gano_oscar;
		this.Fecha = Fecha;
	}		
//Constructor Vacío	
		
	public pelis() {
		
		Name = null;
		DirectedBy = null;
		Studio = null;
		TOMATOMETERscore = null;
		TOMATOMETERcount = null;
		AUDIENCEscore = null;
		AUDIENCEcount = null;

		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDirectedBy() {
		return DirectedBy;
	}

	public void setDirectedBy(String directedBy) {
		DirectedBy = directedBy;
	}

	public String getStudio() {
		return Studio;
	}

	public void setStudio(String studio) {
	Checkers.check("El nombre del estudio debe aparecer", !studio.equals(""));
	}

	public String getTOMATOMETERscore() {
		return TOMATOMETERscore;
	}

	public void setTOMATOMETERscore(String tOMATOMETERscore) {
		TOMATOMETERscore = tOMATOMETERscore;
	}

	public Integer getTOMATOMETERcount() {
		return TOMATOMETERcount;
	}

	public void setTOMATOMETERcount(Integer tOMATOMETERcount) {
	Checkers.check("La valoración no debe ser negativa", tOMATOMETERcount > 0);
	}

	public String getAUDIENCEscore() {
		return AUDIENCEscore;
	}

	public void setAUDIENCEscore(String aUDIENCEscore) {
		AUDIENCEscore = aUDIENCEscore;
	}

	public Integer getAUDIENCEcount() {
		return AUDIENCEcount;
	}

	public void setAUDIENCEcount(Integer aUDIENCEcount) {
		AUDIENCEcount = aUDIENCEcount;
	}

	public Boolean getGano_oscar() {
		return Gano_oscar;
	}

	public void setGano_oscar(Boolean gano_oscar) {
		Gano_oscar = gano_oscar;
	}

	public LocalDate getFecha() {
		return Fecha;
	}

	public void setFecha(LocalDate fecha) {
		Fecha = fecha;
	}

	@Override
	public String toString() {
		return "pelis [Name=" + Name + ", DirectedBy=" + DirectedBy + ", Studio=" + Studio + ", TOMATOMETERscore="
				+ TOMATOMETERscore + ", TOMATOMETERcount=" + TOMATOMETERcount + ", AUDIENCEscore=" + AUDIENCEscore
				+ ", AUDIENCEcount=" + AUDIENCEcount + ", Gano_oscar=" + Gano_oscar + ", Fecha=" + Fecha + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(AUDIENCEcount, AUDIENCEscore, DirectedBy, Fecha, Gano_oscar, Name, Studio, TOMATOMETERcount,
				TOMATOMETERscore);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		pelis other = (pelis) obj;
		return Objects.equals(AUDIENCEcount, other.AUDIENCEcount) && Objects.equals(AUDIENCEscore, other.AUDIENCEscore)
				&& Objects.equals(DirectedBy, other.DirectedBy) && Objects.equals(Fecha, other.Fecha)
				&& Objects.equals(Gano_oscar, other.Gano_oscar) && Objects.equals(Name, other.Name)
				&& Objects.equals(Studio, other.Studio) && Objects.equals(TOMATOMETERcount, other.TOMATOMETERcount)
				&& Objects.equals(TOMATOMETERscore, other.TOMATOMETERscore);
	}

	public int compareTo(pelis o) {
		int r;
		if (o == null) {
			throw new NullPointerException();
		}
		r = getName().compareTo(o.getName());
		if (r == 0) {
			r = getDirectedBy().compareTo(o.getDirectedBy());
			if (r == 0) {
				r = getStudio().compareTo(o.getStudio());
				if (r == 0) {
					r = getTOMATOMETERscore().compareTo(o.getTOMATOMETERscore());
					if (r == 0) {
						r = getTOMATOMETERcount().compareTo(o.getTOMATOMETERcount());
						if (r == 0) {
							r = getAUDIENCEscore().compareTo(o.getAUDIENCEscore());
							if (r == 0) {
								r = getAUDIENCEcount().compareTo(o.getAUDIENCEcount());
								if (r == 0) {
									r = getGano_oscar().compareTo(o.getGano_oscar());
									if (r == 0) {
										r = getFecha().compareTo(o.getFecha());
									}
								}
							}
						}
					}
				}
			}
		}

		return r;
	}
}
