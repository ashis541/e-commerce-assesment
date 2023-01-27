
package com.learn.ecommerce.entities;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.*;



@Entity
@Table(name = "USERS_PRODUCTS")
public class UserProduct  {
   
    
        @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name = "USER_PRODUCT_ID")
      private int id;
    
    
    
    
   @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "USER_ID")
      private User user;
      
   
    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PRODUCT_ID")
      private Product product;

    private int productQuantity;

    private Timestamp orderTimestamp;
    
    
  

    public Timestamp getOrderTimestamp() {
        return orderTimestamp;
    }

    public void setOrderTimestamp(Timestamp orderTimestamp) {
        this.orderTimestamp = orderTimestamp;
    }
    
    
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

 
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    
    
    
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

   
    
    
    
    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    
    

}
