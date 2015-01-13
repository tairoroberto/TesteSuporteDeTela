package br.com.tairoroberto.testesuportedetela;

/**
 * Created by tairo on 13/01/15.
 */
public class Line {
    private int idImage;
    private String label;

    public Line(int idImage, String label) {
        this.idImage = idImage;
        this.label = label;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
