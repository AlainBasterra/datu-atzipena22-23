package dambi.pojoak;


import java.time.LocalDate;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


@XmlType( propOrder = {"mendia", "altuera", "probintzia"})
@XmlRootElement( name = "Mendia")

public class Mendia{

    String mendia;
    int altuera;
    String probintzia;

    //Mendia
    @XmlElement (name= "mendia")
    public void setMendia(String mendia)
    {
        this.mendia = mendia;
    }
    public String getMendia(){
        return mendia;
    }

    //Altuera
    @XmlElement( name = "altuera")
    public void setAltuera (int altuera)
    {
        this.altuera = altuera;
    }
    public int getAltuera(){
        return altuera;
    }

    //Probintzia
    @XmlElement(name = "probintzia")
    public void setProbintzia (String probintzia)
    {
        this.probintzia = probintzia;
    }
    public String getProbintzia(){
        return probintzia;
    }

    @Override
    public String toString()
    {
        String str = ("Mendia: " + getMendia() + " Altuera: " + getAltuera() + " Probintzia: " + getProbintzia());
        return str;
    }


}