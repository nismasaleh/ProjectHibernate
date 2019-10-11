package be.intecBrussels.hibernate.Relations.ClassicCarsSQL;


import javax.persistence.*;
import java.util.Arrays;

@Entity
public class ProductLines {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public ProductLines() {
    }

    public ProductLines(Products protects, String productLine, String textDescription, byte[] image, String htmlDescription) {
        this.protects = protects;
        this.productLine = productLine;
        this.textDescription = textDescription;
        this.image = image;
        this.htmlDescription = htmlDescription;
    }

    @ManyToOne
    private Products protects;
    @Column(name = "ProductLine",length = 50,nullable = true)
    private String productLine;
    @Column(name = "TextDescription",length = 4000,nullable = true)
    private String textDescription;


    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "PICTURE")
    private byte[]image;

    @Column(name ="HOMEPAGE", table = "URLS")
    private String htmlDescription;

    public Products getProtects() {
        return protects;
    }

    public ProductLines setProtects(Products protects) {
        this.protects = protects;
        return this;
    }

    public String getProductLine() {
        return productLine;
    }

    public ProductLines setProductLine(String productLine) {
        this.productLine = productLine;
        return this;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public ProductLines setTextDescription(String textDescription) {
        this.textDescription = textDescription;
        return this;
    }

    public byte[] getImage() {
        return image;
    }

    public ProductLines setImage(byte[] image) {
        this.image = image;
        return this;
    }

    public String getHtmlDescription() {
        return htmlDescription;
    }

    public ProductLines setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
        return this;
    }

    @Override
    public String toString() {
        return "ProductLines{" +
                "protects=" + protects +
                ", productLine='" + productLine + '\'' +
                ", textDescription='" + textDescription + '\'' +
                ", image=" + Arrays.toString(image) +
                ", htmlDescription='" + htmlDescription + '\'' +
                '}';
    }
}
