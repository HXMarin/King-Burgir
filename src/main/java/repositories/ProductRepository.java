package repositories;
import java.util.ArrayList;

public class ProductRepository<P extends IProductRepository> extends ArrayList<P>{

    public void añadir(P elem){
       this.add(elem);
   }
   public boolean isVacio(){
        return this.isEmpty();
   }
   public void vaciar(){
        this.clear();
   }
   public void sacar(){
        this.remove(this.size()-1);
   }
   public P actualizar(P product){
    var index = this.indexOf(product.getId());
    if (index >= 0){
        this.set(index,product);
        return this.get(index);
    }
    return null;
   }
}
