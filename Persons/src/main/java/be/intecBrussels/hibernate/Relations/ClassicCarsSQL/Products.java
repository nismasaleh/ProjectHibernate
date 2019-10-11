package be.intecBrussels.hibernate.Relations.ClassicCarsSQL;

import javax.persistence.*;

@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany
    private ProductLines productLines;


    @Column(name = "ProductCode")
    private String productCode;


    private String productName;
    private String productline;
    private long productScale;
    private String productvendor;
    private String productdescription;
    private long productinStock;
    private double buyPrice;
    private double MSRP;


    public Products() {
    }

    public Products(ProductLines productLines, String productCode, String productName, String productline, long productScale, String productvendor, String productdescription, long productinStock, double buyPrice, double MSRP) {
        this.productLines = productLines;
        this.productCode = productCode;
        this.productName = productName;
        this.productline = productline;
        this.productScale = productScale;
        this.productvendor = productvendor;
        this.productdescription = productdescription;
        this.productinStock = productinStock;
        this.buyPrice = buyPrice;
        this.MSRP = MSRP;
    }

    public int getId() {
        return id;
    }

    public Products setId(int id) {
        this.id = id;
        return this;
    }

    public ProductLines getProductLines() {
        return productLines;
    }

    public Products setProductLines(ProductLines productLines) {
        this.productLines = productLines;
        return this;
    }

    public String getProductCode() {
        return productCode;
    }

    public Products setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public Products setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getProductline() {
        return productline;
    }

    public Products setProductline(String productline) {
        this.productline = productline;
        return this;
    }

    public long getProductScale() {
        return productScale;
    }

    public Products setProductScale(long productScale) {
        this.productScale = productScale;
        return this;
    }

    public String getProductvendor() {
        return productvendor;
    }

    public Products setProductvendor(String productvendor) {
        this.productvendor = productvendor;
        return this;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public Products setProductdescription(String productdescription) {
        this.productdescription = productdescription;
        return this;
    }

    public long getProductinStock() {
        return productinStock;
    }

    public Products setProductinStock(long productinStock) {
        this.productinStock = productinStock;
        return this;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public Products setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
        return this;
    }

    public double getMSRP() {
        return MSRP;
    }

    public Products setMSRP(double MSRP) {
        this.MSRP = MSRP;
        return this;
    }
}
